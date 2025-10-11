import java.util.Scanner;
import java.util.InputMismatchException;

public class A3 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        float kgmorango;
        float kgmaca;

      try {
            System.out.printf("Insira a quantidade em kgs que você deseja comprar de morangos: ");
            kgmorango = ler.nextFloat();

            System.out.printf("Insira a quantidade em kgs que você deseja comprar de maçãs: ");
            kgmaca = ler.nextFloat();

        } catch (InputMismatchException e) {
            System.out.printf("Deve inserir um valor númerico.");
            ler.close();
            return;
        } catch (Exception e) {
            e.printStackTrace();
            ler.close();
            return;
        }

        float morangoAte5 = 2.50f;
        float morangoMais5 = 2.20f;
        float macaAte5 = 1.80f;
        float macaMais5 = 1.50f;
        float peso_total = kgmaca + kgmorango;
        float valoraté5 = (morangoAte5 * kgmorango) + (macaAte5 * kgmaca);
        float valorAcima5 = ( morangoMais5 * kgmorango) + (macaMais5 * kgmaca);
        float valor_total = ( morangoMais5 * kgmorango) + (macaMais5 * kgmaca);

        if (kgmorango >= 8 || kgmaca >= 8 || kgmaca + kgmorango >= 8 || valor_total >= 25){
            float valor_final = valor_total * 0.90f ;
            System.out.printf("Você comprou mais de 8 kgs de frutas então recebeu 10%% de desconto e o valor a ser pago é de R$ %.2f",valor_final);
            }
            
        else if (kgmorango > 5 || kgmaca > 5 || peso_total > 5){
            valorAcima5 = ( morangoMais5 * kgmorango) + (macaMais5 * kgmaca);
            System.out.printf("Você comprou mais de 5 kgs de frutas então o valor a ser pago é de R$ %.2f",valorAcima5);
            }
        else {
            valoraté5 = (morangoAte5 * kgmorango) + (macaAte5 * kgmaca);
            System.out.printf("Você comprou até de 5 kgs de frutas então o valor a ser pago é de R$ %.2f",valoraté5);
            }  
        
        
        ler.close();  
       
   }
}
