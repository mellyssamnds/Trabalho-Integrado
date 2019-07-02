/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import delphos.model.cdp.Usuario;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import delphos.model.cgd.UsuarioDAOImpl;

/**
 *
 * @author Jennifer
 */
public class ControleTela {
    
    public static boolean cadastrarUsuario(Usuario p) throws ParseException, SQLException, ClassNotFoundException {

        UsuarioDAOImpl<Usuario> dao = new UsuarioDAOImpl<>();

        return dao.insert(p);
    }
    
    public static void atualizaDadosUsuario(Usuario p) throws ParseException, SQLException, ClassNotFoundException {

        UsuarioDAOImpl<Usuario> dao = new UsuarioDAOImpl<>();

        dao.update(p);
    }
    
    public Usuario leDadosUsuario() throws ParseException, SQLException, ClassNotFoundException{
        
        Usuario usuario = new Usuario();
        Scanner ler = new Scanner(System.in);
   
        System.out.println("E-mail:");
        String bufferLeitura = ler.nextLine();
        usuario.setEmail(bufferLeitura);
        
        System.out.println("DataNascimento:");
        bufferLeitura = ler.nextLine();
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");  
	usuario.setDataNascimento(df.parse(bufferLeitura));
        
        System.out.println("nome:");
        bufferLeitura = ler.nextLine();
        usuario.setNome(bufferLeitura);
        
        System.out.println("cpf:");
        bufferLeitura = ler.nextLine();
        usuario.setCpf(bufferLeitura);
        
        System.out.println("senha:");
        bufferLeitura = ler.nextLine();
        usuario.setSenha(bufferLeitura);
        
        
        
        return usuario;
    }

    public HashMap<String, Integer> realizaTeste(HashMap<String, String> dicP) {
		
		/* cria um dicionario para guardar as respostas dadas na realizacao do teste */
		HashMap<String, Integer> listaRespostas = new HashMap<>();
		/* instancia uma Resposta - gabarito 
		Resposta gabarito = new Resposta();*/
		/* para a leitura do teclado */
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Vamos iniciar o teste de personalidade!!!");
		System.out.println("Lembre-se que as respostas sao dadas de acordo com o seguinte gabarito:\n"
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

