package exercicios;

import java.util.Scanner;

/*  8) Calcular e apresentar o valor do volume de uma lata de óleo, utilizando a fórmula:
V = 3.14159 * R * R * A
Onde as variáveis: V, R e A representam respectivamente o volume, o raio e a altura. */
public class Exercicio8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double r = 0;
        double a = 0;

        System.out.println("Qual o raio da lata de óleo em cm: ");
        r = entrada.nextDouble();
        System.out.println("Qual a altura da lata de óleo em cm: ");
        a = entrada.nextDouble();

        double v = 3.14159 * r * r * a;
        System.out.println("O volume da lata de óleo é " + v);
    }

}
