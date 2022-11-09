// pergunta 10
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double pi = 3.14;
         System.out.println("Qual o valor da area?");
          int area = ler.nextInt();
          double areas = Math.pow(area,2);
          double conta = (pi * areas);
          System.out.println(conta);
          
    }
}