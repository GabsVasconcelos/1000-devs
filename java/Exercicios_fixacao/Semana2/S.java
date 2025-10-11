import java.util.Scanner; 

public class S {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in); 

        System.out.print("INSIRA UM NÚMERO:  ");
        double A = ler.nextDouble();
        System.out.print("INSIRA OUTRO NÚMERO:  ");
        double B = ler.nextDouble();



        double soma = A + B;
        double sub = A - B;
        double mult = A * B;
        double div = A / B;
        


        System.out.println("\nA SOMA DOS NÚMEROS RESULTA EM " + soma );
        System.out.println("\nA SUBTRAÇÃO DOS NÚMEROS RESULTA EM " + sub );
        System.out.println("\nA MULTIPLICAÇÃO DOS NÚMEROS RESULTA EM " + mult );
        System.out.println("\nA DIVISÃO DOS NÚMEROS RESULTA EM " + div );

;
ler.close();
    }
}

