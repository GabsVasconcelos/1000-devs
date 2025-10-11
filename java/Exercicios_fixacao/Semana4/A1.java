import java.util.Scanner; 
import java.util.InputMismatchException;

public class A1 {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in); 
        float nota1 = 0;
        float nota2 = 0;

        try {
        System.out.print("Insira a primeira nota do aluno: ");
        nota1 = ler.nextFloat();

        System.out.print("Insira a segunda nota do aluno: ");
        nota2 = ler.nextFloat();

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

        float media = ((nota1 + nota2) / 2);
       

        if (media == 10) { 
            System.out.printf ("O aluno foi Aprovado com distinção. Média %.1f ", media);
        }
        else if (media >= 7){
            System.out.printf ("O aluno foi Aprovado na média %.1f ", media);
        }
        else {
            System.out.printf ("O aluno foi Reprovado na média %.1f ", media);
        }        

        ler.close();

    }
}

