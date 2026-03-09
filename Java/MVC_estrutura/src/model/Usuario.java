package model;
public class Usuario {
    private int idUsuario;
    private String nome;
    private String idade;
    private String dataNascimento;


    public Usuario(int idUsuario, String nome, String idade, String dataNascimento){
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.idade = idade;
        this.dataNascimento = dataNascimento;
    }

    public int getIdUsuario(){
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario){
        this.idUsuario = idUsuario;
    }

     public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

     public String getIdade(){
        return idade;
    }

    public void setIdade(String idade){
        this.idade = idade;
    }    

    public String getDataNascimento(){
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento){
        this.dataNascimento = dataNascimento;
    }

    
}
