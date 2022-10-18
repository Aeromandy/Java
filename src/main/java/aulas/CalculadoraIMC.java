package aulas;

import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual é o seu nome?");
        String nome = entrada.nextLine();

        System.out.println("Qual sua idade?");
        int idade = entrada.nextInt();

        System.out.println("Qual sua altura (m)?");
        double altura = entrada.nextDouble();

        System.out.println("Qual su peso? (Kg)");
        double peso = entrada.nextDouble();

        // IMC = peso / altura ^ 2
        double imc = peso / (altura * altura); // ou peso = Math.pow(altura, 2)

        System.out.println("Olá, " + nome + " seu IMC é " + imc);
        System.out.printf("Este é seu IMC = %.2f\n", imc);
        System.out.printf("Olá, meu nome é %s e tenho %d anos!\n", nome, idade);

        if (imc < 17) {
            System.out.println("Muito abaixo do peso");
        } else if (imc >= 17 && imc <= 18.49) {
            System.out.println("Abaixo do peso");
        } else if (imc >= 18.5 && imc <= 24.99) {
            System.out.println("Peso normal");
        } else if (imc >= 25 && imc <= 29.99) {
            System.out.println("Acima do peso");
        } else if (imc >= 30 && imc <= 34.99) {
            System.out.println("Obesidade");
        } else if (imc >= 35 && imc <= 39.99) {
            System.out.println("Obesidade severa");
        } else {
            System.out.printf("Obesidade mórbida");
        }
        // Switch-case => estrutura de seleção
        System.out.println("Selecione uma dieta(1 a 3)");
        System.out.println("1 - Agua");
        System.out.println("2 - Fruta");
        System.out.println("3 - Batata");

        int dieta = entrada.nextInt();

        switch (dieta) {
            case 1:
                System.out.println("Você escolheu a dieta da água");
                break; // impede de testar as condições abaixo
            case 2:
                System.out.println("Você escolheu a dieta da fruta");
                break;
            case 3:
                System.out.println("Você escolheu a dieta da batata");
                break;
            default: // ""else""
                System.out.println("Esta opção é inválida");
        }

        System.out.println("Você tem quantos alimento preferidos?");
        int totalAlimentos = entrada.nextInt();

        for(int i=0; i < totalAlimentos; i++) {
            System.out.println(i);
            // String alimento = entrada.next();
            // System.out.println("Você gosta de " + alimento);
        }

        int i = 0;
        while(i < totalAlimentos) {
            System.out.println(i);
            i++;
        }
        System.out.println(i);
    }
}
