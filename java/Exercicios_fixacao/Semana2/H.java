import java.util.Scanner; 

public class H {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in); 
        
        System.out.print("Insira o comprimento da caixa: ");
        int comprimento = ler.nextInt();

        System.out.print("Insira a largura da caixa: ");
        int largura = ler.nextInt();
        
        System.out.print("Insira a altura da caixa: ");
        int altura = ler.nextInt();
        
        int volume = comprimento * largura * altura;
        

        System.out.println("o volume da caixa é de " + volume + " cm");
;

    }
}

