package exercicios;

import java.util.Scanner;

/* 18) Escreva um programa que leia um número inteiro (variável CODIGO). Verificar se o código é igual a 1, igual a 2 ou
igual a 3. Caso não seja, apresentar a mensagem “Código inválido”. Ao ser verificado o código e constatado que é
um valor válido, o programa deve verificar cada código em separado para determinar seu valor por extenso, ou
seja, apresentar a mensagem “um”, ”dois” ou “três”. (Utilizar o comando Switch). */
public class Exercicio18 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o código: 1, 2 ou 3 ");
        int codigo = entrada.nextInt();

        switch (codigo) {
            case 1 -> {
                System.out.println("Um");
            }
            case 2 -> {
                System.out.println("Dois");
            }
            case 3 -> {
                System.out.println("Três");
            }
            default -> {
                System.out.println("Código Inválido");
            }
        }


    }
}
