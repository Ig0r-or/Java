package controller;

import java.util.ArrayList;
import java.util.List;
import model.Usuario;
import model.Livro;
import model.Emprestimo;

public class Biblioteca {
    private int idBiblioteca;
    private String nomeBiblioteca;
    private String endereco;
    private String telefone;
    private List<Emprestimo> emprestimos;


    
    public Biblioteca(int idBiblioteca, String nomeBiblioteca, String endereco, String telefone){
        this.idBiblioteca = idBiblioteca;
        this.nomeBiblioteca = nomeBiblioteca;
        this.endereco = endereco;
        this.telefone = telefone;
        this.emprestimos = new ArrayList<>();
    }

    public void registrarEmprestimo(Usuario u, Livro l){
        Emprestimo e = new Emprestimo(idBiblioteca, telefone, nomeBiblioteca, endereco, l, u);
        emprestimos.add(e);
        System.out.println("Empréstimo registrado: " + u.getNome() + " pegou " + l.getTitulo());
    }

    public List<Emprestimo> getEmprestimos(){
        return emprestimos;
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
