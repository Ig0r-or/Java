public class App{
    public static void main(String[] args) {
        EstruturaLinear estrutura = new EstruturaLinear();

        estrutura.inserir(-1, 10);
        estrutura.inserir(10, 20);
        estrutura.inserir(20, 30);

    //  estrutura.remover(20);

        estrutura.inserir(10, 40);
        estrutura.inserir(30, 50);

    //  estrutura.remover(40);
    // estrutura.remover(10);

        estrutura.inserir(50, 60);
    //    estrutura.remover(99);

    //    estrutura.imprimir();
    }
}