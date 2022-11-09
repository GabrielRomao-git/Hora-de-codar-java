// pergunta 12
import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Escolha o primeiro valor?");
        int primeiro = ler.nextInt();
        System.out.println("Escolha o segundo valor?");
        int segundo = ler.nextInt();
        System.out.println("Escolha o terceiro valor?");
        int terceiro = ler.nextInt();
        double resultado = Math.max(primeiro, Math.max(segundo, terceiro));

        System.out.println("O maior numero e " +  resultado);

    }
}