import java.util.Scanner;

public class projetoCinco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double horasTrabalhadas, valorHoraTrabalhada, salarioFamilia, salarioBruto;
        int numFilhos;

        System.out.print("Digite o número de horas trabalhadas no mês: ");
        horasTrabalhadas = scanner.nextDouble();

        System.out.print("Digite o valor recebido por hora de trabalho: R$");
        valorHoraTrabalhada = scanner.nextDouble();

        System.out.print("Digite o valor do salário família: R$");
        salarioFamilia = scanner.nextDouble();

        System.out.print("Digite o número de filhos com idade menor que 14 anos: ");
        numFilhos = scanner.nextInt();

        salarioBruto = (horasTrabalhadas * valorHoraTrabalhada) + (salarioFamilia * numFilhos);

        System.out.println("O salário bruto a ser recebido é de R$" + salarioBruto);

        scanner.close();
    }
}
