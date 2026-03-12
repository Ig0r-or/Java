import java.util.ArrayList;
import java.util.List;


public class App{

    public static void main(String[] args) throws Exception{
          List<Livro> listaDeLivros = new ArrayList<>();

        listaDeLivros.add(new Livro(01, "Livro 1", "Marco Polo Del Nero", "Disponível"));
        listaDeLivros.add(new Livro(02, "Livro 2", "Marco Polo Del Nero", "Disponível"));
        for(Livro l : listaDeLivros){
            System.out.println(l);
        }
    
    }
} 

  