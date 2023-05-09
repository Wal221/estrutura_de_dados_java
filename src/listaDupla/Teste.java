package listaDupla;

public class Teste {
    public static void main(String[] args) {
        ListDupla list = new ListDupla();

        list.adicionar("Walmir");
        list.adicionar("valdir");
        list.adicionar("iza");
        list.adicionar("Salviano");

        System.out.println(list.busca("iza"));
        System.out.println(list);
        list.numberLista();
        list.excluir("iza");
        System.out.println(list);


    }
}
