package fazendosozinh;

public class no {
    private no proximo;

    private Object elemento;

    public no( Object elemento) {
       // this.proximo = proximo;
        this.elemento = elemento;
    }

    public no getProximo() {
        return proximo;
    }

    public void setProximo(no proximo) {
        this.proximo = proximo;
    }

    public Object getElemento() {
        return elemento;
    }

    public void setElemento(Object elemento) {
        this.elemento = elemento;
    }

    @Override
    public String toString() {
        return  " " + elemento
                ;
    }
}
