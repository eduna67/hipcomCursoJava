package Aula12;

import java.io.IOException;

public class Ordenar {
    public static void main(String[] args) {

        int quantidade = 10000;
        int[] vetor = new int[quantidade];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random()*quantidade);
        }

        long tempoInicial = System.currentTimeMillis();
        bubbleSortInt(vetor);

        String vetorTexto[] = {"zz", "aa", "cc", "hh", "bb", "ee", "ll"};
        bubbleSortString(vetorTexto);

        long tempoFinal = System.currentTimeMillis();

        System.out.println("Executado em = " + (tempoFinal - tempoInicial) + " ms");

    }

    private static void bubbleSortInt(int vetor[]){
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
        for (int i =0; i<vetor.length-1; i++) {
            System.out.println(vetor[i]);
        }
    }

    private static void bubbleSortString(String vetor[]){
        boolean troca = true;
        String aux;
        while (troca) {
            troca = false;
            for (int i = 0; i < vetor.length - 1; i++) {
                //System.out.println();
                if (vetor[i].compareTo(vetor[ i+1 ])>0) {
                    aux = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = aux;
                    troca = true;
                }
            }
        }
        for (int i =0; i<vetor.length-1; i++) {
            System.out.println(vetor[i]);
        }
    }


}
