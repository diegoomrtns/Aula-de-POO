import java.util.Scanner; 

public class banco {
    public static void main(String args[]){
        Scanner ler = new Scanner(System.in);
        int saldo=0;
        int resp = 0;
        while(resp!=4)
        {
            System.out.println("BANCO\n 1 - SALDO \n 2 - SAQUE \n 3 - DEPÓSITO \n 4 - SAIR");
            System.out.println("Escolha a opção desejada:");
            resp = ler.nextInt();
            switch (resp) {
                case 1:
                    System.out.println("Saldo:"+saldo);
                    break;
                case 2:
                    System.out.println("Escolha o valor desejado:");
                    int saque = ler.nextInt();
                    saldo=saldo-saque;
                    break;
                case 3: 
                    System.out.println("Insira o valor a ser depositado:");
                    int deposito = ler.nextInt();
                    saldo=saldo+deposito;
                case 4:
                    System.out.println("Você escolheu sair!");
                    break;
                default:
                    System.out.println("ESCOLHA UMA OPÇÃO VÁLIDA!");
                    break;
            }
        }
    }
}
