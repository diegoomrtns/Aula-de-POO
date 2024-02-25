import java.util.Scanner;

public class desconto{
    /**
     * @param args
     */
    public static void main(String[] args) {
        
        Scanner entrada = new
        Scanner(System.in);
        System.out.println("Informe a quantidade comprada:");
        int x = entrada.nextInt();
        System.out.println("Informe o valor unitário:");
        float y = entrada.nextFloat();
        float total = y*x;
        if(total<100.0)
        {
            System.out.println("Você ganhou um desconto de 5%!");
            total=total-(total*5/100);
            System.out.println("O valor a ser pago é:" +total);
        }
        else{
            if(total<1000.0){
                System.out.println("Você ganou um desconto e um bônus de 5%!");
                total=total-(total*5/100);
                System.out.println("O valor a ser pago é:" +total);
            }
            else{
                System.out.println("Você ganhou um desconto de 10% e um bônus de 7%");
                total=total-(total*10/100);
                System.out.println("O valor a ser pago é:" +total);
            }
        }
    
    }
}
