public class Usuario {
    int idUsuario;
    String nome;
    String idade;

    public Usuario(int idUsuario, String nome, String idade){
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.idade = idade;
    }

    void Apresentar(){
        System.out.println("Olá meu nome é " + nome);
    }
}
