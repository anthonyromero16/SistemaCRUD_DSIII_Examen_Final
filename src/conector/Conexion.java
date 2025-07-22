package conector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Conexion {
        Connection con;

    public Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");  
            con = DriverManager.getConnection(
                    
             
             "jdbc:mysql://db-ibarrasa.cfag0202g2o9.us-east-2.rds.amazonaws.com/surcusal_chitre","root","anthony1016");
      } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Error en la conexión: " + e.getMessage());
            con = null;
        }
        return con;
    }
    
}
