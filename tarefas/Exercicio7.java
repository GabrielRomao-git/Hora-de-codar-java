// pergunta 7
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Qual o valor da base maior?");
         int maior = ler.nextInt();
         System.out.println("Qual o valor da base menor?");
         int menor = ler.nextInt();
         System.out.println("Qual o valor do h?");
         int h = ler.nextInt();

         int conta = (maior * menor) *h /2;
          System.out.println(conta);
    }
}