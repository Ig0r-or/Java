import java.util.Data;


public class Emprestimo {
    private int idEmprestimo;
    private Date dataEmprestimo;
    private String hora;
    private Usuario usuario;
    private Livro livro;
    private String status;

    public Emprestimo(int idEmprestimo, String hora, String data, String status){
        this.idEmprestimo = idEmprestimo;
        this.hora = hora;
        this.data = dataEmprestimo;
        this.status = status;
        this.usuario = u;
        this.livro = l;
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

    public Usuario getUsuario(){
        return usuario;
    }

    public void setUsuario(Usuario usuario){
        this.usuario = usuario;
    }

    public Livro getLivro(){
        return livro;
    }

    public void setLivro(Livro livro){
        this.livro = livro;
    }
}
