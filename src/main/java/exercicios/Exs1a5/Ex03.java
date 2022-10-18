package exercicios.Exs1a5;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um tamanho: ");
        int tamanho = entrada.nextInt();

        int[] v1 = new int[tamanho];
        int[] v2 = new int[tamanho];

        System.out.println("Digite os valores de v1: ");
        for(int i = 0; i < tamanho; i++) {
            v1[i] = entrada.nextInt();
        }

        System.out.println("Digite os valores de v2: ");
        for(int i = 0; i < tamanho; i++) {
            v2[i] = entrada.nextInt();
        }
        int match= 0;

        for(int i = 0; i < tamanho; i++) {
            if(v1[i] == v2[i]) {
                match++;
            }
        }
        System.out.println("Foram " + match + " match(es)");
    }
}
