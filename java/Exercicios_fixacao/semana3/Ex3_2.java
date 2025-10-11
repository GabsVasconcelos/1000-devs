import java.util.Scanner; 
import java.util.InputMismatchException;

public class Ex3_2 {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in); 
        float peso = 0f;
        float altura = 0f;


        try {
        System.out.print("Insira o peso (em quilogramas): ");
        peso = ler.nextFloat();

        System.out.print("Insira a altura (em metros): ");
        altura = ler.nextFloat();      
        
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

        if (peso <= 0) {
            System.out.println("Peso inválido para cálculo do IMC.");
            ler.close();
            return;
}

        if (altura <= 0) {
            System.out.println("Altura inválida para cálculo do IMC.");
            ler.close();
            return;
        }


        float IMC = peso / (altura * altura);
        

        if (IMC < 18.5) { 
            System.out.printf ("\nSeu IMC é de %.1f você está abaixo do peso\n", IMC);
        }else if (IMC >= 18.5 && IMC <= 24.9){
            System.out.printf ("\nSeu IMC é de %.1f você está no peso normal\n", IMC);
        }
        else if (IMC >= 25.0 && IMC <= 29.9){
            System.out.printf ("\nSeu IMC é de %.1f você está Sobrepeso\n", IMC);
        }
        else if (IMC >= 30.0 && IMC <= 34.9){
            System.out.printf ("\nSeu IMC é de %.1f você está em Obesidade grau I\n", IMC);
        }
        else if (IMC >= 35.0 && IMC <= 39.9){
            System.out.printf ("\nSeu IMC é de %.1f você está em Obesidade grau II\n", IMC);
        }
        else {
            System.out.printf ("\nSeu IMC é de %.1f você está em Obesidade grau III (obesidade mórbida)\n", IMC);
        }        

        ler.close();

    }
}
