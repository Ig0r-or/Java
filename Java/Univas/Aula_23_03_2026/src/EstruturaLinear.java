package Java.Univas.Aula_23_03_2026.src;

public class EstruturaLinear{
private No inicio;
private No fim;

public EstruturaLinear(){
    this.inicio = null;
    this.fim = null;
}
      
    public void inserir(int valorReferencia, int novoValor){
        No novoNo = new No(novoValor);

        if(inicio == null){
            inicio = novoNo;
            fim = novoNo;
        } else {
            fim.proximo = novoNo;
            fim = novoNo;
        }
        System.out.println("Inserido: " + novoValor);
    }
}