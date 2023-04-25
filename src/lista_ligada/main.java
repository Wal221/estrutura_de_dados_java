package lista_ligada;

public class main {
    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();

        lista.adicionarNocomeco("Walmir");
        lista.adicionar("joao");
        lista.adicionar("fernanda");

        System.out.println(lista);

    }
}
