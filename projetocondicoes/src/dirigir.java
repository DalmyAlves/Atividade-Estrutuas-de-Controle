import java.util.Scanner;

public class dirigir {
    public static void main ( String[] args ) {
        Scanner sc = new Scanner ( System.in );

        // Declaração de variáveis.
        String nome, cnh, permissao;
        int idade;
        boolean possuiCnh = false, possuiPermissao = false;

        // Valor do nome.
        System.out.print ( "Digite seu nome: " );
        nome = sc.nextLine ();

        // Valor da idade.
        System.out.print ( "Digite sua idade: " );
        idade = sc.nextInt ();
        sc.nextLine ();

        if ( idade < 18 ) {
            // Valor da permissão especial.
            System.out.print ( "Você tem permissão especial? (Sim/Não): " );
            permissao = sc.nextLine ();
            possuiPermissao = permissao.equalsIgnoreCase ( "sim" );

        } else {
            // Valor da CNH.
            System.out.print ( "Você tem CNH? (Sim/Não): " );
            cnh = sc.nextLine ();
            possuiCnh = cnh.equalsIgnoreCase ( "sim" );
        }

        // Exibição das mensagens conforme as condições.
        if ( idade < 18 && possuiPermissao ) {
            System.out.println ( "Parabéns " + nome + "! Você tem " + idade + " anos" + " e possui permissão especial para dirigir." );
        } else if ( idade >= 18 && possuiCnh ) {
            System.out.println ( "Parabéns " + nome + "! Você tem " + idade + " anos e você pode dirigir." );
        } else if ( idade < 18 ) {
            System.out.println ( nome + ", infelizmente você não tem permissão especial, logo não pode dirigir." );
        } else {
            System.out.println ( nome + " Infelismente você tem " + idade + " anos e não tem CNH, logo você não pode dirigir." );
        }

        sc.close ();
    }
}
