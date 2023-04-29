import java.util.Scanner;

public class projetoSete {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      double salarioFixo, valorVendas, percentualComissao, salarioTotal;

      System.out.print("Digite o salário fixo do vendedor: ");
      salarioFixo = input.nextDouble();

      System.out.print("Digite o valor total das vendas realizadas: ");
      valorVendas = input.nextDouble();

      System.out.print("Digite a comissão sobre as vendas: ");
      percentualComissao = input.nextDouble();

      salarioTotal = salarioFixo + (valorVendas * percentualComissao / 100);

      System.out.println("O salário total do vendedor é: R$" + salarioTotal);
   }
}
