package fazendosozinh;

public class testarLista {
    public static void main(String[] args) {
        Listinha lista  = new Listinha();


        lista.adicionar("walmir");
        lista.adicionar(1);
        lista.adicionar("valdir");
        lista.adicionar("walmir");
        lista.adicionar("juca");
        lista.adicionar("valdir");

        System.out.println( lista);


        System.out.println( lista.getposicao(1));

    }
}
