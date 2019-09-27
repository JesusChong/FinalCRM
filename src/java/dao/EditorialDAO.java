
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Editoriales;



public class EditorialDAO {
    
     public static boolean registrar(Editoriales e){
        
        
        ///encerrar dentro de try catch si no se ejecuta la consulta de manera adecuada o se rompa el tiempo de ejecucucion, la tabla no exista, valores repetidos etc;
        try {
            String SQL="insert into editoriales(nit, nombre, telefono, direccion, email, sitioweb) values('?','?','?','?','?','?');";
            
            //HACER CONEXION - cuando se conecte que se guarde en c,
            Connection con =  Conexion.conectar(); //referencia a la base de datos
            //preparar sentencia o consulta
            PreparedStatement st = con.prepareStatement(SQL);
            ///enviar el parametro a esa consulta sql, st es la consulta preparada, hay 1 variable que se espera y aun no se envia, se obtiene cat.getNombre
            st.setString(1, e.getNit()); // a esa consulta preparada hay un parametro es el valor de cat cuando se envie ese valor
              st.setString(2, e.getNombre());
                st.setString(3, e.getTelefono());
                  st.setString(4, e.getDireccion());
                    st.setString(5, e.getEmail());
                      st.setString(6, e.getSitioweb());
            
          
            if(st.executeUpdate()>0){
                return true;
            }else {
                return false;
            }
            
        } catch (SQLException ex) {
           return false;
        }
        
        
        
    }
    //----
    
    
     ///metodo para retornar una lista de todas las categorias
    public static ArrayList<Editoriales> listar(){
        
        
        ///encerrar dentro de try catch si no se ejecuta la consulta de manera adecuada o se rompa el tiempo de ejecucucion, la tabla no exista, valores repetidos etc;
        try {
            String SQL="SELECT * FROM editoriales";
            
            //HACER CONEXION - cuando se conecte que se guarde en c,
            Connection con = Conexion.conectar(); //referencia a la base de datos
            //preparar sentencia o consulta
            PreparedStatement st = con.prepareStatement(SQL);
           
       //     st.setString(1, cat.getNombre()); // a esa consulta preparada hay un parametro es el valor de cat cuando se envie ese valor
            

            //aqui se ejctua y se guardará el resultado de la consulta SQL, 
            ResultSet resultado = st.executeQuery();
            
            ArrayList<Editoriales> lista = null;

            //se crea objeto de tipo categoria
            Editoriales edi;
            //mientras encuentre un dato dentro de resultado, se ira llenando esa lista
            while(resultado.next()){
                edi = new Editoriales(); //se crea una nueva Categoria 
                edi.setNit(resultado.getString("nit")); //se asigna con set, se obtiene con get el valor de la variable
                   edi.setNombre(resultado.getString("nombre"));
                      edi.setDireccion(resultado.getString("direccion"));
                         edi.setEmail(resultado.getString("email"));
                            edi.setSitioweb(resultado.getString("sitioweb"));
                               edi.setTelefono(resultado.getString("telefono"));
                lista.add(edi);
            }
            
            //retorna la lista completa
            return lista;
            
         
            
        } catch (SQLException ex) { // si no hay nada se retornará null
           return null;
        }
        
        
        
    }
    
    
    
}
