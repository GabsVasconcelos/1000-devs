import java.util.Scanner; 

public class J {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in); 

        System.out.print("Insira o valor A: ");
        int A = ler.nextInt();
        System.out.print("Insira o valor B: ");
        int B = ler.nextInt();
        
        
        int diferenca = A - B;
        int valor_quadrado = diferenca * diferenca;


        System.out.println("o quadrado do valor da diferença entre A e B é " + valor_quadrado );
;
ler.close();
    }
}

