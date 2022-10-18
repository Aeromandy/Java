package exercicios;

import java.util.Scanner;

/* 13) Escreva um programa que leia 3 números inteiros e imprima na tela os valores em ordem decrescente. */
public class Exercicio13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int n1 = entrada.nextInt();
        System.out.println("Digite um número: ");
        int n2 = entrada.nextInt();
        System.out.println("Digite um número: ");
        int n3 = entrada.nextInt();

        System.out.println("Os valores em ordem decrescente são: (n - 1)");

    }
}
