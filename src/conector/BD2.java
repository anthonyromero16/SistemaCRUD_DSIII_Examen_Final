package conector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BD2 {

    static Connection con;
    static String driver = "org.mariadb.jdbc.Driver";
    static String user = "root";
    static String pass = "16102000";
    static String url = "jdbc:mariadb://127.0.0.1:3306/ibarrasa"; 

    public static Connection conector() {
        con = null;
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, pass);
            if (con != null) {
                System.out.println("\nConexion exitosa con MariaDB");
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Conexion fallida: " + e.getMessage());
        }
        return con;
    }
}
