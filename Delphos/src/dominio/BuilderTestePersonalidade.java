/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;
import view.ControleTela;

/**
 *
 * @author Jennifer
 */
public class BuilderTestePersonalidade{
    private Usuario usuario;
    private Pergunta pergunta;
    private Resposta resposta;
    //private TestePersonalidade teste;
    
    public BuilderTestePersonalidade(Usuario usuario, Pergunta pergunta, Resposta resposta){
        this.usuario = usuario;
        this.pergunta = pergunta;
        this.resposta = resposta;
        
    }
    
    /*tarefas*/
    
    public void preencheRespostas(){
    
        /*recebe a lista de resposta e persiste no banco de dados */
        //HashMap<String, Integer> dicR = c.realizaTeste(dicP);        
	//TestePersonalidade testeP = new TestePersonalidade(usuario);
        //testeP.calculaResultado(dicR);
        //System.out.println(testeP.exibeResultadoStr());          
    }
    
    /*registra hora e data da realização do teste*/
    public void registraData(){
        Date date = new Date(); 
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        dateFormat.format(date);/*persistir esse formato no banco*/
    
    }
    
    public void CriaUsuario() throws ParseException, SQLException, ClassNotFoundException{
        /*chama o cadastro*/
        ControleTela c = new ControleTela();
        this.usuario = c.leDadosUsuario();
        
    }
    
    public void ResgataPerguntas(){
        /* inicializa as perguntas */
        Pergunta todasPerguntas = new Pergunta();
        /* cria um dicionario com chave:ID_Pergunta e valor:DescricaoPergunta */
	HashMap<String, String> dicP = todasPerguntas.listaPerguntas();
    }
    
    
    
}
