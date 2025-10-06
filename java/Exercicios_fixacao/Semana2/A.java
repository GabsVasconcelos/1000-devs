import java.util.Scanner; 

public class A {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in); 
        
        System.out.print("Insira a temperatura em Celsius: ");
        int c = ler.nextInt();

        int F = 9 * c + 160;

        System.out.println("A sua temperatura convertida para Farenheint é: " + F + " graus ")
;

    }
}
