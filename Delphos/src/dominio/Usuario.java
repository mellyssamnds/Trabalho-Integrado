/*
 * Anne Caroline Silva
 * 16/04/2019
 */

package dominio;

public class Usuario {
	
	String nome;
	String email; /*podemos usar como login*/
	String telefone;
        String senha;
    	
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
        
        public void setSenha(String senha) {
            this.senha = senha;
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
        
        public String getSenha() {
        return senha;
        }

        
	
}
