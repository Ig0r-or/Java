import java.util.Scanner;


public class Livro {
    int idLivro;
    String titulo;
    String autor;
    String status;

    public Livro(int idLivro, String titulo, String autor, String status){
        this.idLivro = idLivro;
        this.titulo = titulo;
        this.autor = autor;
        this.status = status;
    }

    public void atualizarStatus(){
        Scanner scanner = new Scanner(System.in);

        if(status == null || status.isEmpty()){
            System.out.println("Livro indisponível!");
        }
    }
}
