/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package delphos.model.cdp;

import java.util.HashMap;

/**
 *
 * @author Jennifer
 */
public class DiretorTestePersonalidade {
    
    public DiretorTestePersonalidade(){
    }
    
    public TestePersonalidade builder(Usuario cliente, HashMap<String, String> perguntas, HashMap<String,Integer> respostas) throws Exception{
        
        TestePersonalidade testeP = new TestePersonalidade(); //estava reclamando que precisava ser inicializado
        BuilderTestePersonalidade builder = new BuilderTestePersonalidade(cliente,perguntas,respostas);
        
        /*adicionar a sequência de tarefas*/
        
         //verifica se o cliente é cadastrado ou não
        builder.VerificaUsuario();
        //preenche as respostas do cliente
        builder.preencheRespostas(perguntas);
        //testeP.setListaRespostas(respostas);
        //registra data do teste
        builder.registraData();
        //Preenche o objeto teste com os dados retornados pelos métodos anteriores
        return builder.montarTestePersonalidade(testeP);
    }
}
