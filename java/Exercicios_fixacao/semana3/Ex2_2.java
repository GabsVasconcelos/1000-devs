import java.util.Scanner; 
import java.util.InputMismatchException;

public class Ex2_2 {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in); 
        float nota1 = 0;
        float nota2 = 0;
        float nota3 = 0;
        float nota4 = 0;
        float aulaspresente = 0;
        float faltas = 0;

                        try {
        System.out.print("Insira a primeira nota do aluno: ");
        nota1 = ler.nextFloat();

        System.out.print("Insira a segunda nota do aluno: ");
        nota2 = ler.nextFloat();

        System.out.print("Insira a terceira nota do aluno: ");
        nota3 = ler.nextFloat();
        
        System.out.print("Insira a quarta nota do aluno: ");
        nota4 = ler.nextFloat();
        
        System.out.print("Insira quantidade total de aulas ministradas: ");
        aulaspresente = ler.nextFloat();
        
        System.out.print("Insira quantidade de faltas que o aluno cometeu: ");
        faltas = ler.nextFloat();
        
        
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

        float media = ((nota1 + nota2 + nota3 + nota4) / 4);
        float faltasperc = faltas * 100 / aulaspresente;
        

        if (faltasperc >= 25) { 
            System.out.printf ("O aluno foi Reprovado por faltas \n%.1f %% de faltas", faltasperc);
        }else if (media >= 6){
            System.out.printf ("O aluno foi Aprovado na média %.1f ", media);
        }
        else if (media >= 3 && media < 6){
            System.out.printf ("O aluno ficou em recuperação. Média %.1f ", media);
        }
        else {
            System.out.printf ("O aluno foi Reprovado na média %.1f ", media);
        }        

        ler.close();

    }
}



//Escreva um algoritmo que leia 4 notas de um aluno de 0 a 10. *
//Leia a quantidade de aulas que foram ministradas e a quantidade de aulas que o aluno faltou.*
//Calcule uma media simples entre as 4 notas * e também o percentual de faltas do aluno.
//Ao termino informe o aluno foi:
//Reprovado por falta. PercentualFaltas >= 25
//Aprovado. MediaNotas notas >= 6
//Recuperação. MediaNotas >= 3 e < 6
//Reprovado por Nota. MediaNotas < 3