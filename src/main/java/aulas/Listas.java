package aulas;

import java.util.ArrayList;

public class Listas {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        ArrayList<String> nomes = new ArrayList<>();

        System.out.println(numeros);

        // Adicionando elementos no array
        numeros.add(10);
        numeros.add(20);
        numeros.add(1000);
        System.out.println(numeros);
        System.out.println(numeros.get(2));

        numeros.set(0, 500);
        System.out.println(numeros);

        numeros.remove(0);
        System.out.println(numeros);

        numeros.add(1, 200); // adiciona o elemento na posição e move os demais
        System.out.println(numeros);

        System.out.println(numeros.size());

        for(int i = 0; i < numeros.size(); i++) {
            System.out.println(numeros.get(i));
        }
        System.out.println("----------");
        for(int numero : numeros) { // Para cada valor dentro do array ele executa o código
            System.out.println(numero);
        }

        System.out.println(numeros.contains(500));
        System.out.println(numeros.indexOf(1000)); // posição na lista
        System.out.println(numeros.indexOf(500)); // se retornar -1 não achou o elemento
        System.out.println(numeros.indexOf(200)); // mostra a primeira posição com o valor solicitado
        System.out.println(numeros.lastIndexOf(200)); // mostra o ultimo encontrado


    }
}
