import java.util.Scanner;

public class quadratica {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe o coeficiente a:");
        int a = ler.nextInt();

        if (a != 0) {
            System.out.println("Informe o coeficiente b:");
            int b = ler.nextInt();
            System.out.println("Informe o coeficiente c:");
            int c = ler.nextInt();

            int delta = (b * b) - 4 * a * c;

            if (delta < 0) {
                System.out.println("ERRO: DELTA NEGATIVO, NÃO EXISTE RAIZ REAL!!!");
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("As raízes são: x1 = " + x1 + " e x2 = " + x2);
            }
        }
    }
}
