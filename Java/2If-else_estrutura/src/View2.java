public class View2 {
    //Aqui eu aprimoro o primeiro código por validações if e else declarados em classes por metodos e retornados a Main principal
    public static void main(String[] args) throws Exception {
        View2 v = new View2();
        int resultadoInt = v.DosInts();
        int valiadorInt = v.validadorInt(resultadoInt);
        Double resultadoDouble = v.DosDoubles();
        Double valiadorDouble = v.validadorDouble(resultadoDouble);
        int resultadoBoolean = v.DosBoolean();  
    }

    public int DosInts(){
    int a = 10;
    int b = 20;
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
//-----------------------------------------------------------------------------------------------------------------------------------------------------

    public double DosDoubles(){
        double a = 2.10;
        double b = 2.20;
        double soma = a + b;
            System.out.println("A soma dos doubles é: " + soma);
        return soma;
    }

    public double validadorDouble(double resultadoDouble){
        if(resultadoDouble > 3.2){
                System.out.println("Resultado de: " + resultadoDouble + " é maior que 3.2!");
             } else if(resultadoDouble == 4){
                 System.out.println("Resultado de: " + resultadoDouble + " é igual a 4!");
            } else{
                System.out.println("Resultado de: " + resultadoDouble + " não é maior que 3.2!");
            }
            return resultadoDouble;
        }

//-----------------------------------------------------------------------------------------------------------------------------------------------------

    public int DosBoolean(){
        int a = DosInts();
        int b = 20;
        int soma = a + b;
        return soma;
    }
}
