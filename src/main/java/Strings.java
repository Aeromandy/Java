import java.util.Arrays;
import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        // Strings são cadeias de caracteres
        // "José" -> J = 0, o = 1, s = 2, é = 3
        String nome = "Pedro";

        if(nome == "Pedro") { // compara o endereço
            System.out.println("São iguais!");
        }

        System.out.println("Digite seu sobrenome");
        Scanner entrada = new Scanner(System.in);
        String sobrenome = entrada.nextLine();

        if(sobrenome.equals("Pereira")) {
            // sobrenome.equalsIgnoreCase("pereira"); *ignora maiusculo e minusculo
            System.out.println("São iguais");
        } else {
            System.out.println("São diferentes");
        }

        // Outros métodos
        String java = "Java";
        String ja = java.substring(0, 2);
        String va = java.substring(2);

        System.out.println(java.substring(1, 4));

        String m1 = "Hello, ";
        String m2 = "World";
        String m3 = m1.concat(m2);
        System.out.println(m3);

        System.out.println(java.length());
        System.out.println(java.isEmpty()); // verifica se está vazia -> ""
        System.out.println(java.toUpperCase());
        System.out.println(java.toLowerCase());

        System.out.println("Digite um nome: ");
        String seuNome = entrada.nextLine();

        if (seuNome.toUpperCase().equals("JOSÉ")) {
            System.out.println("SEU NOME É JOSÉ");
        }

        String data = "13/10/2022";
        String[] valores = data.split("/"); // {"13", "10", "2022"}
        System.out.println(valores[0]);

        String email = "jose.maria@gmail.com";
        String[] valoresEmail = email.split("@"); // ["jose.maria", "gmail.com]
        System.out.println(valoresEmail[0]);

        String nome2 = "Maria Silva";
        String[] nomeSeparado = nome2.split(" ");
        System.out.println(nomeSeparado[0]);

        String teste = "Amanhã é sexta-feira!";
        String[] teste2 = teste.split("");
        System.out.println(Arrays.toString(teste2));


    }
}
