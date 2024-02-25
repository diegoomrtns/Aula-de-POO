import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int resp = 0;
        int x, y, total = 0;

        while (resp != 5) {
            System.out.println("CALCULADORA\n 1 - SOMA\n 2 - SUBTRAÇÃO\n 3 - MULTIPLICAÇÃO\n 4 - DIVISÃO\n 5 - SAIR");
            resp = entrada.nextInt();

            switch (resp) {
                case 1:
                    System.out.println("Informe o valor 1:");
                    x = entrada.nextInt();
                    System.out.println("Informe o valor 2:");
                    y = entrada.nextInt();
                    total = x + y;
                    System.out.println("Resultado: " + total);
                    break;

                case 2:
                    System.out.println("Informe o valor 1:");
                    x = entrada.nextInt();
                    System.out.println("Informe o valor 2:");
                    y = entrada.nextInt();
                    total = x - y;
                    System.out.println("Resultado: " + total);
                    break;

                case 3:
                    System.out.println("Informe o valor 1:");
                    x = entrada.nextInt();
                    System.out.println("Informe o valor 2:");
                    y = entrada.nextInt();
                    total = x * y;
                    System.out.println("Resultado: " + total);
                    break;

                case 4:
                    System.out.println("Informe o valor 1:");
                    x = entrada.nextInt();
                    System.out.println("Informe o valor 2:");
                    y = entrada.nextInt();
                    total = x / y;
                    System.out.println("Resultado: " + total);
                    break;

                case 5:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente outra.");
                    break;
            }
        }
    }
}
