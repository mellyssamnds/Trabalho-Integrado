/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.Date;
import java.util.HashMap;
import view.ControleTela;

/**
 *
 * @author Jennifer
 */
public class BuilderTestePersonalidade{
    private Cliente cliente;
    private HashMap<String,Integer> respostas;
    private HashMap<String,String> perguntas;
    private Date dataHora;
    
    
    public BuilderTestePersonalidade(Cliente cliente, HashMap<String, String> perguntas, HashMap<String,Integer> respostas){
        this.cliente = cliente;
        this.perguntas = perguntas;
        this.respostas = respostas;
        
    }
    
    /*tarefas*/
    
    public void preencheRespostas(HashMap<String, String> perguntas){
        ControleTela tela = new ControleTela();
        this.respostas = tela.realizaTeste(perguntas);/*armazena na variável declarada do builder*/
    }
    
    /*registra hora e data da realização do teste*/
    public void registraData(){
        Date date = new Date();
        this.dataHora = date;
        //DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        //this.dateFormat.format(date);
    }
    
    public void VerificaUsuario() throws ParseException, SQLException, ClassNotFoundException{
        /*chama o cadastro*/
        
        
    }
    
    //adiciona todos os atributos preenchidos em teste e guarda os valores no banco
    public TestePersonalidade montarTestePersonalidade(TestePersonalidade testeP){
        //testeP = new TestePersonalidade(this.cliente,this.respostas,this.dataHora);
        
        testeP.setIdTeste(IdGeneratorSingleton.getInstance().getNextSerial());
        testeP.setCliente(this.cliente);
        testeP.setListaRespostas(this.respostas);
        testeP.setDataHora(this.dataHora);
        
        return testeP;
        
    }
    
}
