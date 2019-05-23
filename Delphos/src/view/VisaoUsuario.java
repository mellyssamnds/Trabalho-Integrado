/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dominio.*;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import persistencia.UsuarioDAOImpl;

/**
 *
 * @author Jennifer
 */
public class VisaoUsuario {
    
    public void mensagemInicial() throws ParseException, SQLException, ClassNotFoundException{
        
        Usuario usuario = new Usuario();
        Scanner ler = new Scanner(System.in);
   
        System.out.println("E-mail:");
        ler.nextLine();
        usuario.setEmail(ler.toString());
        
        System.out.println("DataNascimento:");
        String s = ler.nextLine();
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");  
	usuario.setDataNascimento(df.parse(s));
        
        System.out.println("nome:");
        ler.nextLine();
        usuario.setNome(ler.toString());
        
        System.out.println("cpf:");
        ler.nextLine();
        usuario.setCpf(ler.toString());
        System.out.println("senha:");
        ler.nextLine();
        usuario.setSenha(ler.toString());
        
        
        boolean p = cadastrarUsuario(usuario);
        System.out.println("deu certo " + p);
    }  
        
    /*Se não estiver cadastrado*/

    public static boolean cadastrarUsuario(Usuario p) throws ParseException, SQLException, ClassNotFoundException {

        UsuarioDAOImpl<Usuario> dao = new UsuarioDAOImpl<>();

        return dao.insert(p);
    }
    /**
     *
     * @return
     */
//    public Usuario Cadastro(){
//    /*cria o usuário*/
//        Usuario usuario = new Usuario();
//        
//        Scanner ler = new Scanner(System.in);
//        System.out.println("nome");
//        usuario.setNome(ler.nextLine());
//        System.out.println("e-mail");
//        usuario.setEmail(ler.nextLine());
//        System.out.println("telefone");
//        usuario.setNome(ler.nextLine());
//        
//        return usuario;
//    
//    public void capturaRespostas(){
//        /*faz as perguntas para o usuário e devolve uma lista de respostas*/
//        
//    }
//    
//    public exibeResultados()
        
          /*buscar no banco os resultados*/
          /*Extrovesão: 20%
          Amabilidade: 10%
          Abertura a novas experiências: 50%
          Conscienciosidade: 80
          neuroticismo: 40% */
}    

