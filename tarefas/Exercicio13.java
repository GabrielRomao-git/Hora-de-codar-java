// pergunta 13
import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Qual o primeiro valor?");
        double um = ler.nextInt();
        System.out.println("Qual o segundo valor?");
        double dois = ler.nextInt();
        System.out.println("Qual o terceiro valor?");
        double tres = ler.nextInt();

       double conta = Math.min(um, Math.min(dois, tres));

        System.out.println("O resultado é de " + (um + dois + tres - conta));
    }
}