// pergunta 5
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Qual o valor da base?");
        int base = ler.nextInt();
        System.out.println("Qual o valor da altura?");
        int altura = ler.nextInt();
        int conta = base * altura;
        System.out.println(conta);
    }
}