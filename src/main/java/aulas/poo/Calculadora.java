package aulas.poo;

public class Calculadora {
    /* Método estático, não pertence ao objeto, mas sim a classe */
    public static final double PI = 3.14; // atributo estático
    // final impede a alteração de PI
    public static double soma(double a, double b) {
        return a + b;
    }

    public static double subtracao(double a, double b) {
        return a - b;
    }

    public static double multiplicacao(double a, double b) {
        return a * b;
    }

    public static double divisao(double a, double b) {
        return a / b;
    }

    public static void main(String[] args) {
        double resultadoSoma = Calculadora.soma(1,2);
        double resulatdoSub = Calculadora.subtracao(10,5);
        double resultadoMulti = Calculadora.multiplicacao(2, 5);
        double resultadoDiv = Calculadora.divisao(10, 5);
        System.out.println(Calculadora.PI);
    }

}
