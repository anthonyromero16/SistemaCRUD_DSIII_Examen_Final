package conector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Conexion {
        Connection con;

    public Connection getConnection() {
        /*try {
            Class.forName("com.mysql.cj.jdbc.Driver");  
            con = DriverManager.getConnection(
                    
             
             "jdbc:mysql://teknosa.c7w2cwc4yz5r.us-east-2.rds.amazonaws.com/teknosa_db","antohny","anthony16");
        } catch (ClassNotFoundException e) {
            System.err.println("Error en la conexión: " + e.getMessage());
            con = null;
        }*/
        return con;
    }
    
}
