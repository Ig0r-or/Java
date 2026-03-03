import java.util.Scanner;


public class Paciente {
    int idPaciente;
    String nome;
    String dataNascimento;
    String telefone;
    String email;

    public Paciente(int idPaciente, String nome, String dataNascimento, String telefone, String email){
        this.idPaciente = idPaciente;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.email = email;
    }

    void Apresentar(){
        System.out.println("Olá meu nome é " + nome + "!");
    }

    public void atualizarContado(){
        Scanner scanner = new Scanner(System.in);

        if(email == null || email.isEmpty() ){
            System.out.println("Digite um email: ");
            String email = scanner.nextLine();
            System.out.println("Email cadastrado: " + email);
        } else{
            System.out.println("O email já foi cadastrado!");
        }
        
    }
}
