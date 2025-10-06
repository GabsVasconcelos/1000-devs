import java.util.Scanner;
import java.util.InputMismatchException;

public class Ex5 {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in); 
        
        float qtdFrango = 0;

        try {
        System.out.print("Digite a QTDE de frangos: ");
         qtdFrango = ler.nextFloat();
        
    } catch (InputMismatchException e) {
       System.out.println("Deve inserir um valor númerico.");
        }
        catch (Exception e) {
          e.printStackTrace();
        }
        
        float c1 = 4f;
        float c2 = 3.50f;
        
        float chip1 = qtdFrango * c1;
        float chip2 = qtdFrango * (2 * c2);
        
        float total = chip1 + chip2 ;

        System.out.printf("O valor total para identificar os frangos é: R$ %.2f", total);
        
        ler.close();
    }
}
 