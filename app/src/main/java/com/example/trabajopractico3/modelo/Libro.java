package com.example.trabajopractico3.modelo;

import java.io.Serializable;

public class Libro implements Serializable {
    private String titulo;
    private String autor;
    private String descripcion;
    private int paginas;
    private int anio;
    private int idFoto;
    private String[] generos;


    public Libro(String titulo, String autor, int paginas, int anio, String[] genero, String descripcion, int idFoto) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.anio = anio;
        this.generos = genero;
        this.descripcion = descripcion;
        this.idFoto = idFoto;
    }

    public int getIdFoto() {
        return idFoto;
    }
    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public int getPaginas() { return paginas; }
    public int getAnio() { return anio; }
    public String[] getGenero() { return generos; }
    public String getDescripcion() { return descripcion; }


}