package aulas.poo;

public class Cachorro extends Pet {
    private String comidaFavorita;
    private String raca;

    public Cachorro(String nome, int idade, double peso, String comidaFavorita, String raca) {
        super(nome, idade, peso); // chama o construtor da super classe
        this.comidaFavorita = comidaFavorita;
        this.raca = raca;
    }

    @Override // sobrescreve a açao de fazer som
    public void fazerSom() {
        System.out.println("Au auuuuuuu");
    }

    @Override
    public void brincar() {
        this.fazerSom();
        super.brincar();
        this.dormir(); // podemos usar this porque esse método não foi sobrescrito
    }

    @Override
    public void comer(String comida) {
        if(comida.equals(this.comidaFavorita)) {
            super.comer(comida);
            this.peso += 0.2;
        } else {
            System.out.println("Quero " + comida + " não!");
        }
    }

    public void correrAtrasMoto() {
        this.fazerSom();
        System.out.println("Correndo atrás da moto");
    }

    public static void main(String[] args) {
        // Testar herança
        Pet pet1 = new Pet("Fred", 3, 12.5);
        pet1.dormir();
        pet1.comer("Batata");
        pet1.fazerSom();

        System.out.println("---------------------");

        Cachorro cachorro1 = new Cachorro("Rex", 5, 25, "Osso", "Caramelo");
        cachorro1.dormir();
        cachorro1.fazerSom();
        cachorro1.comer("Feijão");
        cachorro1.setPeso(20);
        cachorro1.brincar();
        cachorro1.comer("Feijão");
        cachorro1.comer("Osso");
        cachorro1.correrAtrasMoto();
    }
}
