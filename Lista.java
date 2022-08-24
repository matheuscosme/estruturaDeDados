public class Lista {
    private int[] vetorElementos;
    private int numeroElementos;

    public Lista(int tamanho){
        this.vetorElementos = new int[tamanho];
        this.numeroElementos = 0;
    }

    public boolean listaVazia(){
        if(this.numeroElementos == 0){
            return true;
        } else {
            return false;
        }
    }

    public boolean listaCheia(){
        if(this.numeroElementos >= this.vetorElementos.length) {
            return true;
        } else {
            return false;
        }
    }

    public void adicionarFinal(int numero){
        if(listaCheia()){
            System.out.println("Estrutura Cheia");
        }
        else{
            int indice = this.numeroElementos;
            this.vetorElementos[indice] = numero;
            this.numeroElementos++;
        }
    }

    public int removerFinal() throws estruturaVaziaException{
        if(listaVazia()){
            throw new estruturaVaziaException();
        }
        else{
            int indice = this.numeroElementos - 1;
            int elementoRemovido = this.vetorElementos[indice];
            this.numeroElementos = indice;
            return elementoRemovido;
        }
    }

    public void adicionarInicio(int numero){
        if(listaCheia()){
            System.out.println("Estrutura Cheia!");
        }
        else{
            for(int indice=this.numeroElementos;indice>0;indice--){
                this.vetorElementos[indice] = this.vetorElementos[indice - 1];
            }
            this.vetorElementos[0] = numero;
            this.numeroElementos++;
        }
    }

    public int removerInicio() throws estruturaVaziaException{
        if(listaVazia()){
            throw new estruturaVaziaException();
        }
        else{
            int elementoRemovido = this.vetorElementos[0];
            for(int indice=1;indice<=(this.numeroElementos-1);indice++){
                this.vetorElementos[indice-1] = this.vetorElementos[indice];
            }
            this.numeroElementos--;
            return elementoRemovido;
        }
    }

    public void adicionarNaPosicao(int numero, int posicao){
        if(listaCheia()){
            System.out.println("Estrutura Cheia");
        }
        else{
            if(posicao<=0){
                this.adicionarInicio(numero);
            }
            else if(posicao>=this.numeroElementos){
                this.adicionarFinal(numero);
            }
            else{
                for(int indice=this.numeroElementos;indice>posicao;indice--){
                    this.vetorElementos[indice] = this.vetorElementos[indice-1];
                }
                this.vetorElementos[posicao] = numero;
                this.numeroElementos++;
            }
        }
    }

    public int removerNaPosicao(int posicao) throws estruturaVaziaException{
        if(listaVazia()){
            throw new estruturaVaziaException();
        }
        else{
            if(posicao<=0){
                return this.removerInicio();
            }
            else if(posicao>=this.numeroElementos){
                return this.removerFinal();
            }
            else{
                int elementoRemovido = this.vetorElementos[posicao];
                for(int indice=posicao;indice<(this.numeroElementos-1);indice++){
                    this.vetorElementos[indice] = this.vetorElementos[indice-1];
                }
                this.numeroElementos--;
                return elementoRemovido;
            }
        }
    }

    public void printarLista() throws estruturaVaziaException{
        for(int indice=0;indice<this.numeroElementos;indice++){
            int elemento;
            elemento = this.removerInicio();
            this.adicionarFinal(elemento);
            System.out.println(elemento);
        }
        

    }

    public void mostrarLista(){
        for(int i=0;i<this.numeroElementos;i++){
            System.out.println(vetorElementos[i]);
        }
    }
}