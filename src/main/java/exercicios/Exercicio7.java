package exercicios;

import java.util.Scanner;
/* 7) Ler uma temperatura em graus Fahrenheit e apresentá-Ia convertida em graus Celsius. A fórmula de conversão de
        temperatura a ser utilizada é C = (F - 32) * 5 / 9, em que a variável F é a temperatura em graus Fahrenheit e a
        variável C é a temperatura em graus Celsius. */
public class Exercicio7 {
        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
            System.out.println("Qual a temperatura em Fahrenheit: ");
            double F = entrada.nextDouble();
            double C = (F - 32) * 5 / 9;
            System.out.println("A temperatura em Celsius é " + C);
        }
}
