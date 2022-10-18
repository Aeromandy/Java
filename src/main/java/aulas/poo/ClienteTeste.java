package aulas.poo;

import java.time.LocalDate;

/** Encapsulamento -> escolhe quais atributos/métodos serao visíveis fora da classe
 * public (padrão) -> visível a todos
 * private -> métodos/atributos são visíveis apenas na classe */

public class ClienteTeste {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente(1, "Felipe", "Lima", LocalDate.of(1993, 5 , 25), 1.80, 87);

        System.out.println(cliente1.getNome());
        System.out.println(cliente1.getSobrenome());
        System.out.println(cliente1.getNomeCompleto());
        cliente1.setAltura(50);
    }
}
