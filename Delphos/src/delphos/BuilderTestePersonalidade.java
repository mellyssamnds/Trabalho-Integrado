/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package delphos;

/**
 *
 * @author Jennifer
 */
public class BuilderTestePersonalidade {
    private Usuario usuario;
    private Pergunta pergunta;
    private Resposta resposta;
    private TestePersonalidade teste;
    
    public BuilderTestePersonalidade(Usuario usuario,Pergunta pergunta, Resposta resposta){
        this.usuario = usuario;
        this.pergunta = pergunta;
        this.resposta = resposta;
        
        
        
    }
    
    /*tarefas*/
    /*public Pergunta criarPergunta(){}*/
    
    /*public Resposta criarResposta(){}*/
    
    /*public void registraData()*/
    
    public void preencheDadosUsuario(){
        teste.setUsuario(usuario);
        
    }
    
    
    
}
