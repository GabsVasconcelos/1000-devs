import java.util.Scanner; 
import java.util.InputMismatchException;

public class A9 {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in); 

        int resposta;
        int contadorSim = 0;
      
        try {
        System.out.print("Responda as perguntas com  (1) para sim ou (0) para não \n");
        System.out.print("Telefonou para a vítima? :");
        resposta = ler.nextInt(); if (resposta == 1) { contadorSim++; }
        System.out.print("Esteve no local do crime?: ");
        resposta = ler.nextInt(); if (resposta == 1) { contadorSim++; }
        System.out.print("Mora perto da vítima?: ");
        resposta = ler.nextInt(); if (resposta == 1) { contadorSim++; }
        System.out.print("Devia para a vítima?: ");
        resposta = ler.nextInt(); if (resposta == 1) { contadorSim++; }
        System.out.print("Já trabalhou com a vítima?: ");
        resposta = ler.nextInt(); if (resposta == 1) { contadorSim++; }

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
        if (contadorSim <= 1) { 
            System.out.println("Inocente."); 
    }       
        else if (contadorSim == 2) 
        { System.out.println("Suspeito.");
     }
     else if (contadorSim <= 4) 
        { System.out.println("Cúmplice.");
     }
        else {
            
            System.out.printf ("Assassino");
        }        
        
        ler.close();

    }
}
