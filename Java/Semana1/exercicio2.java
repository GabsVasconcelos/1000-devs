import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in); 
        
        System.out.print("Informe o valor do salario mínimo:  ");
        double min = ler.nextDouble();

        System.out.print("Informe o valor do salario do funcionário: ");
        double max = ler.nextDouble();
        
        double media = max / min;
        
        System.out.println("O funcionário recebe "+  String.format("%.2f", media)  + " salários mínimos");

        ler.close();
    }
}
