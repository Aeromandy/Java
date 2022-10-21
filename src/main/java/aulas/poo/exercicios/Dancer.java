package aulas.poo.exercicios;

public class Dancer extends Pessoa {
    private String dancar;

    public Dancer(String nome, String idade, double peso, String dancar) {
        super(nome, idade, peso);
        this.dancar = dancar;
    }

    public double getPeso() {
        return this.getPeso();
    }



    @Override
   public void comer(String comida) {
        System.out.println("Estou comendo " + comida);

    }

    public void dancar() {
        System.out.println("Estou dançando para emagrecer");


    }



}

