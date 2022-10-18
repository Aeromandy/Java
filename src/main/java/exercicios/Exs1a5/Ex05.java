package exercicios.Exs1a5;

import java.util.Scanner;

// Criar um programa que lê N e depois N valores armazenados no array, em seguida retorna a soma total e a média dos valores
public class Ex05 {
    public static void main(String[] args) {
        double total = 0;
        double media = 0;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe a quantidade de numeros: ");
        int n = entrada.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Infome o valor da " + (i + 1) + "º posição");
            array[i] = entrada.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }

        media = total / array.length;
        System.out.println("A soma total dos valores no array é " + total);
        System.out.println("E a média dos valores é "+ media);

    }
}
