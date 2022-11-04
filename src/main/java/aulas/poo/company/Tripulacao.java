package aulas.poo.company;

public class Tripulacao {
    private int idTripulacao;
    private String nome;
    private String email;
    private int idFrota;

    public Tripulacao(int idTripulacao, String nome, String email, int idFrota) {
        this.idTripulacao = idTripulacao;
        this.nome = nome;
        this.email = email;
        this.idFrota = idFrota;
    }

    public int getIdTripulacao() {
        return idTripulacao;
    }

    public void setIdTripulacao(int idTripulacao) {
        this.idTripulacao = idTripulacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdFrota() {
        return idFrota;
    }

    public void setIdFrota(int idFrota) {
        this.idFrota = idFrota;
    }
}
