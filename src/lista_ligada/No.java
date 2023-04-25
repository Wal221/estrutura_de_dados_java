package lista_ligada;

public class No {

    private No proxima;
    private Object elemento;

    public No(No proxima, Object elemento){
        this.proxima= proxima;
        this.elemento= elemento;

    }
    public No(Object elemento){
        this.elemento= elemento;
    }
    public void setProxima(No proxima) {
        this.proxima = proxima;
    }

    public No getProxima() {
        return proxima;
    }
    public Object getElemento() {
        return elemento;
    }

}
