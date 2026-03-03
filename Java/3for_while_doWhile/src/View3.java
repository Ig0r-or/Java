public class View3 {
    public static void main(String[] args) throws Exception {
        View3 v = new View3();
        int atv1 = v.Atv1();
        int atv2 = v.Atv2();
        int atv3 = v.Atv3();
        int atv4 = v.Atv4();

    }

//Contagem Simples: Crie um programa que imprima todos os números no intervalo de 150 a 300.
    public int Atv1(){
        int contador = 150;
        while(contador < 300){
            System.out.println("Contando: " + contador);
        contador++;
        }
    return contador;
    }

//Soma Acumulada: Desenvolva um algoritmo que calcule e imprima a soma de todos os números de 1 até 1000
    public int Atv2(){
        int soma = 0;
       for(int i = 1; i < 1000; i++){
        soma = soma + i;
            System.out.println("Somando: " + soma);
            }
            return soma;
        }
//Múltiplos: Imprima todos os múltiplos de 3 que estejam entre os números 1 e 100
        public int Atv3(){
            int contador = 1;
        while(contador < 100){
            contador++;
            if(contador % 3 == 0){
                System.out.println(contador + " é multiplo de 3");
            }
        }
        return contador;
    }

//Regra de Collatz (3n + 1): Escreva um programa onde, dada uma variável x inteira, aplique as seguintes regras em um laço:
//Se x for par, x = x / 2.
//Se x for ímpar, x = 3 * x + 1.
//O programa deve imprimir cada novo valor de x e parar apenas quando x for igual a 1

        public int Atv4(){
            int numero = 1;
        while(numero < 40){
            numero++;
           while(numero/2 == 0 ){

           }
        }
        return numero;
        }



    }


