package Aula12;

public class Ordenar {
    public static void main(String[] args) {

        long tempoInicial = System.currentTimeMillis();

        System.out.println("Ordenar Integer:");
        Integer vetor[] = {87,21,54,51,49822,6,894,3,9,651,963,1};
        //Integer vetor[] = {9,6,3,1}; //87,21,54,51,6,894,3,9,651,963,1};
        bubbleSortInt(vetor);

        System.out.println("Ordenar String:");
        String vetorTexto[] = {"zz", "aa", "cc","98","01","00", "hh", "bb", "ee", "ll"};
        bubbleSortString(vetorTexto);

        long tempoFinal = System.currentTimeMillis();

        System.out.println("Executado em = " + (tempoFinal - tempoInicial) + " ms");

    }

    private static void bubbleSortInt(Integer vetor[]) {
        boolean troca = true;
        int aux;
        while (troca) {
            troca = false;
            for (int i = 0; i < vetor.length - 1; i++) {
                if (vetor[i] > vetor[i + 1]) {
                    aux = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = aux;
                    troca = true;
                }
            }
        }
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }

    private static void bubbleSortString(String vetor[]) {
        boolean troca = true;
        String aux;
        while (troca) {
            troca = false;
            for (int i = 0; i < vetor.length - 1; i++) {
                //System.out.println();
                if (vetor[i].compareTo(vetor[i + 1]) > 0) {
                    aux = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = aux;
                    troca = true;
                }
            }
        }
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]+",");
        }
    }


}
