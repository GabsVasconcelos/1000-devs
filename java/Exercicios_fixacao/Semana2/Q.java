import java.util.Scanner; 

public class Q {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in); 

        System.out.print("INSIRA O RAIO: ");
        double R = ler.nextDouble();


        double A = 3.14159265 * R * R;

        System.out.println("A ÁREA DA CIRCUNFERÊNCIA É DE:  " + A);
;
ler.close();
    }
}

