package Fila;

public class Fila {
    private No primeiro;
    private  No ultimo;


    private int cont;

    public Fila(){
        this.cont = 0;
    }

    public void adicionar(Object element){
        No novo = new No(this.primeiro, element);

        if(this.cont == 0){
            this.primeiro = novo;
            this.ultimo = novo;
            this.cont ++;
        }else{
            this.ultimo.setAnterio(novo);
            this.ultimo =novo;
            this.cont ++;
        }

    }
    public void apaga(){
        if(this.cont == 0){
            System.out.println("Fila vazia , não a elementos para apagar");
        } else if(this.ultimo == this.primeiro){
            this.ultimo = null;
            this.primeiro = null;
            cont --;
        } else{
            this.primeiro = primeiro.getAnterio();
            cont --;

        }
    }
    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder();
         No atual = this.primeiro;
         if(cont == 0){
             System.out.println("Lista vazia");

         }
        for (int i = 0; i < this.cont ; i++) {
            if (atual != null) {
                builder.append(atual.getElement());
                builder.append(", ");
                atual = atual.getAnterio();
            } else {
                break;
            }
        }

        return builder.toString();
    }

}
