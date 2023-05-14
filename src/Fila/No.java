package Fila;

public class No {
    private No anterio;
    private Object element;

    public No(No anterio ,Object element) {
        this.element = element;
        this.anterio = anterio;
    }

    public No getAnterio() {
        return anterio;
    }

    public void setAnterio(No anterio) {
        this.anterio = anterio;
    }

    public Object getElement() {
        return element;
    }

    public void setElement(Object element) {
        this.element = element;
    }
}
