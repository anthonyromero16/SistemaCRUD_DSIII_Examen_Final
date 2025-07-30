package conector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BD3 {
    static Connection con;
    static String driver="com.mysql.cj.jdbc.Driver";
    static String user="root";
    static String pass="16102000";
    static String url="jdbc:mysql://localhost:3306/ibarrasa";
    
    public static Connection conector(){

        con=null;
         try{
            Class.forName(driver);
            con= (Connection) DriverManager.getConnection(url, user, pass);
            if (con!=null){
                System.out.print("\nConexion existos con BD en fisica\n");
            }
        }
        catch (ClassNotFoundException | SQLException e){
            System.out.print("Conexion fallado");
        }
        return con;
    }
}
