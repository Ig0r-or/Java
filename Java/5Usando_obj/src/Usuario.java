public class Usuario {
    private int idUsuario;
    private String nome;
    private String idade;

    public Usuario(int idUsuario, String nome, String idade){
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.idade = idade;
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
}
