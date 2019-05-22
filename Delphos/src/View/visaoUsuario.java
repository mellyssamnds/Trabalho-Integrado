/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import dominio.*;
import java.util.Scanner;

/**
 *
 * @author Jennifer
 */
public class visaoUsuario {
    
    public void mensagemInicial(){
        
        Scanner ler = new Scanner(System.in);
        System.out.println("E-mail:");
        ler.nextLine();
        System.out.println("senha:");
        ler.nextLine();
          
        
        
    /*Se não estiver cadastrado*/
    public Usuario mensagemCadastro(){
    /*cria o usuário*/
        Usuario usuario = new Usuario();
        
        Scanner ler = new Scanner(System.in);
        System.out.println("nome");
        usuario.setNome(ler.nextLine());
        System.out.println("e-mail");
        usuario.setEmail(ler.nextLine());
        System.out.println("telefone");
        usuario.setNome(ler.nextLine());
        
        return usuario;
    
    public void capturaRespostas(){
        /*faz as perguntas para o usuário e devolve uma lista de respostas*/
        
    }
    
    public exibeResultados()
        
          /*buscar no banco os resultados*/
          /*Extrovesão: 20%
          Amabilidade: 10%
          Abertura a novas experiências: 50%
          Conscienciosidade: 80
          neuroticismo: 40% */
}    

