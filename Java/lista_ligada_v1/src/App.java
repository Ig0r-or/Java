public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("--- INICIANDO TESTES: LISTA DINÂMICA (HEAP) ---");
        
        // 1. Criando a lista (Head aponta para null)
        ListaLigadaDinamica lista = new ListaLigadaDinamica();
        System.out.print("Lista recém-criada: ");
        lista.imprimir(); // Esperado: []

        System.out.println("\n--- CENÁRIO 1: INSERÇÃO NO INÍCIO (O(1)) ---");
        System.out.println("Inserindo 10, depois 20, depois 30...");
        lista.inserirNoInicio(10);
        lista.inserirNoInicio(20);
        lista.inserirNoInicio(30);
        
        System.out.print("Estado atual da lista: ");
        lista.imprimir(); 

        System.out.println("\n--- CENÁRIO 2: BUSCA (O(n)) ---");
        int valorBusca1 = 20;
        int valorBusca2 = 99;
        
        System.out.println("Buscando o valor " + valorBusca1 + ": " + 
                          (lista.buscar(valorBusca1) ? "Encontrado!" : "Não existe."));
        
        System.out.println("Buscando o valor " + valorBusca2 + ": " + 
                          (lista.buscar(valorBusca2) ? "Encontrado!" : "Não existe."));

        System.out.println("\n--- CENÁRIO 3: EXCLUSÃO NO MEIO DA LISTA ---");
        System.out.println("Removendo o valor 20...");
        lista.excluir(20);
        System.out.print("Estado atual da lista: ");
        lista.imprimir(); // Esperado: [30, 10]
        System.out.println("-> O nó com valor 20 perdeu a referência. O Garbage Collector fará a limpeza!");

        System.out.println("\n--- CENÁRIO 4: EXCLUSÃO NO INÍCIO (Edge Case) ---");
        System.out.println("Removendo o valor 30 (que é o Head atual)...");
        lista.excluir(30);
        System.out.print("Estado atual da lista: ");
        lista.imprimir(); // Esperado: [10]
        System.out.println("-> O Head (Início) agora aponta diretamente para o 10.");
        
        System.out.println("\n--- FIM DOS TESTES ---");
    }
}
