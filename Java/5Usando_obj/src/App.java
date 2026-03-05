public class App{

    public static void main(String[] args) throws Exception{
        Usuario u = new Usuario(1, "Igor", "20", "11/11/2005" );
        Livro l1 = new Livro(2, "Neymar Historia", "Craque Neto", "disponível");

        Emprestimo em = new Emprestimo(4, "10:30", "05/02/2025", "Em andamento", l1, u);
        System.out.println(
            "Emprestimo de " + em.getUsuario().getNome() + " do livro " + em.getLivro().getTitulo() + " escrito por " + em.getLivro().getAutor()
        );
    
    }
} 

  