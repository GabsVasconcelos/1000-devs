import java.util.Scanner;
import java.util.InputMismatchException;

public class A5 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        float valorHora;
        float qtdHora;

      try {
            System.out.printf("Insira o valor da sua hora: ");
            valorHora = ler.nextFloat();

            System.out.printf("Insira a quantidade de horas trabalhadas: ");
            qtdHora = ler.nextFloat();

        } catch (InputMismatchException e) {
            System.out.printf("Deve inserir um valor númerico.");
            ler.close();
            return;
        } catch (Exception e) {
            e.printStackTrace();
            ler.close();
            return;
        }

        float salario = valorHora * qtdHora;
        float ImpostoRenda = 0.0f;

        if (salario <= 900){
         ImpostoRenda = 0.0f;
        }
            
        else if (salario <= 1500){
           ImpostoRenda = salario * 0.05f;
            }
        else if (salario <= 2500){
           ImpostoRenda = salario * 0.1f;
            }  
        else {
           ImpostoRenda = salario * 0.2f;
            
            }                     
        
        float INSS = salario * 0.10f;
        float Sindicato = salario * 0.03f;
        float FGTS = salario * 0.11f; 
        float totalDesc = ImpostoRenda + Sindicato + INSS;
        float SalarioLiquido = salario - totalDesc;

System.out.printf(
  "\nQTDE de Horas Trabalhadas:     %.0f" +
  "\nValor da hora trabalhada:      R$ %10.2f" +
  "\nSalário Bruto (%.0f * %.2f):    R$ %10.2f" +
  "\n(-) IR (5%%):                   R$ %10.2f" +
  "\n(-) INSS (10%%):                R$ %10.2f" +
  "\n(-) Sindicato (3%%):            R$ %10.2f" +
  "\nFGTS (11%%):                    R$ %10.2f" +
  "\nTotal de descontos:            R$ %10.2f" +
  "\nSalário Líquido:               R$ %10.2f\n",
  qtdHora, valorHora, qtdHora, valorHora, salario,
  ImpostoRenda, INSS, Sindicato, FGTS, totalDesc, SalarioLiquido);

        ler.close();
       
   }
}
