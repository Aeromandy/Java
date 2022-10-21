package aulas.poo.exercicios;

import java.util.ArrayList;

/* 4) Crie uma classe Livro que possui:
    Atributos: nome, autor, preco;
    Construtores:
        - Cria livros com base nos parâmetros nome, autor (objeto da classe Autor), preco; */
public class Livro {
    private String nome;
    private Autor autor;
    private double preco;

    public Livro(String nome, Autor autor, double preco) {
        this.nome = nome;
        this.autor = autor;
        this.preco = preco;
    }

    public Livro(String animais_fantasticos) {
    }

    public static void main(String[] args) {
        Autor jk = new Autor("JK", "jk@gmail.com");
        Livro animaisFantasticos = new Livro("Animais Fantasticos", jk, 24.9);

        System.out.println(animaisFantasticos.autor.getNome());
        System.out.println(animaisFantasticos.autor.getEmail());

        Livro cronicasDeNarnia = jk.escreverLivro("As Cronicas de Narnia", 30.00);

        System.out.println(cronicasDeNarnia.autor.getNome());

        ArrayList<Livro> livrosJK = new ArrayList<>();
        livrosJK.add(animaisFantasticos);
        livrosJK.add(cronicasDeNarnia);
    }
}
