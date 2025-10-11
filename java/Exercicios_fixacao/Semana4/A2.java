import java.util.Scanner; 
import java.util.InputMismatchException;

public class A2 {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in); 

        float litros = 0;
        float tipoCombustivel = 0;
      
        try {
        System.out.print("Insira a quantidade em Litros que você deseja abastecer: ");
        litros = ler.nextFloat();

        System.out.print("Digite o tipo de combustível: (1) Álcool ou (2) Gasolina: ");
        tipoCombustivel = ler.nextInt();

    } catch (InputMismatchException e) {
       System.out.printf("Deve inserir um valor númerico.");
           ler.close();
            return;
        }
        catch (Exception e) {
          e.printStackTrace();
              ler.close();
                return;
        }

        float litroAlcool = 3.90f;
        float litroGasolina = 5.50f; 
        
        
        if (tipoCombustivel == 1) { 
            if (litros >= 20){
            float total = (litroAlcool * litros) * 0.95f;
            System.out.printf ("Você abasteceu %.2f litros de álcool e recebeu 5%% de desconto.%n o valor a ser pago será de R$ %.2f", litros, total);
            }
            else{
            float total1 = (litroAlcool * litros) * 0.97f;
            System.out.printf ("Você abasteceu %.2f litros de álcool e recebeu 3%% de desconto.%n o valor a ser pago será de R$ %.2f", litros, total1);
        }
        
       }
        else if (tipoCombustivel == 2){
            if ( litros >= 20 ) { 

            float total2 = (litroGasolina * litros) * 0.94f;
            System.out.printf ("Você abasteceu %.2f litros de gasolina e recebeu 6%% de desconto.%n o valor a ser pago será de R$ %.2f", litros, total2);
        }
        else {
            float total3 = (litroGasolina * litros) * 0.96f;
            System.out.printf ("Você abasteceu %.2f litros de gasolina e recebeu 4%% de desconto.%n o valor a ser pago será de R$ %.2f", litros, total3);
        }   
        }

        else {
            
            System.out.printf ("tipo de combustivo inválido");
        }        
        
        ler.close();

    }
}
