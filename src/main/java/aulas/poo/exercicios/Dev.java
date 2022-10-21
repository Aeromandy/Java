package aulas.poo.exercicios;

public class Dev extends Pessoa {
    private String linguagem;

    public Dev(String nome, String idade, String profissao, double peso, String linguagem) {
        super(nome, idade, peso);
        this.linguagem = linguagem;
    }

    @Override
    public void dormir() {
        super.dormir();
        System.out.println("Eu sou um desenvolvedor em treinamento, não consigo dormir");
    }
}





