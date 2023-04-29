import java.util.Scanner;

public class projetoDez {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro valor: ");
        double valor1 = scanner.nextDouble();
        System.out.print("Digite o segundo valor: ");
        double valor2 = scanner.nextDouble();
        System.out.print("Digite o terceiro valor: ");
        double valor3 = scanner.nextDouble();

        double mediaAritmetica = (valor1 + valor2 + valor3) / 3.0;
        double mediaHarmonica = 3.0 / ((1.0 / valor1) + (1.0 / valor2) + (1.0 / valor3));
        double mediaGeometrica = Math.cbrt(valor1 * valor2 * valor3);

        System.out.printf("Média Aritmética: %.2f\n", mediaAritmetica);
        System.out.printf("Média Harmônica: %.2f\n", mediaHarmonica);
        System.out.printf("Média Geométrica: %.2f\n", mediaGeometrica);

        scanner.close();
    }
}
