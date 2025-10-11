import java.util.Scanner; 

public class M {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in); 

        System.out.print("insira o valor de A:  ");
        int a = ler.nextInt();
        System.out.print("insira o valor de B:  ");
        int b = ler.nextInt();
        System.out.print("insira o valor de C:  ");
        int c = ler.nextInt();
        
        int quadA = a * a;
        int quadB = b * b;
        int quadC = c * c;
        
        int total = quadA + quadB + quadC;


        System.out.println("o valor da soma dos quadrados dos três valores lidos é: " + total);
;
ler.close();
    }
}

