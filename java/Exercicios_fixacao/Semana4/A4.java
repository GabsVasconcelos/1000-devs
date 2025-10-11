import java.util.Scanner;
import java.util.InputMismatchException;

public class A4 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        float salario;
      try {
            System.out.printf("Insira o seu salário: ");
            salario = ler.nextFloat();
        } catch (InputMismatchException e) {
            System.out.printf("Deve inserir um valor númerico.");
            ler.close();
            return;
        } catch (Exception e) {
            e.printStackTrace();
            ler.close();
            return;
        }

        float percentual20 = salario * 0.20f;
        float percentual15 = salario * 0.15f;
        float percentual10 = salario * 0.10f;
        float percentual5 = salario * 0.05f;

        if (salario <= 280){
            float valor_final = salario + percentual20;
            System.out.printf("\n- o salário antes do reajuste era de R$ %.2f \n- o percentual de aumento aplicado foi de 20%% \n - o valor do aumento foi de R$ %.2f \n- o novo salário, após o aumento é %.2f", salario, percentual20, valor_final);
            }
            
        else if (salario <= 700){
            float valor_final = salario + percentual15;
            System.out.printf("\n- o salário antes do reajuste era de R$ %.2f \n- o percentual de aumento aplicado foi de 15%% \n - o valor do aumento foi de R$ %.2f \n- o novo salário, após o aumento é %.2f", salario, percentual15, valor_final);
            }
        else if (salario <= 1500){
            float valor_final = salario + percentual10;
            System.out.printf("\n- o salário antes do reajuste era de R$ %.2f \n- o percentual de aumento aplicado foi de 10%% \n - o valor do aumento foi de R$ %.2f \n- o novo salário, após o aumento é %.2f", salario, percentual10, valor_final);
            }  
        else {
            float valor_final = salario + percentual5;
            System.out.printf("\n- o salário antes do reajuste era de R$ %.2f \n- o percentual de aumento aplicado foi de 5%% \n - o valor do aumento foi de R$ %.2f \n- o novo salário, após o aumento é %.2f", salario, percentual5, valor_final);
            } 

        ler.close();
       
   }
}

