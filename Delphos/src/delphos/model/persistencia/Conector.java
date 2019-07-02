package delphos.model.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ISM
 */
public class Conector {

    protected Connection con;

    protected Connection openConnection() throws ClassNotFoundException, SQLException{

        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(
                    "jdbc:postgresql://raja.db.elephantsql.com:5432/lccoaosx", "lccoaosx", "5un7YCf9Y_dluUaVXmSBYQjCkLGzS6pN");

            return con;
        } catch (SQLException e) {
            throw new SQLException(e);
        }
    }

    protected void closeConnection(Connection con) throws SQLException {
        con.close();
    }

    public int getNextId(String select, String id) throws SQLException, ClassNotFoundException {
        int res = -0;

        try (Connection connection = this.openConnection();
                PreparedStatement statement = connection.prepareStatement(select,
                        ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
                ResultSet result = statement.executeQuery();) {
            if (result.last()) {
                res = result.getInt(id);
                return res + 1;
            }
        } finally {
            this.closeConnection(con);
        }
        return res;
    }
}
