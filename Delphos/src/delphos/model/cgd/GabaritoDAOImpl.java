/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package delphos.model.cgd;

import delphos.model.persistencia.Conector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;

/**
 *
 * @author Jennifer
 */
public abstract class GabaritoDAOImpl extends Conector implements GenericDAO {
    
    /*Strings dos scripts SQL*/
    private static final String INSERT = "INSERT INTO gabarito (dataHora,EXT1,EXT2,EXT3,"
            + "EXT4,EXT5,EXT6,EXT6,EXT7,EXT8,EXT9,EXT10,EST1,EST2,EST3,EST4,EST5,EST6,EST7,EST8,EST9,EST10,"
            + "AGR1,AGR2,AGR3,AGR4,AGR5,AGR6,AGR7,AGR8,AGR9,AGR10,CSN1,CSN2,CSN3,CSN4,CSN5,CSN6,CSN7,CSN8,CSN9,CSN10," 
            + "OPN1,OPN2,OPN3,OPN4,OPN5,OPN6,OPN7,OPN8,OPN9,OPN10) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,"
            +"?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
    
    //recebo um arrayList<String>
//    public boolean insert(G obj) throws SQLException, ClassNotFoundException {
//        boolean stat = false;
//        try (Connection connection = this.openConnection();
//                PreparedStatement statement = connection.prepareStatement(INSERT);) {
//            HashMap<String, Integer> resultado = obj;
//            for(int i = 1; i <= resultado.size(); i++){
//                
//                //statement.setDate(1,resultado.get(i));
//                //statement.setString(i, ((String) obj).get(i));
//        
//            }
//
//            stat = statement.execute(); 
//        } finally {
//            this.closeConnection(con);
//        }
//        return stat;
//    }
           
}
