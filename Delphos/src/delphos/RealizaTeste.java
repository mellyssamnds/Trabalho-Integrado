/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package delphos;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RealizaTeste {
	
	/* metodo para realizar o teste personalidade */
	public HashMap<String, Integer> realizaTeste(HashMap<String, String> dicP) {
		
		/* cria um dicionario para guardar as respostas dadas na realizacao do teste */
		HashMap<String, Integer> listaRespostas = new HashMap<String, Integer>();
		/* instancia uma Resposta - gabarito 
		Resposta gabarito = new Resposta();*/
		/* para a leitura do teclado */
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Vamos iniciar o teste de personalidade!!!");
		System.out.println("Lembre-se que as respostas são dadas de acordo com o seguinte gabarito:\n"
							+ "1: Discordo totalmente\n"
							+ "2: Discordo parcialmente\n"
							+ "3: Neutro\n"
							+ "4: Concordo parcialmente\n"
							+ "5: Concordo totalmente\n\n");
		
		for(Map.Entry<String, String> entry : dicP.entrySet()) {
			int resp = 0;
			String key = entry.getKey();
		    String value = entry.getValue();
			System.out.println(key + "  " + value);
			System.out.printf("Resposta: ");
			resp = ler.nextInt();
			
			listaRespostas.put(key, resp);
			
		}
		ler.close();
		
		return listaRespostas;
	}

}