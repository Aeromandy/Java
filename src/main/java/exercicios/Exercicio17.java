package exercicios;

import java.util.Scanner;

/* 17) Escreva um programa que leia um número inteiro. Verificar por meio de condição se o valor fornecido está na faixa
        entre 0 (zero) e 9 (nove). Caso o valor fornecido esteja dentro da faixa, apresentar a mensagem “valor válido”.
        Caso contrário, apresentar a mensagem “valor inválido”. */
public class Exercicio17 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int n = entrada.nextInt();

        if (n >= 0 && n <= 9 ) {
            System.out.println("Valor válido");
        } else {
            System.out.println("Valor inválido");
        }
    }
}

