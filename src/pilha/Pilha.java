package pilha;

public class Pilha {
    private No primeira;
    private No ultimo;

    private int cont;


    public void adicionar(Object element) {

     No novo = new No(this.primeira,element);
        if (this.cont == 0) {
            //caso especial se a lista estiver vazia
            this.primeira = novo;
            this.ultimo = this.primeira;

        } else {
            //se a lista não estiver vazia eu faço o ultimo elemento inserido
            //apontar para a referencia do proximo , ja que o mesmo e uma pilha e a cada elemento novo
            //so se sabe o seu anterior
            this.ultimo.setproximo(novo);
            //como a inserção e sempre ocorre no topo da pilha, agora eu posso
            //atualizar o meu elemento sendo ele agora o ultimo elemento da lista
            this.ultimo = novo;
        }
        this.cont++;

    }
     public void excluir(){

        if(cont == 0){
            System.out.println("lista vazia!! ");

        }
        this.ultimo = null;
         cont --;
     }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder();
         No atual = this.primeira;

        for (int i = 0; i < this.cont ; i++) {
            if (atual != null) {
                builder.append(atual.getElemento());
                builder.append(", ");
                atual = atual.getproximo();
            } else {
                break;
            }
        }

        return builder.toString();
    }
}
