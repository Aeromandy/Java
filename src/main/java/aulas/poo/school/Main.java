package aulas.poo.school;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Eduardo Lima", "edu.lima@gmail.com", "890890890", 7.5);
        aluno.seApresentar();

        Professor prof = new Professor("João Carlos", "joaoc@gmail.com", "098766554", "TI");
        prof.seApresentar();

        Pessoa p1 = new Pessoa("Ana Maria", "mari@gmail.com", "65434689");

        Pessoa p2 = new Aluno("Carlos José", "carlosj@gmail.com", "98779765", 7.5);

        Pessoa p3 = new Professor("José Silva", "josesilva@gmail.com", "65457890", "TI");

        System.out.println("---------------------");

        p2.seApresentar();
        p3.seApresentar();

        // Polimorfismo
        System.out.println("=== PESSOAS ===");
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(aluno);
        pessoas.add(prof);
        pessoas.add(p1);
        pessoas.add(p2);
        pessoas.add(p3);

        for(Pessoa pessoa : pessoas) {
            // o método seApresentar se comporta diferente dependendo da classe original
            pessoa.seApresentar();
        }

    }
}