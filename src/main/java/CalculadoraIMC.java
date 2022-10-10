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
    }
}
