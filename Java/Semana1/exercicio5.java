import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in); 
        
        System.out.print("Digite a QTDE de frangos: ");
        double qtdFrango = ler.nextDouble();
        
        
        double chip1 = qtdFrango * 1 * 4;
        double chip2 = qtdFrango * 2 * 3.50;
        
        double total = chip1 + chip2 ;

        System.out.print("O valor total para identificar os frangos é: R$ " + total);
        
        ler.close();
    }
}
