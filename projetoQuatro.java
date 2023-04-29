import java.util.Scanner;

public class projetoQuatro {
    public static void main(String[] args) {
        System.out.println("Programa para juros compostos");

        Scanner scanner = new Scanner(System.in);

        double montante, valorCapital, jurosMensal, jurosPorcentagem, taxa;
        int prazo;

        System.out.print("Informe o valor do capital a ser aplicado: ");
        valorCapital = scanner.nextDouble();

        System.out.print("Informe o prazo de aplicação em meses: ");
        prazo = scanner.nextInt();

        System.out.print("Informe a taxa de juros mensal (em porcentagem): ");
        taxa = scanner.nextDouble();
        jurosPorcentagem = taxa / 100;

        montante = valorCapital * Math.pow((1 + jurosPorcentagem), prazo);

        System.out.println("O montante obtido após " + prazo + " meses é de R$ " + montante);

        scanner.close();
    }
}
