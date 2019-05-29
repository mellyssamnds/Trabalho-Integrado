/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.HashMap;
import view.ControleTela;

/**
 *
 * @author Jennifer, Anne
 */
public class Delphos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException, SQLException, ClassNotFoundException, Exception {
		
                /*chama o cadastro*/
                Cliente cliente;
                ControleTela c = new ControleTela();
                cliente = c.leDadosUsuario();
                
                /* inicializa as perguntas */
		Pergunta todasPerguntas = new Pergunta();
		/* cria um dicionario com chave:ID_Pergunta e valor:DescricaoPergunta */
		HashMap<String, String> perguntas = todasPerguntas.listarPerguntas();
               
                /* cria um dicionario para armazenar as respostas */
                HashMap<String, Integer> respostas = new HashMap<>();
                
                
                DiretorTestePersonalidade CriaTesteP = new DiretorTestePersonalidade();
                TestePersonalidade testeP = CriaTesteP.builder(cliente, perguntas, respostas);
                
                System.out.println(testeP.exibeRespostasStr()); 
                
                
		 //teste que imprime todas as respostas com seus respectivos IDs 
//		for(Map.Entry<String, Integer> entry : testeP.getListaRespostas().entrySet()) {
//		String key = entry.getKey();
//		    Integer value = entry.getValue();
//			System.out.println(key + "  " + value);
//		}
                
                /* Cálculo dos resultados */
                HashMap<String, Integer> listaResultado = new HashMap<>();
                listaResultado = testeP.calculaResultado(testeP.getListaRespostas());
                System.out.println(testeP.exibeResultadoStr()); 
                
                

		
                
    }
}
