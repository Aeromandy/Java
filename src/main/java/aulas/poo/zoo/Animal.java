package aulas.poo.zoo;
/* Na interface você define um conjunto de métodos (sem corpo) e a classe que "herda" deve implementar estes métodos */
public interface Animal {
    void dormir();  // apenas definição do método
    void fazerSom();
    void comer(String comida);
}

class Gato implements Animal {
    @Override
    public void dormir() {
        System.out.println("Zzzzzzzzz");
    }

    @Override
    public void fazerSom() {
        System.out.println("Miau");
    }

    @Override
    public void comer(String comida) {
        if(comida.equals("Peixe")) {
            System.out.println("Hummmmm");
        } else {
            System.out.println("Só como peixe");
        }
    }
}

class Galinha implements Animal {

    @Override
    public void dormir() {
        System.out.println("ZZZzzz");
    }

    @Override
    public void fazerSom() {
        System.out.println("Có có ri có");
    }

    @Override
    public void comer(String comida) {
        System.out.println("Hummm " + comida);
    }

    public static void main(String[] args) {
        Galinha galinha = new Galinha();
        Gato gato = new Gato();

        galinha.fazerSom();
        galinha.dormir();
        galinha.comer("Milho");

        gato.fazerSom();
        gato.dormir();
        gato.comer("Peixe");

        /* Não é possível criar um objeto na interface
        Animal novoAnimal = new Animal(); não pode pois é interface
         */

        Animal animalGalinha = new Galinha();
        Animal animalGatinho = new Gato();
        System.out.println("== POLIMORFISMO ==");
        animalGalinha.fazerSom();
        animalGatinho.fazerSom();
    }

}


