import java.util.Scanner;

pergunta 1
public class Exercicio1 {
    public static void main(String[] args) {
        String planeta= "Plutão";
        System.out.println("Você é um " + planeta);
    }
}


// pergunta 2
// public class Exercicio1 {
//      public static void main(String[] args) {
//          Scanner ler = new Scanner(System.in);
//          System.out.println("Informe seu nome:");
//           String  palavra = ler.nextLine();
//          System.out.println("Olá " + palavra);
//      }
//  }


// pergunta 3
// public class Exercicio1 {
//     public static void main(String[] args) {
//          Scanner ler = new Scanner(System.in);
//              System.out.println("Informe seu nome:");
//           String  palavra = ler.nextLine();
//               System.out.println("Qual a sua idade");
//         int idade = ler.nextInt();
//           System.out.println(palavra + "sua idade é de " + idade);
//       }
//   }


// pergunta 4
// public class Exercicio1 {
//     public static void main(String[] args) {
//         Scanner ler = new Scanner(System.in);
//         System.out.println("Qual o valor da base?");
//         int base = ler.nextInt();
//         System.out.println("Qual o valor da altura?");
//         int altura = ler.nextInt();
//         int conta = base * altura;
//         System.out.println(conta);
//     }
// }


pergunta 5
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Qual o valor de um dos lados do quadrado");
        int lados = ler.nextInt();
        // int conta = 10 * 10;
        double resultado = Math.pow(lados,3); 
        System.out.println(resultado);
    }
}


// pergunta 6
//  public class Exercicio1 {
//      public static void main(String[] args) {
//          Scanner ler = new Scanner(System.in);
//          System.out.println("Qual o valor da diagonal maior?");
//          int maior = ler.nextInt();
//          System.out.println("Qual o valor da diagonal menor?");
//          int menor = ler.nextInt();

//          int conta = maior * menor /2;
//          System.out.println(conta);

//     }
// }


// pergunta 7
// public class Exercicio1 {
//     public static void main(String[] args) {
//         Scanner ler = new Scanner(System.in);
//         System.out.println("Qual o valor da base maior?");
//          int maior = ler.nextInt();
//          System.out.println("Qual o valor da base menor?");
//          int menor = ler.nextInt();
//          System.out.println("Qual o valor do h?");
//          int h = ler.nextInt();

//          int conta = (maior * menor) *h /2;
//           System.out.println(conta);
//     }
// }


// pergunta 8
// public class Exercicio1 {
//     public static void main(String[] args) {
//         Scanner ler = new Scanner(System.in);
//         System.out.println("Qual o valor da base?");
//          int base = ler.nextInt();
//           System.out.println("Qual o valor da altura?");
//           int altura = ler.nextInt();
//           int conta = base * altura;
//           System.out.println(conta);
//     }
// }


// pergunta 9
// public class Exercicio1 {
//     public static void main(String[] args) {
//          Scanner ler = new Scanner(System.in);
//          System.out.println("Qual o valor da base?");
//          int base = ler.nextInt();
//            System.out.println("Qual o valor da altura?");
//            int altura = ler.nextInt();
//            int conta = (base * altura) /2;
//            System.out.println(conta);
//     }
// }


// pergunta 10
// public class Exercicio1 {
//     public static void main(String[] args) {
//         Scanner ler = new Scanner(System.in);
//         double pi = 3.14;
//          System.out.println("Qual o valor da area?");
//           int area = ler.nextInt();
//           double areas = Math.pow(area,2);
//           double conta = (pi * areas);
//           System.out.println(conta);
          
//     }
// }

// pergunta 11
// public class Exercicio1 {
//     public static void main(String[] args) {
//         Scanner ler = new Scanner(System.in);
//         System.out.println("Escolha um valor");
//         double valor = ler.nextDouble();
//         if (valor > 0) {
//             System.out.println("Seu número é maior que 0");
//         } else if ( valor < 0) {
//             System.out.println("Seu número é menor que 0");
//         } else {
//             System.out.println("Seu número é 0");
//         }
//     }
// }

// pergunta 12
// public class Exercicio1 {
//     public static void main(String[] args) {
//         Scanner ler = new Scanner(System.in);
//         System.out.println("Escolha o primeiro valor?");
//         int primeiro = ler.nextInt();
//         System.out.println("Escolha o segundo valor?");
//         int segundo = ler.nextInt();
//         System.out.println("Escolha o terceiro valor?");
//         int terceiro = ler.nextInt();
//         double resultado = Math.max(primeiro, Math.max(segundo, terceiro));

//         System.out.println("O maior numero e " +  resultado);

//     }
// }

// pergunta 13

// public class Exercicio1 {
//     public static void main(String[] args) {
//         Scanner ler = new Scanner(System.in);
//         System.out.println("Qual o primeiro valor?");
//         double um = ler.nextInt();
//         System.out.println("Qual o segundo valor?");
//         double dois = ler.nextInt();
//         System.out.println("Qual o terceiro valor?");
//         double tres = ler.nextInt();

//        double conta = Math.min(um, Math.min(dois, tres));

//         System.out.println("O resultado é de " + (um + dois + tres - conta));
//     }
// }

// pergunta 14
// public class Exercicio1 {
//     public static void main (String[] args) {
//         Scanner ler = new Scanner(System.in);
//         System.out.println("Qual o primeiro valor?");
//         int um = ler.nextInt();
//         System.out.println("Qual o segundo valor");
//         int dois = ler.nextInt();
//         while (dois <= 0) {
//             System.out.println("O valor nao pode ser menor ou igual a 0, tente outro;");
//             dois += ler.nextInt();  
//         }

//         System.out.println("O resultado e de = " + (um / dois));
//     }
// }




