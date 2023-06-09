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
            return " ";

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
            return;
        }

          //se ouver somente um elemento na lista sera removido
         if(excluir.getAnterior() == null && excluir.getProximo() == null){
            this.primeiro = null;
            this.ultimo = null;
            cont --;

        }
         //remove o primeiro elemento
         else if(excluir.getAnterior() == null){
             this.primeiro = this.primeiro.getProximo();
             this.primeiro.setAnterior(null);
             this.cont --;


        }//remove o ultimo elemento
         else if(excluir.getProximo() == null){

          this.ultimo = this.ultimo.getAnterior();
          //vale ressaltar que essa forma de fazer o elemento aponta para o anterior , e equivalente a
             //fazer a elemento aponta para o null , ja que e o ultimo elemento
           this.ultimo.setProximo(excluir.getProximo());
             cont --;

        }
        else {
            //para remover um elemento do meio da lista
            excluir.getAnterior().setProximo(excluir.getProximo());
            excluir.getProximo().setAnterior(excluir.getAnterior());
            excluir = excluir.getProximo();
             cont --;

        }



    }
}
