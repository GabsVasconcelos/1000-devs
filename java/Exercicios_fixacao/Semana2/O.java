import java.util.Scanner;

public class O {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in); 

        System.out.print("Insira o valor de A: ");
        int a = ler.nextInt();
        System.out.print("Insira o valor de B: ");
        int b = ler.nextInt();
        System.out.print("Insira o valor de C: ");
        int c = ler.nextInt();
        System.out.print("Insira o valor de D: ");
        int d = ler.nextInt();

        int p = a * c;
        int s = b + d;

        System.out.println("O resultado do produto de A e C é: " + p);
        System.out.println("O resultado da soma de B e D é: " + s);

        ler.close(); // boa prática: fechar o Scanner
    }
}
