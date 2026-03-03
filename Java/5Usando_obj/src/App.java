public class App{

    public static void main(String[] args) throws Exception{

        Paciente p1 = new Paciente(
            1,
            "Neymar",
            "05/02/1992",
            "11409624716",
            ""
        );

        p1.Apresentar();

        p1.atualizarContado();

    }
} 

  