package aulas.poo.exercicios;

public class Pessoa {
    private String nome;
    private String idade;

    private double peso;

    public Pessoa(String nome, String idade, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }

    public void comer(String comida) {
        System.out.println("Estou comendo" + comida);
    }

    public void dormir() {
        System.out.println("Zzzzzzzz");
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double novoPeso) {
        this.peso = novoPeso;
    }

    public static void main(String[] args) {

    }
}
