import java.util.Scanner; 

public class F {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in); 
        
        System.out.print("Insira o Valor para A: ");
        int varA = ler.nextInt();

        System.out.print("Insira o Valor para B: ");
        int varB = ler.nextInt();
        

        int total = varA + varB;

        int B = total - varB;
        int A = total - varA;

        
        System.out.println("Os valores trocados são: A = " + A + " B = " + B);
;

    }
}

