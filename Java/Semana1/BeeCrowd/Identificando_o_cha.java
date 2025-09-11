import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int tipoCorreto = 1;
        int acertos = 0;

        System.out.println("Escolha o tipo de chá correto:");
        System.out.println("(1) chá branco");
        System.out.println("(2) chá verde");
        System.out.println("(3) chá preto");
        System.out.println("(4) chá de ervas");

        System.out.println("\nDigite as 5 respostas (uma por linha):");

        for (int i = 0; i < 5; i++) {
            int resposta = ler.nextInt();
            if (resposta == tipoCorreto) {
                acertos++;
            }
        }

        System.out.println("\nNúmero de acertos: " + acertos);

        ler.close();
    }
}
