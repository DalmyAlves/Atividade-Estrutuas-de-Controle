import java.util.Scanner;

public class DiasDaSemana {
    public static void main ( String[] args ) {
        Scanner diasdasemana = new Scanner ( System.in );

        // Declarando variável.
        int numero;
        String dia;

        // Pergunta de qual é o dia da semana.
        System.out.print ("Digite um numero de 1 a 7 para saber o dia da semana: ");
        numero = diasdasemana.nextInt ();
        diasdasemana.nextLine ();

        // Mapeamento do dia da semana.
        dia = switch (numero) {
            case 1 -> "Domingo";
            case 2 -> "Segunda-feira";
            case 3 -> "Terça-feira";
            case 4 -> "Quarta-feira";
            case 5 -> "Quinta-feira";
            case 6 -> "Sexta-feira";
            case 7 -> "Sábado";
            default -> "inválido! Digite um número entre 1 e 7.";
        };

        // Resposta de qual é o dia da semana.
        System.out.println ("o dia da semana é " + dia);

        diasdasemana.close ();
    }
}
