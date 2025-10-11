import java.util.Scanner; 

public class B {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in); 
        
        System.out.print("Insira a temperatura em Fahrenheit: ");
        int F = ler.nextInt();

        int c = ((F - 32) * 5) / 9;

        System.out.println("A sua temperatura convertida para Celsius é: " + c + " graus ")
;
ler.close();
    }
}


