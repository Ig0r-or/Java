
public class Biblioteca {
    private int idBiblioteca;
    private String nomeBiblioteca;
    private String endereco;
    private String telefone;

    
    public Biblioteca(int idBiblioteca, String nomeBiblioteca, String endereco, String telefone){
        this.idBiblioteca = idBiblioteca;
        this.nomeBiblioteca = nomeBiblioteca;
        this.endereco = endereco;
        this.telefone = telefone;
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


}
