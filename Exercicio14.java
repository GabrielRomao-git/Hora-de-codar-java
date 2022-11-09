// pergunta 14
import java.util.Scanner;

public class Exercicio14 {
    public static void main (String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Qual o primeiro valor?");
        int um = ler.nextInt();
        System.out.println("Qual o segundo valor");
        int dois = ler.nextInt();
        while (dois <= 0) {
            System.out.println("O valor nao pode ser menor ou igual a 0, tente outro;");
            dois += ler.nextInt();  
        }

        System.out.println("O resultado e de = " + (um / dois));
    }
}