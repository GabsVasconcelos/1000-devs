import java.util.Scanner;
import java.util.InputMismatchException;

public class Ex4 {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in); 
        
        float salario = 0;
                try {
        System.out.print("Informe o salário:  ");
         salario = ler.nextFloat();
        
    } catch (InputMismatchException e) {
       System.out.printf("Deve inserir um valor númerico.");
        }
        catch (Exception e) {
          e.printStackTrace();
        }
        
        float percentual0 = 0.15f;
        float percentual1 = 0.11f;
        float percentual2 = 0.08f;
        float per15 = salario * percentual0;
        float totalin = salario + per15;
        float per11 = totalin * percentual1;
        float per8 = totalin * percentual2;
        float totaldesc = per11 + per8;
        float totalfinal = totalin - totaldesc;
        

        System.out.printf("\nSalario Inicial: R$ %.2f" , salario);
        
        System.out.printf("\nSalario Reajustado: R$ %.2f" , totalin);
        
        System.out.printf("\nDesconto de 11%% INSS: R$ %.2f" , per11);
        
        System.out.printf("\nDesconto 8%% FGTS: R$ %.2f" , per8);
        
        System.out.printf("\nTotal Descontos(INSS + FGTS): R$ %.2f" , totaldesc);
        
        System.out.printf("\nSalario Final: R$ %.2f" , totalfinal);


        ler.close();
    }
}
