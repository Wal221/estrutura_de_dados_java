package fazendosozinh;

public class Listinha {
    private no primeiro;
    private no ultimo;
    int numElementos = 0;


    public void adicionar(Object elemento) {
        no novo = new no(elemento);
        /**
         * Se os dois elementos forem null eles recebem o primeiro elemento
         * sendo esse element o primeiro e o ultimo
         */
        if (this.numElementos == 0) {
            this.primeiro = novo;
            this.ultimo = novo;
            this.numElementos++;
        } else {
            this.ultimo.setProximo(novo);
            this.ultimo = novo;
            this.numElementos++;
        }

    }

    @Override
    public String toString() {
        if(this.numElementos == 0){
            return "";

        }
        StringBuilder builder = new StringBuilder();
        no atual = primeiro;

        for (int i = 0; i < this.numElementos - 1; i++) {
            builder.append(atual.getElemento());
            builder.append(", ");
            atual = atual.getProximo();

        }
        builder.append(atual.getElemento());
        return builder.toString();

    }
    public no getposicao(int posicao){
        no atual = primeiro;
        for(int i = 0 ; i < posicao ; i++ ){
            atual= atual.getProximo();

        }
        return  atual;

    }
    }


