package aulas.poo;

public class Carro {
    String modelo;
    String marca;
    int ano;
    int qtdPortas;
    boolean flex;
    double combustivelAtual ;
    double consumo;
    boolean estaLigado = false;

    Carro(String modelo, String marca, int ano, int qtdPortas, boolean flex, double consumo) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.flex = flex;
        this.qtdPortas = qtdPortas;
        this.combustivelAtual = 30.0;
        this.consumo = consumo;

    }

    // Abastecer
    void abastecer(double total) { // parâmetros do método
        this.combustivelAtual += total; // this.combustivelAtual = this.combustivelAtual + total
    }
    // Ligar
    void ligar() {
        this.estaLigado = true;
    }

    // Desligar
    void desligar() {
        this.estaLigado = false;
    }
    // Viajar
    boolean viajar(String local, double distancia) { // tentar viajar, se consguir true, se não false
        if(!this.estaLigado) {
            this.ligar();
        }
        // Calcula qts litros serão necessários para a viagem
        double totalLitros = distancia / this.consumo;

        if(this.combustivelAtual - totalLitros > 0) {
            this.combustivelAtual -= totalLitros;
            System.out.println("A viagem p/ " + local + " aconteceu. Sobrou " + this.combustivelAtual + " L");
            return true; // a viagem aconteceu
        } else {
            System.out.println(" Não há cmbustível para realizar a viagem");
            return false; // a viagem não será possível
        }
    }
    // A main serve pra testar a classe
    public static void main(String[] args) {
        Carro carro1 = new Carro("X3", "BMW", 2020, 4, true, 40);
        Carro carro2 = new Carro("300C", "Chrisler", 2021, 4, true, 50);

        System.out.println(carro1.combustivelAtual);
        carro1.abastecer(5);
        System.out.println(carro1.combustivelAtual);

        System.out.println(carro1.estaLigado);
        carro1.ligar();
        System.out.println(carro1.estaLigado);

        System.out.println(carro1.ano);
        carro1.ano = 2022;
        System.out.println(carro1.ano);

        boolean viajou = carro1.viajar("Fortaleza", 300);
        System.out.println(viajou);
    }
}
