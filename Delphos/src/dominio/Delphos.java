/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;
import view.VisaoUsuario;

/**
 *
 * @author Jennifer, Anne
 */
public class Delphos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException, SQLException, ClassNotFoundException {
        
        /* inicializa as perguntas */
		//Pergunta todasPerguntas = new Pergunta();
		/* cria um dicionario com chave:ID_Pergunta e valor:DescricaoPergunta */
		//HashMap<String, String> dicP = todasPerguntas.ListaPerguntas();
		
		/* teste que imprime todas as perguntas com seus respectivos IDs
		System.out.println("Teste que imprime IDs e Descri��o da pergunta");
		for(Map.Entry<String, String> entry : dicP.entrySet()) {
			String key = entry.getKey();
		    String value = entry.getValue();
			System.out.println(key + "  " + value);
		}*/
    	
		/* Op��o do Menu: Realiza teste */
		//RealizaTeste novoTeste = new RealizaTeste();
		//HashMap<String, Integer> dicR = novoTeste.realizaTeste(dicP);
		
		/* teste que imprime todas as respostas com seus respectivos IDs 
		for(Map.Entry<String, In		
teger> entry : dicR.entrySet()) {
			String key = entry.getKey();
		    Integer value = entry.getValue();
			System.out.println(key + "  " + value);
		}*/
		
                VisaoUsuario v = new VisaoUsuario();
                v.mensagemInicial();
    }
}
