import java.util.Scanner;
import java.util.InputMismatchException;

public class Ex2 {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in); 
        float min = 0;
        float max = 0;
                try {
        System.out.print("Informe o valor do salario mínimo:  ");
        min = ler.nextFloat();

        System.out.print("Informe o valor do salario do funcionário: ");
        max = ler.nextFloat();
        
    } catch (InputMismatchException e) {
       System.out.println("Deve inserir um valor númerico.");
        }
        catch (Exception e) {
          e.printStackTrace();
        }

        float media = max / min;
        
        System.out.printf("O funcionário recebe %.2f salários mínimos", media);

        ler.close();
    }
}
