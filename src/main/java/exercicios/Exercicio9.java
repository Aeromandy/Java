package exercicios;

import java.util.Scanner;

/* 9) Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade dessa
pessoa expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias. */
public class Exercicio9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idade = entrada.nextInt();
        int idadeEmMeses = idade * 30;
        int idadeEmDias = idade * 365 + idadeEmMeses + idade;
        System.out.println("Sua idade em anos é " + idade + "\n em meses " + idadeEmMeses + "\n em dias " + idadeEmDias);
    }
}
