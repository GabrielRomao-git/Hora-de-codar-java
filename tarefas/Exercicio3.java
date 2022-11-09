// pergunta 3
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
         Scanner ler = new Scanner(System.in);
             System.out.println("Informe seu nome:");
          String  palavra = ler.nextLine();
              System.out.println("Qual a sua idade");
        int idade = ler.nextInt();
          System.out.println(palavra + "sua idade é de " + idade);
      }
  }