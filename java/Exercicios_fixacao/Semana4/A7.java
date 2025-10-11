import java.util.Scanner; 
import java.util.InputMismatchException;

public class A7 {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in); 
        float nota1;
        float nota2;

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
       

        if (media >= 9) { 
            System.out.printf ("O aluno teve a Média de Aproveitamento %.1f. Conceito A ", media);
        }
        else if (media >= 7.5){
            System.out.printf ("O aluno teve a Média de Aproveitamento %.1f. Conceito B ", media);
        }
        else if (media >= 6){
            System.out.printf ("O aluno teve a Média de Aproveitamento %.1f. Conceito C ", media);
        }
        else if (media >= 4){
            System.out.printf ("O aluno teve a Média de Aproveitamento %.1f. Conceito D", media);
        }
        else {
            System.out.printf ("O aluno teve a Média de Aproveitamento %.1f. Conceito E ", media);
        }        

        ler.close();

    }
}