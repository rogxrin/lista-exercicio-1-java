import java.util.Scanner;

public class projetoNove {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite a quantidade de segundos: ");
        int segundos = sc.nextInt();
        
        int horas = segundos / 3600;
        int minutos = (segundos % 3600) / 60;
        segundos = (segundos % 3600) % 60;
        
        System.out.println("Correspondente a " + horas + " horas, " + minutos + " minutos e " + segundos + " segundos.");
        
        sc.close();
    }
}
