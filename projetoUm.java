import java.util.Scanner;

public class projetoUm {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("digite o primeiro numero");
        double numero1 = scanner.nextDouble();

        System.out.print("digite o segundo numero");
        double numero2 = scanner.nextDouble();

        double media = (numero1 + numero2) / 2;

        System.out.println("A média aritmética de " + numero1 + " e " + numero2 + " é " + media);

    }
}
