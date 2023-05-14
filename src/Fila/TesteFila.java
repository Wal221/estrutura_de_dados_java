package Fila;

public class TesteFila {
    public static void main(String[] args) {
        Fila fila = new Fila();
        fila.adicionar("A");
       // fila.adicionar("b");
        //fila.adicionar("c");
        System.out.println(fila);
        fila.apaga();
        System.out.println(fila);
        fila.adicionar("GH");
        fila.adicionar("jefersson");
        fila.adicionar("hugo");
        System.out.println(fila);
        fila.apaga();
        System.out.println(fila);
        fila.apaga();
        System.out.println(fila);
        fila.apaga();
        System.out.println(fila);
    }
}
