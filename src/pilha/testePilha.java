package pilha;

import org.w3c.dom.ls.LSOutput;

public class testePilha {
    public static void main(String[] args) {
        Pilha pilha = new Pilha();
        pilha.adicionar(1);
        System.out.println(pilha);
        pilha.excluir();
        System.out.println(pilha);
        pilha.adicionar(23);
        System.out.println(pilha);


    }
}
