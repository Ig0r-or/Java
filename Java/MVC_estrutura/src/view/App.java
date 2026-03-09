package view;
import java.util.ArrayList;
import java.util.List;

import model.Livro;

public class App {
    public static void main(String[] args) throws Exception {
       List<Livro> listaDeLivros = new ArrayList<>();

        listaDeLivros.add(new Livro(01, "O Principe que não se tornou Rei!", "By: Alamo", "Disponivel"));
        
        for(Livro l : listaDeLivros){
            System.out.println(l);
        }
    }
}
