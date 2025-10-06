import java.util.Scanner; 
import java.util.InputMismatchException;

public class Ex1 {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in); 
        float frente = 0;
        float lateral = 0;
        float valorm2 = 0;

                        try {
        System.out.print("Quantos metros o terreno possui de frente: ");
        frente = ler.nextFloat();

        System.out.print("Quantos metros o terro possui de lateral: ");
        lateral = ler.nextFloat();

        System.out.print("Informe o valor por metro quadrado: ");
        valorm2 = ler.nextFloat();
        
    } catch (InputMismatchException e) {
       System.out.printf("Deve inserir um valor númerico.");
        }
        catch (Exception e) {
          e.printStackTrace();
        }
                
        float area = frente * lateral;
        
             
        float valor_total = area * valorm2;

        System.out.printf("\nÁrea total do terreno de %.0f mts de frente com %.0f mts de lateral é: %.0f mts", frente, lateral, area)
;
        System.out.printf("\nO valor deste terreno é: R$ %.2f ", valor_total)
;

        ler.close();

    }
}
