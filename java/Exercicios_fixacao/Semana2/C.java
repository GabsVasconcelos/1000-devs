import java.util.Scanner; 

public class C {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in); 
        
        System.out.print("Insira a altura da lata: ");
        double  altura = ler.nextDouble();

        System.out.print("Insira o raio da lata: ");
        double  R = ler.nextDouble();

        double volume =  3.14159 * R * R * altura;

        System.out.println("A lata tem " + volume + " cm³ de volume")
;

    }
}

