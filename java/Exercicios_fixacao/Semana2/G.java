import java.util.Scanner; 

public class G {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in); 
        
        System.out.print("Insira o Valor para A: ");
        int A = ler.nextInt();

        System.out.print("Insira o Valor para B: ");
        int B = ler.nextInt();
        
        System.out.print("Insira o Valor para C: ");
        int C = ler.nextInt();
        
        System.out.print("Insira o Valor para D: ");
        int D = ler.nextInt();
        

        int calc1 = A + B;
        int calc2 = A + C;
        int calc3 = A + D;
        int calc4 = B + C;
        int calc5 = B + D;
        int calc6 = C + D;

        int calc11 = A * B;
        int calc22 = A * C;
        int calc33 = A * D;
        int calc44 = B * C;
        int calc55 = B * D;
        int calc66 = C * D;
        
        System.out.println("O RESULTADO DAS SOMAS ENTRE AS VARIAVEIS É  A + B = "  + calc1 + ", A + C = " + calc2 + ", A + D = " + calc3 + ", B + C = " + calc4 + ", B + D = " + calc5 + ", C + D = " + calc6);
;

        System.out.println("O RESULTADO DAS MULTIPLICAÇÃO ENTRE AS VARIAVEIS É  A * B = "  + calc11 + ", A * C = " + calc22 + ", A * D = " + calc33 + ", B * C = " + calc44 + ", B * D = " + calc55 + ", C * D = " + calc66);
;

    }
}

