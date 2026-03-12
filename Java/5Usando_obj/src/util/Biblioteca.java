import java.util.ArrayList;
import java.util.List;


public class Biblioteca {
    private int idBiblioteca;
    private String nomeBiblioteca;
    private String endereco;
    private String telefone;
    private Livro livro;
    private Emprestimo emprestimo;
    private Usuario usuario;

    
    public Biblioteca(int idBiblioteca, String nomeBiblioteca, String endereco, String telefone, Livro livro, Emprestimo emprestimo, Usuario usuario){
        this.idBiblioteca = idBiblioteca;
        this.nomeBiblioteca = nomeBiblioteca;
        this.endereco = endereco;
        this.telefone = telefone;
        this.livro = livro;
        this.emprestimo = emprestimo;
        this.usuario = usuario;
    }

    public int getIdBiblioteca(){
        return idBiblioteca;
    }

    public void setIdBiblioteca(int idBiblioteca){
        this.idBiblioteca = idBiblioteca;
    }

    public String getNomebiblioteca(){
        return nomeBiblioteca;
    }
    
    public void setNomeBiblioteca(String nomeBiblioteca){
        this.nomeBiblioteca = nomeBiblioteca;
    }

     public String getEndereco(){
        return endereco;
    }
    
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

     public String getTelefone(){
        return telefone;
    }
    
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    public Livro getLivro(){
        return livro;
    }
    
    public void setLivro(Livro livro){
        this.livro = livro;
    }

    public Emprestimo getEmprestimo(){
        return emprestimo;
    }

    public void setEmprestimo(Emprestimo emprestimo){
        this.emprestimo = emprestimo;
    }

    public Usuario getUsuario(){
        return usuario;
    }

    public void setUsuario(Usuario usuario){
        this.usuario = usuario;
    }

}
