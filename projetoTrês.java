import java.util.Scanner;

public class projetoTrês {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a temperatura em Fahrenheit:");

        double F = sc.nextDouble();

        double C = (F - 32) / 1.8;

        System.out.printf("A temperatura em Celsius é:%.2f", C);

        sc.close();

    }
}