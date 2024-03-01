import java.util.Random;
import java.util.Scanner;

public class quiz {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Random r = new Random();
        int soma=0;
        int i=1, s=1, resp=0;
        while (s!=0) {
            int x = r.nextInt(1,20);
            int y = r.nextInt(1,20);
            System.out.println("Soma:"+x +"+" +y);
            resp = ler.nextInt();
            soma=x+y;
            if(resp==soma)
            {
                i++;
            }
            else{
                s=0;
            }
        }
        System.out.println("Numero de acertos:" +i);
}
}
