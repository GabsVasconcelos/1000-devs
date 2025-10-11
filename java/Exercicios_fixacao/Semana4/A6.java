import java.util.Scanner;
import java.util.InputMismatchException;

public class A6 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

       
        int numero = 0;

      try {
            System.out.printf("Insira um número de 1 à 7: ");
            numero = ler.nextInt();

        } catch (InputMismatchException e) {
            System.out.printf("Deve inserir um valor númerico.");
            ler.close();
            return;
        } catch (Exception e) {
            e.printStackTrace();
            ler.close();
            return;
        }

     

      switch (numero) {    
      case 1:
            System.out.print("Domingo");        
            break;    
      case 2:
            System.out.print("Segunda-feira");
            break;
      case 3:        
            System.out.print("Terça-feira");        
            break;    
      case 4:        
            System.out.print("Quarta-feira");
            break;    
      case 5:        
            System.out.print("Quinta-feira");
            break;  
      case 6:
            System.out.print("Sexta-feira");
            break;    
      case 7:
            System.out.print("Sábado");
            break;
     default:
        System.out.println("Número inválido. Digite de 1 à 7.");
        break;   
      }

        ler.close();
       
   }
}
