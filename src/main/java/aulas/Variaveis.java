package aulas;

public class Variaveis {
    // Execução do nosso programa JAVA
    public static void main(String[] args) {
        System.out.println("Hello, Java!");

        // Variáveis no JAVA
        // fortemente tipado e estaticamente tipado
        int idade = 20;
        double salario = 4500.99;
        float nota = 7.5f;
        long populaçãoTerra = 7_900_000_000l;
        boolean tarefaConcluida = true;
        int i = 1, j = 0, k = 1000; // multiplas variaveis
        String nomeCompleto = "Amanda Rodrigues";

        int teste = 10;
        teste = 9; // reatribuindo valores

        final int teste2 = 200; // não deixa mudar o valor da variável
        // teste2 = 1000;

        // Operadores
        int a = 10;
        int b = 5;

        int soma = a + b;

        System.out.println("O resultado da soma é " + soma);

        // A DIVISÃO ENTRE DOIS INTEIROS RESULTA EM UM INTEIRO
        int sete = 7;
        int dois = 2;
        double dois2 = 2.0;
        System.out.println(sete / dois);
        System.out.println(sete / dois2);

        // Math
        double x = Math.sqrt(144);
        double y = Math.pow(5, 2);
        System.out.println(Math.PI);
        // Casting
        int pi2 = (int) Math.PI;
        System.out.println(pi2);

        double resultado = sete / (double) dois;
        System.out.println(resultado);

        // Operadores 2
        int valor = 5;
        valor++;
        valor--;
        valor += 10;

        // Operadores relacionais
        boolean teste1 = 5 > 1; // true
        boolean teste3 = 5 < 1; // false
        boolean teste4 = 5 == 5; // false
        boolean teste5 = 5 != 1; // true
        boolean teste6 = 6 >= 6; // true
        boolean teste7 = 5 <= 9; // true

        // Operadores lógicos
        boolean teste8 = true && false; // false
        boolean teste9 = true || false; // true
        boolean teste10 = (5 > 10) && (10 < 5); // false
        boolean teste11 = (10 >= 0) || (1 < 5); // true
        boolean teste12 = (5 > 1); // true
        boolean teste13 = !teste12; // false

    }
}
