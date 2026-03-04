import java.util.Data;


public class Emprestimo {
    private int idEmprestimo;
    private Date dataEmprestimo;
    private String hora;
    private String status;

    public Emprestimo(int idEmprestimo, String hora, Date dataEmprestimo, String status){
        this.idEmprestimo = idEmprestimo;
        this.hora = hora;
        this.data = dataEmprestimo;
        this.status = status;
    }

    void Atualizacoes(){
        System.out.println("O status atual do agendamento é " + status);
    }

    public int getIdEmprestimo(){
        return idEmprestimo;
    }

    public void setIdEmprestimo(int idEmprestimo){
        this.idEmprestimo = idEmprestimo;
    }

    public Date getDataEmprestimo(){
        return dataEmprestimo;
    }

    public void setData(String dataEmprestimo){
        this.dataEmprestimo = dataEmprestimo;
    }

     public String getHora(){
        return hora;
    }

    public void setHora(String hora){
        this.hora = hora;
    }

     public String getStatus(){
        return status;
    }

    public void setStatus(String status){
        this.status = status;
    }

}
