package aulas.poo.company;

public class Rota {
    private int id;
    private String origemDestino;
    private int distanciaMilhas;
    private String tempoDeVoo;

    public Rota(int id, String origemDestino, int distanciaMilhas, String tempoDeVoo) {
        this.id = id;
        this.origemDestino = origemDestino;
        this.distanciaMilhas = distanciaMilhas;
        this.tempoDeVoo = tempoDeVoo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrigemDestino() {
        return origemDestino;
    }

    public void setOrigemDestino(String origemDestino) {
        this.origemDestino = origemDestino;
    }

    public double getDistanciaMilhas() {
        return distanciaMilhas;
    }

    public void setDistanciaMilhas(int distanciaMilhas) {
        this.distanciaMilhas = distanciaMilhas;
    }

    public String getTempoDeVoo() {
        return tempoDeVoo;
    }

    public void setTempoDeVoo(String tempoDeVoo) {
        this.tempoDeVoo = tempoDeVoo;
    }
}
