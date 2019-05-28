/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

/**
 *
 * @author Jennifer
 */
public class DiretorTestePersonalidade {
    
    public DiretorTestePersonalidade(){
    }
    
    public TestePersonalidade builder(Usuario usuario, Pergunta pergunta, Resposta resposta) throws Exception{
        
        TestePersonalidade testeP = new TestePersonalidade();
        BuilderTestePersonalidade builderTestePersonalidade = new BuilderTestePersonalidade(usuario,pergunta,resposta);
        
        /*adicionar a sequência de tarefas*/
        
        builderTestePersonalidade.ResgataPerguntas();
        //cadastra o cliente
        builderTestePersonalidade.CriaUsuario();
        //registra data do teste
        builderTestePersonalidade.registraData();
        //preenche as respostas do usuario
        builderTestePersonalidade.preencheRespostas();
        
        
        return testeP;
    }
}
