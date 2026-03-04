import java.util.Date;


public class Usuario {
    private int idUsuario;
    private String nome;
    private String idade;
    private Date dataNascimento;


    public Usuario(int idUsuario, String nome, String idade, Date dataNascimento){
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.idade = idade;
        this.dataNascimento = dataNascimento;
    }

    void Apresentar(){
        System.out.println("Olá meu nome é " + nome);
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

    public Date getDataNascimento(){
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento){
        this.dataNascimento = dataNascimento;
    }

    
}
