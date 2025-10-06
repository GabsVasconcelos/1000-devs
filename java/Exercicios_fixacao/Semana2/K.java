import java.util.Scanner; 

public class K {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in); 

        System.out.print("Informe a cotação do dólar (US$):  ");
        double dolar = ler.nextDouble();
        System.out.print("Informe a quantidade de dólar (US$) você possui:  ");
        double qtd_dolar = ler.nextDouble();
        
        double dolar_total = dolar * qtd_dolar;


        System.out.println("O valor da conversão em real (R$): " + dolar_total);
;

    }
}

