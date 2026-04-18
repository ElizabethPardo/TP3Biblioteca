package com.example.trabajopractico3.modelo;

public class DetalleLibro {
    private String titulo, autor, descripcion, paginas, anio, genero;
    private int idFoto;

    public DetalleLibro(String titulo, String autor, String descripcion, String paginas, String anio, String genero, int idFoto) {
        this.titulo = titulo;
        this.autor = autor;
        this.descripcion = descripcion;
        this.paginas = paginas;
        this.anio = anio;
        this.genero = genero;
        this.idFoto = idFoto;
    }

    public int getIdFoto() {
        return idFoto;
    }

    public void setIdFoto(int idFoto) {
        this.idFoto = idFoto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPaginas() {
        return paginas;
    }

    public void setPaginas(String paginas) {
        this.paginas = paginas;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
