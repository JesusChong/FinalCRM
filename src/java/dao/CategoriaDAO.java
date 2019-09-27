/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Categoria;

/**
 *
 * @author Lenovo Y50-70
 */
public class CategoriaDAO {
    
    
    ///metodo para egistrar
    public static boolean registrar(Categoria cat){
        
        
        ///encerrar dentro de try catch si no se ejecuta la consulta de manera adecuada o se rompa el tiempo de ejecucucion, la tabla no exista, valores repetidos etc;
        try {
            String SQL="INSERT INTO categorias(nombre) VALUES('?');";
            
            //HACER CONEXION - cuando se conecte que se guarde en c,
            Connection con = Conexion.conectar(); //referencia a la base de datos
            //preparar sentencia o consulta
            PreparedStatement st = con.prepareStatement(SQL);
            ///enviar el parametro a esa consulta sql, st es la consulta preparada, hay 1 variable que se espera y aun no se envia, se obtiene cat.getNombre
            st.setString(1, cat.getNombre()); // a esa consulta preparada hay un parametro es el valor de cat cuando se envie ese valor
            
            ///si st.executeupdte(cambio en la informacion, por ejemplo insertar informacion nueva) si regresa mayor a 0 entonces si se hizo una insercion
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
    public static ArrayList<Categoria> listar(){
        
        
        ///encerrar dentro de try catch si no se ejecuta la consulta de manera adecuada o se rompa el tiempo de ejecucucion, la tabla no exista, valores repetidos etc;
        try {
            String SQL="SELECT * FROM categorias";
            
            //HACER CONEXION - cuando se conecte que se guarde en c,
            Connection con = Conexion.conectar(); //referencia a la base de datos
            //preparar sentencia o consulta
            PreparedStatement st = con.prepareStatement(SQL);
           
       //     st.setString(1, cat.getNombre()); // a esa consulta preparada hay un parametro es el valor de cat cuando se envie ese valor
            

            //aqui se ejctua y se guardará el resultado de la consulta SQL, 
            ResultSet resultado = st.executeQuery();
            
            ArrayList<Categoria> lista = null;

            //se crea objeto de tipo categoria
            Categoria cat;
            //mientras encuentre un dato dentro de resultado, se ira llenando esa lista
            while(resultado.next()){
                cat = new Categoria(); //se crea una nueva Categoria 
                cat.setCodigo(resultado.getInt("codigo")); //se asigna con set, se obtiene con get el valor de la variable
                cat.setNombre(resultado.getString("nombre"));
                lista.add(cat);
            }
            
            //retorna la lista completa
            return lista;
            
         
            
        } catch (SQLException ex) { // si no hay nada se retornará null
           return null;
        }
        
        
        
    }
    
}
