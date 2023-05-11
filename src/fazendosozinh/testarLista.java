package fazendosozinh;

public class testarLista {
    public static void main(String[] args) {
        Listinha lista  = new Listinha();


        lista.adicionar("walmir");

        System.out.println( lista);


        System.out.println( lista.getposicao(0));

        System.out.println( lista);

    }
}
