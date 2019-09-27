
package dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    
    public static Connection conectar(){
        String url="jdbc:mysql://localhost:3306/crm?";
        String user="root";
        String password="";
        
        
        try {
            ///utilizaremos el driver de mysql
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException ex) {
           
            
            return null;
        } catch (SQLException ex) {
                 return null;
        }
    }
    
    
}
