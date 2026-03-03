import java.util.Scanner;


public class View4 {
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        
     View4 v = new View4();
       
        int resultadoInt = v.DosInts();
        int valiadorInt = v.validadorInt(resultadoInt);
        int vaiFicar = v.VaiFicar(resultadoInt);
    }

    public int DosInts(){
    System.out.println("Digite o primeiro numero: ");
    int a = scanner.nextInt();
    System.out.println("Digite o segundo numero: ");
    int b = scanner.nextInt();
    int soma = a + b;
        System.out.println("A soma dos int's é: " + soma);
        return soma;
    }

    public int validadorInt(int resultadoInt){
         if(resultadoInt > 20){
                System.out.println("Resultado de: " + resultadoInt + " é maior que 20!");
            } else if(resultadoInt == 20){
                 System.out.println("Resultado de: " + resultadoInt + " é igual a 20!");
            } else{
                System.out.println("Resultado de: " + resultadoInt + " não é maior que 20!");
            }
        return resultadoInt;
    }

    public int VaiFicar(int resultadoInt){
        while(resultadoInt <= 20){
            System.out.println("Aumentando: " + resultadoInt);
                if(resultadoInt == 20){
                    System.out.println("Agora sim o resultado de " + resultadoInt + " é pelo menos igual a 20!");
                }
            resultadoInt++;
        }
        return resultadoInt;
    }
}