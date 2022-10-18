package aulas;

/** Enums são estruturas com constantes definidas
 * Ex.: Dias da semana, meses do ano, estações
 * Níveis (junior, pleno, senior)
 */

public class Enums {
    public static void main(String[] args) {
        enum DiaDaSemana {
            SEGUNDA,
            TERÇA,
            QUARTA,
            QUINTA,
            SEXTA,
            SABADO,
            DOMINGO
        }

        DiaDaSemana hoje = DiaDaSemana.QUINTA; // enum.constante
        System.out.println(hoje);

        enum NivelDev { JUNIOR, PLENO, SENIOR }
        NivelDev nivel = NivelDev.PLENO;

        switch (nivel) {
            case JUNIOR:
                System.out.println("Seu nível é JUNIOR");
                break;
            case PLENO:
                System.out.println("Seu nível é PLENO");
                break;
            case SENIOR:
                System.out.println("Seu nível é SENIOR");
                break;
        }

        // ENHANCED VERSION
        switch (nivel) {
            case JUNIOR -> {
                System.out.println("Seu nível é JUNIOR");
            }
            case PLENO -> {
                System.out.println("Seu nível é PLENO");
            }
            case SENIOR -> {
                System.out.println("Seu nível é SENIOR");
            }
            default -> {
                System.out.println("Nunca executa");
            }
        }

    }
}
