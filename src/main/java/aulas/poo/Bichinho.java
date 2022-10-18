package aulas.poo;

import java.util.ArrayList;

public class Bichinho {
    private String nome;
    private int idade;
    private double peso;
    ArrayList<Comida> bucho = new ArrayList();
    private boolean estaDormindo;

    Bichinho(String nome, int idade, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.estaDormindo = false;
    }
    public void setComer(Comida novaComida) {
        if (this.estaDormindo && !bucho.contains(novaComida)){
            bucho.add(novaComida);
            this.peso += novaComida.getPeso();
        } else {
            System.out.println("Comida repetida");
        }

    }

    public void getAcordar() {
        if(!this.estaDormindo) {
            this.estaDormindo = true;
        }
    }

    public void setDormir(int horas) {
        this.estaDormindo = true;

        this.peso = this.peso - 0.1 * horas;
    }

    public static void main(String[] args) {
        Bichinho urso = new Bichinho("Poo", 25, 10);

        Comida mel = new Comida("Mel", 0.5);
        Comida batata = new Comida("Batata", 1);
        System.out.println(urso.peso);

        urso.setDormir(2);
        System.out.println(urso.peso);

        System.out.println("-------------");

        urso.setComer(mel);
        System.out.println(urso.peso);

        System.out.println("--------------");

        urso.setComer(batata);
        System.out.println(urso.peso);
    }
}
