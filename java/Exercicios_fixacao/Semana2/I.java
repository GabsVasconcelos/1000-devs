import java.util.Scanner; 

public class I {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in); 

        System.out.print("Insira o valor: ");
        int valor = ler.nextInt();
        
        int valor_quadrado = valor * valor;

        System.out.println("o valor elevado ao quadrado é " + valor_quadrado);
;

    }
}

