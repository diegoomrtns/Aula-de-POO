import java.util.Scanner;

public class mediapar {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n = 0, i = 0, novo=1;

        while (novo != 0) {
            System.out.println("Digite um número par (digite 0 para encerrar):");
            novo = ler.nextInt();
            if (novo % 2 == 0) {
                i++;
                n += novo;
            } else {
                System.out.println("Digite apenas números pares!");
            }

            System.out.println("Digite um número par (digite 0 para encerrar):");
            novo = ler.nextInt();
        }

        if (i != 0) {
            int media = n / i;
            System.out.println("A média dos números pares é: " + media);
        } else {
            System.out.println("Nenhum número par foi digitado.");
        }
    }
}
