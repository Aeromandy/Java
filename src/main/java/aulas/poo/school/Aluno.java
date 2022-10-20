package aulas.poo.school;

public class Aluno extends Pessoa {
    private double media;

    public Aluno(String nome, String email, String cpf, double media) {
        super(nome, email, cpf);
        this.media = media;
    }

    @Override
    public void seApresentar() { // nessa opção mudamos o comportamento apenas
        super.seApresentar();
        System.out.println("Eu sou um aluno com média = " + this.media);
    }

    public double getMedia() {
        return this.media;
    }
}

