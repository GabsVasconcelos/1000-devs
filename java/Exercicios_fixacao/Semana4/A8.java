import java.util.Scanner;
import java.util.InputMismatchException;

public class A8 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        float lado1, lado2, lado3;
        
      try {
            System.out.printf("Insira a medida do primeiro lado do triângulo: ");
            lado1 = ler.nextFloat();

            System.out.printf("Insira a medida do segundo lado do triângulo: ");
            lado2 = ler.nextFloat();

            System.out.printf("Insira a medida do terceiro lado do triângulo: ");
            lado3 = ler.nextFloat();



        } catch (InputMismatchException e) {
            System.out.printf("Deve inserir um valor númerico.");
            ler.close();
            return;
        } catch (Exception e) {
            e.printStackTrace();
            ler.close();
            return;
        }

        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1){
         System.out.printf("É um Triângulo");
        }
         else {
           System.out.printf("Não é um triângulo");
           ler.close();
           return;
            
            }

        if (lado1 == lado2 && lado2 == lado3){
         System.out.printf(" do tipo Equilátero");
        }
            
        else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3){
            System.out.printf(" do tipo Isósceles");
            }
        else {
           System.out.printf(" do tipo Escaleno");
                       }  
        

        ler.close();
       
   }
}
