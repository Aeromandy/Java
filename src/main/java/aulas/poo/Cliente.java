package aulas.poo;

import java.time.LocalDate;

public class Cliente {
    private int id;
    private String nome;
    private String sobrenome;
    private LocalDate dataNasc;
    private double altura;
    private double peso;

    Cliente(int id, String nome, String sobrenome, LocalDate dataNasc, double altura, double peso) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNasc = dataNasc;
        this.altura = altura;
        this.peso = peso;
    }
    public void crescer() {
        this.altura += 0.2;
    }
    // Getter -> possibilitam a leitura dos atributos
    String getNome() {
        return this.nome;
    }

    public String getSobrenome() {
        return  this.sobrenome;
    }

    public String getNomeCompleto() {
        return this.nome + " " + this.sobrenome;
    }
    // Setter -> serve para modificar o valor
    public void  setAltura(double altura) {
        if (altura > 0 && altura < 2.51) {
            this.altura = altura;
        } else {
            System.out.println("Altura inválida. Atributo não modificado");
        }
    }
    public void setPeso(double novoPeso) {
        this.peso = novoPeso;
    }
}
