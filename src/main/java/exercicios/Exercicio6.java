package exercicios;

import java.util.Scanner;

/* 6) Ler uma temperatura em graus Celsius e apresentá-Ia convertida em graus Fahrenheit. A fórmula de conversão de
temperatura a ser utilizada é F = (9 * C + 160) / 5, em que a variável F representa é a temperatura em graus
Fahrenheit e a variável C representa é a temperatura em graus Celsius. */
public class Exercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual a temperatura em Celsius: ");
        double C = entrada.nextDouble();
        double F = (9 * C + 160) / 5;
        System.out.println("A temperatura em Fahrenheit é " + F);
    }
}
