package Aula12;

public class Ordenar {
    public static void main(String[] args) {

        System.out.println("Ordenar Integer:");
        Integer arrayInteiro[] = {87,21,54,51,49822,6,894,3,9,651,963,1};
        bubbleSortInt(arrayInteiro,true);
        bubbleSortInt(arrayInteiro,false);

        System.out.println("Ordenar String:");
        String vetorTexto[] = {"zz", "aa", "cc","98","01","00", "hh", "bb", "ee", "ll"};
        bubbleSortString(vetorTexto,true);
        bubbleSortString(vetorTexto,false);

    }

    private static void bubbleSortInt(Integer arrayInteiros[], Boolean orderAZ) {
        boolean troca = true;
        int aux;
        int quantos;
        while (troca) {
            troca = false;
            for (int i = 0; i < arrayInteiros.length - 1; i++) {
                if (orderAZ) {
                    if (arrayInteiros[i] > arrayInteiros[i + 1]) {
                        aux = arrayInteiros[i];
                        arrayInteiros[i] = arrayInteiros[i + 1];
                        arrayInteiros[i + 1] = aux;
                        troca = true;
                    }
                } else {
                    if (arrayInteiros[i] < arrayInteiros[i + 1]) {
                        aux = arrayInteiros[i];
                        arrayInteiros[i] = arrayInteiros[i + 1];
                        arrayInteiros[i + 1] = aux;
                        troca = true;
                    }

                }
            }
        }
        quantos=0;
        aux=0;
        for (int i = 0; i < arrayInteiros.length; i++) {
            System.out.println(arrayInteiros[i]);
            aux= arrayInteiros[i] + aux;
            quantos++;
        }
        System.out.println("A soma é: "+aux);
        System.out.println("Total de itens somados: "+quantos+" e a media é: "+aux/quantos);
    }

    private static void bubbleSortString(String arrayString[], Boolean orderAZ) {
        boolean troca = true;
        String aux;
        while (troca) {
            troca = false;
            for (int i = 0; i < arrayString.length - 1; i++) {
                //System.out.println();
                if (orderAZ) {
                    if (arrayString[i].compareTo(arrayString[i + 1]) > 0) {
                        aux = arrayString[i];
                        arrayString[i] = arrayString[i + 1];
                        arrayString[i + 1] = aux;
                        troca = true;
                    }
                } else {
                    if (arrayString[i].compareTo(arrayString[i + 1]) < 0) {
                        aux = arrayString[i];
                        arrayString[i] = arrayString[i + 1];
                        arrayString[i + 1] = aux;
                        troca = true;
                    }
                }
            }
        }
        for (int i = 0; i < arrayString.length; i++) {
            System.out.println(arrayString[i]+",");
            if (arrayString[i].toUpperCase().startsWith("A")) {
                System.out.println(arrayString[i]+" começa com 'A'");
            }
        }
    }
}
