import java.util.Scanner;

public class poo{
    public static void main(String[] args) {
   Scanner ler = new Scanner(System.in);
        int i;
        int n[];
        n = new int [10];
        for(i = 0; i < n.length; i++){
            System.out.println("Digite um número");
            n[i] = ler.nextInt();
        }
        for(i = n.length - 1; i > 0; i-- )
        {
            System.out.println(n[i]);
        }
}
}
