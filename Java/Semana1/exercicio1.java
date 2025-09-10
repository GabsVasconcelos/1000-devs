import java.util.Scanner; 

public class Main {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in); 
        
        System.out.print("Quantos metros o terreno possui de frente: ");
        double frente = ler.nextDouble();

        System.out.print("Quantos metros o terro possui de lateral: ");
        double lateral = ler.nextDouble();
        
        double area = frente * lateral;
        
        double valorm2 = 235.30;
        
        double valor_total = area * valorm2;

        System.out.println("Área total do terreno de " + frente + " mts de frente com " + lateral + " mts de lateral é: " + area +  " mts")
;
        System.out.println("O valor deste terreno é: R$ " + valor_total)
;
    }
}
