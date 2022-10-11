import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers.length);

        for(int i = 0; i < numbers.length; i++) {
            System.out.println("A posição " + i + " com valor de " + numbers[i]);
        }

        int[] numbers2 = new int[50]; // 0...49 posições

        double[] notas = new double[5];
        String[] nomes = {"José", "Maria", "Ana"};
        String[] sobrenomes = new String[10];

        Scanner entrada = new Scanner(System.in);

        // System.out.println("Digite um número: ");
        // int quantidade = entrada.nextInt();
        // boolean[] valores = new boolean[quantidade];

        // Exemplo
        System.out.println("Digite o total de notas: ");
        int totalNotas = entrada.nextInt();

        double[] notasProva = new double[totalNotas];

        for(int i = 0; i < totalNotas; i++) {
            System.out.println("Digite o valor da nota ");
            notasProva[i] = entrada.nextDouble();
        }

        double soma = 0.0;
        for(double nota: notasProva) {
            soma += nota;
        }

        double media = soma/ totalNotas; // ou double media = soma/ notasProva.length;

        // Condição ternária
        String msg = (media < 7) ? "REPROVADO" : "APROVADO";
        System.out.println(msg);

        // Default values
        int numero; // padrão = 0
        double nota2; // padrão = 0.0
        long populacao; // padrão = 0
        boolean teste; // padrão = false
        String nome; // null => ausência de objeto na variável

        // Wrapper classes
        Integer n2 = 1;
        Double nota3 = 1.0;
        Long pop2 = 1L;
        Boolean teste2 = false;

    }
}
