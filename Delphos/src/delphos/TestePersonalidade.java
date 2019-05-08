/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package delphos;

import java.util.*;

/**
 *
 * @author Jennifer
 */
public class TestePersonalidade {
    private int IdTeste;
    private Date data_hora;
    private Usuario usuario;
    private Pergunta pergunta;
    private Resposta resposta;

    public int getIdTeste() {
        return IdTeste;
    }

    public void setIdTeste(int IdTeste) {
        this.IdTeste = IdTeste;
    }

    public Date getData_hora() {
        return data_hora;
    }

    public void setData_hora(Date data_hora) {
        this.data_hora = data_hora;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Pergunta getPergunta() {
        return pergunta;
    }

    public void setPergunta(Pergunta pergunta) {
        this.pergunta = pergunta;
    }

    public Resposta getResposta() {
        return resposta;
    }

    public void setResposta(Resposta resposta) {
        this.resposta = resposta;
    }
    
    
    
    public void calculaResultado(ArrayList<Resposta> respostas){
        
        /*Pega as respostas, percorre a lista e vai separando o calculo pela categoria*/
        
        int notaExt = 20; /*variável que guarda os valores de extroversão*/
        int notaAgr = 14;
        int notaEst = 38;
        int notaOpn = 8;
        int notaCsn = 14;
                
        
        for(Resposta auxresposta: respostas){
            
            switch(ArrayList<auxresposta>.getCategoria()){

                case 'E':
                    /*NotaExt = 20 + EXT1 - EXT2 + EXT3 - EXT4 + EXT5 - EXT6 + EXT7 - EXT8 + EXT9 - EXT10*/
                    notaExt += ArrayList<auxresposta>.getResposta();
                    break;

                case 'A':
                    /*14 - AGR1 + AGR2 - AGR3 + AGR4 - AGR5 + AGR6 - AGR7 + AGR8 + AGR9 + AGR10*/
                    notaAgr += ArrayList<auxresposta>.getResposta();
                    break;
                
                case 'O':
                    /*8 + OPN1 - OPN2 + OPN3 - OPN4 + OPN5 + OPN6 + OPN7 + OPN8 + OPN9 + OPN10*/
                    notaOpn += ArrayList<auxresposta>.getResposta();
                    break;
                    
                case 'C':
                    /*14 + CSN1 - CSN2 + CSN3 - CSN4 + CSN5 - CSN6 + CSN7 - CSN8 + CSN9 + CSN10*/
                    notaCsn += ArrayList<auxresposta>.getResposta();
                    break;
                    
                case 'T':
                    /*NotaEst = 38 - EST1 + EST2 - EST3 + EST4 - EST5 - EST6 - EST7 - EST8 - EST9 - EST10*/
                    notaEst += ArrayList<auxresposta>.getResposta();
                    break;
            }       
                
                
                


        }

    }
    
    
    
}
