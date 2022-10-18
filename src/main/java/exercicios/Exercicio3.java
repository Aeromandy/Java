package exercicios;

import java.util.Scanner;

/* 3) Faça um programa para pagamento de comissão de vendedores de peças, levando-se em consideração que sua
comissão será de 5% do total da venda e que você tem os seguintes dados:
- Identificação do vendedor
- Código da peça
- Preço unitário da peça
- Quantidade vendida */
public class Exercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Identificação do vendedor: ");
        int idVendedor = entrada.nextInt();

        System.out.println("Código da peça: ");
        int codPeca = entrada.nextInt();

        System.out.println("Preço da peça: ");
        double preco = entrada.nextDouble();

        System.out.println("Quantidade de peças vendidas: ");
        int qtdPecas = entrada.nextInt();

        // double totalComComissao = preco * qtdPecas + 0.5%;




    }
}
