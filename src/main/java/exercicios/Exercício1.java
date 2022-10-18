package exercicios;
/* 1) Faça um programa para calcular o estoque médio de uma peça, sendo que:
//ESTOQUE MÉDIO = (QUANTIDADE_MÍNIMA + QUANTIDADE_MÁXIMA) / 2. */
public class Exercício1 {
    public static void main(String[] args) {
        double qtdMin = 3;
        double qtdMax = 30;
        double mediaEstoqoue = (qtdMin + qtdMax) / 2;
        System.out.println("O estoque médio é de " + mediaEstoqoue);

    }

}
