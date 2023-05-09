package listaDupla;

import fazendosozinh.no;

public class ListDupla {
    private No primeiro;

    private  No antecessor;
    private No ultimo;
    private int cont;

    public void adicionar(String elemento){
        No nome  = new No(elemento);

        /**
         * Se os dois elementos forem null eles recebem o primeiro elemento
         * sendo esse element o primeiro e o ultimo
         */
        if(this.cont == 0){
            this.primeiro = nome;
            this.ultimo = nome;


        } else {
            /**
             *Faço o ultimo elemento aponta para o proximo que sera inserido
             */
            this.ultimo.setProximo(nome);
            //guardo a referencia do utltimo elemento antes de atualizar , ja que sendo ele o antecessor
            //e preciso apontar para o anterior , pois e uma lista duplamente encadeada
            this.antecessor = this.ultimo;
            //Atualizo o novo elemento , ja que cada novo elemento e inserido do usando  a variavel ultimo
            this.ultimo = nome;
            //Com o novo elemento inserido sendo ele o ultimo, faço o seu ponteiro anterior aponta para o
            //elemento anterior da lista
            this.ultimo.setAnterior(antecessor);

        }
        cont ++;


    }

    @Override
    public String toString() {
        if(this.cont == 0){
            return "";

        }
        StringBuilder builder = new StringBuilder();
        No atual = primeiro;

        for (int i = 0; i < this.cont - 1; i++) {
            builder.append(atual.getElemento());
            builder.append(", ");
            atual = atual.getProximo();

        }
        builder.append(atual.getElemento());
        return builder.toString();

    }

    /**
     * Esse metodo busca na lista de elementos de acordo com o nome inserido
     * Caso ele não encontre o nome, significa que o nome presente não a na lista
     * ou seja não foi encontrado
     *
     */
    public No busca(String elemento){
        No busca = this.primeiro;

        for(int i = 0; i < this.cont; i++){
            if(busca.getElemento().equalsIgnoreCase(elemento)){

                return busca;
            }
            busca = busca.getProximo();
        }
        return null;

    }
    public void numberLista(){
        System.out.println(this.cont);
    }

    public void excluir(String elemento){
        No excluir = busca(elemento);
        if(cont == 0){
            System.out.println("lista vazia");
        }
        if(excluir.getAnterior() == null){
            cont --;
           this.primeiro.getProximo().setAnterior(null);
           this.primeiro = excluir.getProximo();

        } else {

        }

    }
}
