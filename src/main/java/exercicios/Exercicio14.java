package exercicios;
/* 14) Escreva um programa que leia dois números e apresente a diferença do maior para o menor. */
import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int n1 = entrada.nextInt();
        System.out.println("Digite um número: ");
        int n2 = entrada.nextInt();

        if (n1 > n2) {
            System.out.println(" A diferença entre " + n1 + " e " + n2 + " é " +  (n1 - n2));
        } else {
            System.out.println(" A diferença entre " + n1 + " e " + n2 + " é " +  (n2 - n1));
        }
    }
}
