public class Main {
    public static void main(String[] args) throws estruturaVaziaException {
        Lista lista = new Lista(3);
        lista.adicionarInicio(1);
        lista.adicionarFinal(2);
        lista.mostrarLista();
        lista.removerInicio();
        lista.mostrarLista();
        lista.adicionarFinal(1);
        lista.mostrarLista();
        //lista.printarLista();
    }
}
