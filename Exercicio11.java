// pergunta 11
import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Escolha um valor");
        double valor = ler.nextDouble();
        if (valor > 0) {
            System.out.println("Seu número é maior que 0");
        } else if ( valor < 0) {
            System.out.println("Seu número é menor que 0");
        } else {
            System.out.println("Seu número é 0");
        }
    }
}