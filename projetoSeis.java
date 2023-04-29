import java.util.Scanner;

public class projetoSeis {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Digite o primeiro número: ");
      double num1 = sc.nextDouble();
      System.out.print("Digite o segundo número: ");
      double num2 = sc.nextDouble();
      double resultado = Math.log(num1) / Math.log(num2);
      System.out.println("O logaritmo de " + num1 + " na base " + num2 + " é: " + resultado);
   }
}
