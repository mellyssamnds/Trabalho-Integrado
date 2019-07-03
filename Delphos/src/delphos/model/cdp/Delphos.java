/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package delphos.model.cdp;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;
import view.ControleTela;
import static view.ControleTela.atualizaDadosUsuario;
import static view.ControleTela.cadastrarUsuario;

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
                Usuario usuario = new Usuario();
                
                ControleTela c = new ControleTela();
                usuario = c.leDadosUsuario();
               cadastrarUsuario(usuario);
               //atualizaDadosUsuario(usuario);
                
                /* inicializa as perguntas */
		Pergunta todasPerguntas = new Pergunta();
		
                /* cria um dicionario com chave:ID_Pergunta e valor:DescricaoPergunta */
		HashMap<String, String> perguntas = todasPerguntas.listarPerguntas();
               
                /* cria um dicionario para armazenar as respostas */
                HashMap<String, Integer> respostas = new HashMap<>();
                
                
                DiretorGabarito CriaTesteP = new DiretorGabarito();
                Gabarito testeP = CriaTesteP.builder(usuario, perguntas, respostas);
                
                //System.out.println(testeP.exibeRespostasStr()); 
                
                
		 //teste que imprime todas as respostas com seus respectivos IDs 
		for(Map.Entry<String, Integer> entry : testeP.getListaRespostas().entrySet()) {
		String key = entry.getKey();
		    Integer value = entry.getValue();
			System.out.println(key + "  " + value);
		}
                
                /* Cálculo dos resultados */
                HashMap<String, Integer> listaResultado = new HashMap<>();
                listaResultado = testeP.calculaResultado(testeP.getListaRespostas());
                System.out.println(testeP.exibeResultadoStr()); 
                
                

		
                
    }
}
