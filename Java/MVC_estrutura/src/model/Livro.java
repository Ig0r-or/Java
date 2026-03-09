package model;
public class Livro {
    private int idLivro;
    private String titulo;
    private String autor;
    private String status;

    public Livro(int idLivro, String titulo, String autor, String status){
        this.idLivro = idLivro;
        this.titulo = titulo;
        this.autor = autor;
        this.status = status;
    }

    public int getIdLivro(){
        return idLivro;
    }

    public void setIdLivro(int idLivro){
        this.idLivro = idLivro;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo( String titulo){
        this.titulo = titulo;
    }

     public String getAutor(){
        return autor;
    }

    public void setAutor( String autor){
        this.autor = autor;
    }

     public String getStatus(){
        return status;
    }

    public void setStatus( String status){
        this.status = status;
    }

    

}
