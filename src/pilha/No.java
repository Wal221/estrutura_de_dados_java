package pilha;

public class No {
    private No proximo;

    private Object elemento;


    public  No(Object element){
        this.elemento = element;

    }
    public No(No proximo, Object elemento) {
        this.proximo = proximo;
        this.elemento = elemento;
    }

    public No getproximo() {
        return proximo;
    }

    public void setproximo(No proximo) {
        this.proximo = proximo;
    }

    public Object getElemento() {
        return elemento;
    }

    public void setElemento(Object elemento) {
        this.elemento = elemento;
    }
}
