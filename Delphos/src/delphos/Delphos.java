/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package delphos;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Jennifer, Anne
 */
public class Delphos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	
    	/* inicializa as perguntas */
		Pergunta todasPerguntas = new Pergunta();
		/* cria um dicionario com chave:ID_Pergunta e valor:DescricaoPergunta */
		HashMap<String, String> dicP = todasPerguntas.ListaPerguntas();
		
		/* teste que imprime todas as perguntas com seus respectivos IDs */
		for(Map.Entry<String, String> entry : dicP.entrySet()) {
			String key = entry.getKey();
		    String value = entry.getValue();
			System.out.println(key + "  " + value);
		}
    	
    }
    
}
