// pergunta 9
import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
         Scanner ler = new Scanner(System.in);
         System.out.println("Qual o valor da base?");
         int base = ler.nextInt();
           System.out.println("Qual o valor da altura?");
           int altura = ler.nextInt();
           int conta = (base * altura) /2;
           System.out.println(conta);
    }
}