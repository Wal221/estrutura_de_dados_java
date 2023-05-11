package listaDupla;

public class Teste {
    public static void main(String[] args) {
        ListDupla list = new ListDupla();

        list.adicionar("Walmir");
        list.adicionar("valdir");
        list.adicionar("iza");

       // System.out.println(list.busca("salviano"));
        System.out.println(list);
        list.numberLista();
      list.excluir("Walmir");

        System.out.println(list);
        list.excluir("iza");

        System.out.println(list);
        list.excluir("valdir");
        System.out.println(list);
        list.adicionar("Kevin");
        System.out.println(list);



    }
}
