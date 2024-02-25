import java.util.Scanner;

public class negativo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n;

        do {
            System.out.println("Informe um número positivo:");
            n = ler.nextInt();

            if (n < 0) {
                System.out.println("Número inválido. Tente novamente.");
            }
        } while (n < 0);

        System.out.println("Número positivo inserido: " + n);
    }
}
