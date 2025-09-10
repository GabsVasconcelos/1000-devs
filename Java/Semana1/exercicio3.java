import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in); 
        
        System.out.print("Informe a quantidade de cavalos:  ");
        double qtdCavalo = ler.nextDouble();
        
        System.out.print("Informe o valor de cada ferradura:  ");
        double valorFer = ler.nextDouble();
        
        double qtdFer = qtdCavalo * 4;
        
        double totalfinal = qtdFer * valorFer;
        


        System.out.println("A quantidade de ferraduras necessárias é: " + qtdFer);
        
        System.out.println("Valor total para a compra das ferraduras: R$ " + totalfinal);
        
        ler.close();
    }
}
