package exercicios.Exs1a5;

import java.util.Locale;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        System.out.println("Escolha uma opção (1 a 4): ");
        System.out.println("1- Adição\n2- Subtração\n3- Multiplicação\n4- Divisão");
        int opcao = entrada.nextInt();

        System.out.println("Digite o primeiro valor");
        double valor1 = entrada.nextDouble();

        System.out.println("Digite o segundo valor");
        double valor2 = entrada.nextDouble();

        switch (opcao) {
            case 1 -> {
                System.out.println("O resultado da soma é " + (valor1 + valor2));
            }
            case 2 -> {
                System.out.println("O resultado da subtração é " + (valor1 - valor2));
            }
            case 3 -> {
                System.out.println("O resultado da multiplicação é " + (valor1 * valor2));
            }
            case 4 -> {
                System.out.println("O resultado da divisão é "+ (valor1 / valor2));
            }
            default -> {
                System.out.println("Opção Inválida");
            }
        }

    }
}
