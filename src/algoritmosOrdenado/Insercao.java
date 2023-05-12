package algoritmosOrdenado;

import java.util.Arrays;

public class Insercao {

    public static void main(String[] args) {
        int vetor[] = {0, 3,1,5,7};
        insercao(vetor);
        System.out.println(Arrays.toString(vetor));
        System.out.println();

    }
    public static void insercao(int v []){
        int j ;
        for(int i = 2 ; i < v.length; i++){
            int x  = v[i];
             j = i -1;
             v[0] = x;

            while( x < v[j] ){
                v[j + 1] = v[j];
                j--;
            }
            v[ j + 1] = x;
        }
    }

}

