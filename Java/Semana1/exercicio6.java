import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in); 
        
        System.out.print("Digite a QTDE de sanduiches: ");
        double qtdburguer = ler.nextDouble();

        double queijo = qtdburguer * 2 * 50  / 1000.0;
        double burguer = qtdburguer * 120 / 1000.0;
        double presunto = qtdburguer * 50 / 1000.0;
        
    //dividi por 1000 para o valor final ficar como KG e não como GR

        System.out.println("Para produzir " + qtdburguer + " sanduiches serão necessários:");
        System.out.println(queijo + " Kgs de mussarela ");
        System.out.println(presunto + " Kgs de presunto");
        System.out.println(burguer + " Kgs de hamburguer");

        ler.close();
    }
}
