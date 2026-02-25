public class View1 {

     
    //Aqui eu volto pro básico declarando alguns tipos primitivos do Java, mas claro, com o adendo que eles são declarados em classes por metodos e retornados a Main principal
    public static void main(String[] args) throws Exception {
        View1 v = new View1();
        int resultadoInt = v.DosInts();
        double resultadoDouble = v.DosDoubles();
        boolean resultadoBoolean = v.DosBoolean();
            System.out.println("Resultado é: " + resultadoInt);
            System.out.println("Resultado é: " + resultadoDouble);
             System.out.println("Resultado é: " + resultadoBoolean);
    }

    public int DosInts(){
    int a = 10;
    int b = 20;
    int soma = a + b;
        System.out.println("A soma dos int's é: " + soma);
        return soma;
    }

    public double DosDoubles(){
        double a = 2.10;
        double b = 2.20;
        double soma = a + b;
            System.out.println("A soma dos doubles é: " + soma);
        return soma;
    }

    public boolean DosBoolean(){
        int a = DosInts();
        int b = 20;
        int soma = a + b;
            if(soma > 10){
                return true;
            }
            return true;
    }
}
