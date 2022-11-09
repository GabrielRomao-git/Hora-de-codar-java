// pergunta 6
import java.util.Scanner;

 public class Exercicio6 {
     public static void main(String[] args) {
         Scanner ler = new Scanner(System.in);
         System.out.println("Qual o valor da diagonal maior?");
         int maior = ler.nextInt();
         System.out.println("Qual o valor da diagonal menor?");
         int menor = ler.nextInt();

         int conta = maior * menor /2;
         System.out.println(conta);

    }
}