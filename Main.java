public class Main {
    public static void main(String[] args) throws estruturaVaziaException {
        Lista lista = new Lista(5);
        lista.adicionarInicio(5);
        lista.adicionarInicio(4);
        lista.adicionarInicio(3);
        lista.adicionarInicio(2);
        lista.adicionarInicio(1);
        lista.printarLista();
        System.out.println();
        lista.removerRepetidos();
        lista.printarLista();

    }
}
