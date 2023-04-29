import java.util.Scanner;

public class projetoOito {

   public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);

      System.out.println("Digite o total de veículos no estacionamento: ");
      int totalVeiculos = scanner.nextInt();

      System.out.println("Digite o total de rodas no estacionamento: ");
      int totalRodas = scanner.nextInt();

      int quantidadeMotos = 0;
      int quantidadeCarros = 0;

      while (totalVeiculos > 0) {
         if (totalRodas >= 4) {
            quantidadeCarros++;
            totalRodas -= 4;
         } else {
            quantidadeMotos++;
            totalRodas -= 2;
         }
         totalVeiculos--;
      }

      System.out.println("Quantidade de carros: " + quantidadeCarros);
      System.out.println("Quantidade de motos: " + quantidadeMotos);

      scanner.close();

   }

}
