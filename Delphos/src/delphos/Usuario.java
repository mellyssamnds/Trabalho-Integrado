/*
 * Anne Caroline Silva
 * 16/04/2019
 */

package delphos;

public class Usuario {
	
	String nome;
	String email;
	String telefone;
	
	/* metodos setters e getters */
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getNome(){
		return nome;
	}
	
	public String getEmail(){
		return email;
	}
	
	public String getTelefone(){
		return telefone;
	}
	
}
