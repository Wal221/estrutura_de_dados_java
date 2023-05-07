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
}
