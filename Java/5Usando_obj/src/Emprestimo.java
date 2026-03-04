public class Emprestimo {
    int idEmprestimo;
    String data;
    String hora;
    String status;

    public Emprestimo(int idEmprestimo, String hora, String data, String status){
        this.idEmprestimo = idEmprestimo;
        this.hora = hora;
        this.data = data;
        this.status = status;
    }

    void Atualizacoes(){
        System.out.println("O status atual do agendamento é " + status);
    }
}
