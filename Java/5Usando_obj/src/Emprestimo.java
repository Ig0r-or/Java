public class Emprestimo {
    private int idEmprestimo;
    private String data;
    private String hora;
    private String status;

    public Emprestimo(int idEmprestimo, String hora, String data, String status){
        this.idEmprestimo = idEmprestimo;
        this.hora = hora;
        this.data = data;
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

    public String getData(){
        return data;
    }

    public void setData(String data){
        this.data = data;
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
