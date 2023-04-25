package lista_ligada;

public class ListaLigada {
    private No primeira;
    private No ultimo;

    private int totalElementos;

    public void adicionarNocomeço(Object elemento){
        No nova = new No(this.primeira,elemento);
        this.primeira = nova;
        if( this.totalElementos == 0){
            //caso especial se a lista estiver vazia
            this.ultimo = this.primeira;

        }
        this.totalElementos ++;

    }
    public void adicionar(Object elemento){
        if(totalElementos == 0){
            this.adicionarNocomeço(elemento);
        }else{
            No novo = new No(elemento);
            //se a lista não estiver vazia eu faço o ultimo elemento inserido
            //apontar para a referencia do proximo
            this.ultimo.setProxima(novo);
            //como a inserção e sempre ocorre no final da lista , agora eu posso
            //atualizar o meu elemento sendo ele agora o ultimo elemento da lista
            this.ultimo= novo;
            this.totalElementos++;
        }

    }
}
