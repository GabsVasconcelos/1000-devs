import java.util.Scanner;
import java.util.InputMismatchException;

public class Ex3 {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in); 
        float qtdCavalo = 0;
        float valorFer = 0;

                try {        
        System.out.print("Informe a quantidade de cavalos:  ");
        qtdCavalo = ler.nextFloat();
        
        System.out.print("Informe o valor de cada ferradura:  ");
        valorFer = ler.nextFloat();
        
    } catch (InputMismatchException e) {
       System.out.println("Deve inserir um valor númerico.");
        }
        catch (Exception e) {
          e.printStackTrace();
        }

     
        Float qtdFer = qtdCavalo * 4f;
        
        Float totalfinal = qtdFer * valorFer;
        


        System.out.printf("\nA quantidade de ferraduras necessárias é: %.0f ", qtdFer);
        
        System.out.printf("\nValor total para a compra das ferraduras: R$ %.2f ", totalfinal);
        
        ler.close();
    }
}
