
package model;

import java.io.Serializable;


public class Libro implements Serializable{
    
    private String isbn;
    private String titulo;
    private String descripcion;
    private String nombre_autor;
    private String nit_editorial;
    private int codigo_categoria;
    private String fecha_registro;

    public Libro() {
        this.isbn = "";
        this.titulo = "";
        this.descripcion = "";
        this.nombre_autor = "";
        this.nit_editorial = "";
        this.codigo_categoria = 0;
        this.fecha_registro = "";
    }

    public Libro(String isbn, String titulo, String descripcion, String nombre_autor, String nit_editorial, int codigo_categoria, String fecha_registro) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.nombre_autor = nombre_autor;
        this.nit_editorial = nit_editorial;
        this.codigo_categoria = codigo_categoria;
        this.fecha_registro = fecha_registro;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre_autor() {
        return nombre_autor;
    }

    public void setNombre_autor(String nombre_autor) {
        this.nombre_autor = nombre_autor;
    }

    public String getNit_editorial() {
        return nit_editorial;
    }

    public void setNit_editorial(String nit_editorial) {
        this.nit_editorial = nit_editorial;
    }

    public int getCodigo_categoria() {
        return codigo_categoria;
    }

    public void setCodigo_categoria(int codigo_categoria) {
        this.codigo_categoria = codigo_categoria;
    }

    public String getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(String fecha_registro) {
        this.fecha_registro = fecha_registro;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
