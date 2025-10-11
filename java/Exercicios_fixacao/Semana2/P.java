import java.util.Scanner; 

public class P {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in); 

        System.out.print("INSIRA O SALARIO MENSAL (R$):  ");
        double SM = ler.nextDouble();
        System.out.print("INSIRA O PERCENTUAL DE REAJUSTE (%):  ");
        double PR = ler.nextDouble();

        double prconv = SM * PR / 100;
        double NS = SM + prconv ;
 
        System.out.println("O SALARIO COM REAJUSTE SERÁ DE R$ " + NS);
;
ler.close();
    }
}

