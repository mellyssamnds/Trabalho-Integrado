/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

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
    }
    
    /*registra hora e data da realização do teste*/
    public void registraData(){
        
         
        Date date = new Date(); 
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        dateFormat.format(date);/*persistir esse formato no banco*/
    
    }
    
    public void QualUsuario(){
        
        /*o usuario já está persistido no banco*/
        /*esse metodo faz a busca do usuario passado como parametro no banco*/
        
    }
    
    public void ResgataPerguntas(){
        /*utilização do padrão peso mosca para resgatar as pergundas no banco e exibi-las*/ 
    }
    
    
    
}
