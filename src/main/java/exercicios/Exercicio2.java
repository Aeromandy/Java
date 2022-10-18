package exercicios;

import java.util.Locale;
import java.util.Scanner;

/* 2) Faça um programa que:
- Leia a cotação do dólar
- Leia um valor em dólares
- Converta esse valor para Real
- Mostre o resultado */
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double cotacaoDolar, valorDolar, valorReal;

        System.out.println("Digite a cotação do dólar: ");
        cotacaoDolar = entrada.nextDouble();

        System.out.println("Digite o valor em dólar(es): ");
        valorDolar = entrada.nextDouble();

        valorReal = cotacaoDolar * valorDolar;

        System.out.println("O valor em reais é R$" + valorReal);
    }
}