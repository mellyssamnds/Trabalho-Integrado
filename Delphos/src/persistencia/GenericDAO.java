/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author landerson
 * @param <G>
 */
public interface GenericDAO<G> {
    public List<G> getAll() throws SQLException, ClassNotFoundException;
    public G getById(int id) throws SQLException, ClassNotFoundException;
    public boolean insert(G obj) throws SQLException, ClassNotFoundException;
    public void update(G obj) throws SQLException, ClassNotFoundException;
    public void delete(G obj) throws SQLException, ClassNotFoundException;
   
}
