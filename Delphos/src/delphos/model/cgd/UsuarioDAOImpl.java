/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package delphos.model.cgd;

import delphos.model.persistencia.Conector;
import delphos.model.cdp.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;


public class UsuarioDAOImpl<G> extends Conector implements GenericDAO<G> {

    private static final String SELECT = "SELECT * FROM usuario ";
    private static final String SELECT_LOGIN = "SELECT * FROM cliente where email = ? and senha = ?;";
    private static final String INSERT = "INSERT INTO usuario (id_usuario,nome,cpf,"
            + "email,senha,dataNascimento) VALUES(?,?,?,?,?,?);";
//    private static final String DELETE = "DELETE FROM cliente WHERE id_cliente = ?;";
    private static final String UPDATE = "UPDATE usuario SET (nome,cpf,"
          + "email,senha,dataNascimento) = (?,?,?,?,?) WHERE id_usuario = ?;";
//
    private static final String ID_USUARIO = "id_usuario";
    private static final String NOME = "nome";
    private static final String EMAIL = "email";
    private static final String SENHA = "senha";
    private static final String CPF = "cpf";
    private static final String ORDER = "ORDER BY id_usuario ASC";
    private static final String DATA = "dataNascimento";

//    List<Usuario> pessoas = new ArrayList<>();
    private static Usuario pessoa = new Usuario();
    
    public boolean selectLogin(String email, String senha) throws SQLException, ClassNotFoundException {
        boolean result = false;

        try (Connection connection = this.openConnection();
                PreparedStatement statement = connection.prepareStatement(SELECT_LOGIN);) {
            statement.setString(1, email);
            statement.setString(2, senha);
            try (ResultSet resultadoConsulta = statement.executeQuery()) {
            	result = resultadoConsulta.next();
            	if(result) {
	            	pessoa.setNome(resultadoConsulta.getString(NOME));
	                pessoa.setEmail(resultadoConsulta.getString(EMAIL));
	                pessoa.setCpf((String) resultadoConsulta.getString(CPF));
	                pessoa.setSenha(resultadoConsulta.getString(SENHA));
	                pessoa.setId(resultadoConsulta.getInt(ID_CLIENTE));
	                pessoa.setNascimento(resultadoConsulta.getDate(DATA));
            	}
            }
        } finally {
            this.closeConnection(con);
        }
        return result;
    }
    
    public static Usuario recuperarUsuario(String email, String senha) throws ClassNotFoundException, SQLException {
		UsuarioDAOImpl<Usuario> dao = new UsuarioDAOImpl<>();
    	if (pessoa == null) {
			dao.selectLogin(email, senha);
		}
    	return pessoa;
    }
    /**
     *
     * @param obj
     * @return @throws SQLException
     * @throws ClassNotFoundException
     */

    @Override
    public boolean insert(G obj) throws SQLException, ClassNotFoundException {
        boolean stat = false;
        try (Connection connection = this.openConnection();
                PreparedStatement statement = connection.prepareStatement(INSERT);) {

            //System.out.println("obj: " + ((Usuario) obj).getNome());
            //Date data = ((Usuario) obj).getDataNascimento();
            //java.sql.Date date = new java.sql.Date(data.getTime());

            statement.setInt(1, this.getNextId(SELECT + ORDER, ID_USUARIO));
            statement.setString(2, ((Usuario) obj).getNome());
            statement.setString(3, ((Usuario) obj).getCpf());
            statement.setString(4, ((Usuario) obj).getEmail());
            statement.setString(5, ((Usuario) obj).getSenha());
            //statement.setString(5,((Usuario) obj).getDataNascimento());
            statement.setString(6,((Usuario) obj).getDataNascimento());

            stat = statement.execute(); 
        } finally {
            this.closeConnection(con);
        }
        return stat;

    }

//    @Override
//    public G getById(int id) throws ClassNotFoundException, SQLException {
//
//        Usuario pessoa2 = null;
//        if (pessoas.isEmpty()) {
//            pessoas = (List<Usuario>) this.getAll();
//        }
//        for (Usuario c : pessoas) {
//            if (c.getId() == id) {
//                pessoa2 = c;
//            }
//        }
//        return (G) pessoa2;
//    }

    @Override
    public List<G> getAll() throws SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public G getById(int id) throws SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
            
    @Override
    public void update(G obj) throws SQLException, ClassNotFoundException {

        try (Connection connection = this.openConnection();
            PreparedStatement statement = connection.prepareStatement(UPDATE);) {
            String nome = ((Usuario) obj).getNome();
            String cpf = ((Usuario) obj).getCpf();
            String email = ((Usuario) obj).getEmail();
            String senha = ((Usuario) obj).getSenha();
            String data = ((Usuario) obj).getDataNascimento();

            statement.setString(1, nome);
            statement.setString(2, cpf);
            statement.setString(3, email);
            statement.setString(4, senha);
            statement.setString(5, data);
            statement.setInt(6, 1);
            statement.execute();
        } finally {
            this.closeConnection(con);
        }

    }

    @Override
    public void delete(G obj) throws SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
