package exercicios;

import java.util.Scanner;

/* 16) Escreva um programa que leia dois números e exiba mensagem informando o valor do maior número e o valor do
menor número. Se os dois números forem iguais, o programa deve exibir mensagem informando este fato. */

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int n1 = entrada.nextInt();
        System.out.println("Digite um número: ");
        int n2 = entrada.nextInt();

        if (n1 > n2) {
            System.out.println("O número " + n1 + " é maior que o número " + n2);
        } else if (n2 > n1) {
            System.out.println("O número " + n2 + " é maior que o número " + n1);
        } else {
            System.out.println("O número " + n1 + " é igual ao número " + n2);
        }
    }
}
