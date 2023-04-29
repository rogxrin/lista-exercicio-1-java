import java.util.Scanner;

public class projetoDois {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o preço do produto: ");
        double preco = scanner.nextDouble();
        double novoPreco = preco * 1.1; // Acrescenta 10% ao preço original
        System.out.printf("O preço do produto com acréscimo de 10%% é R$%.2f", novoPreco);
        scanner.close();
    }

}
