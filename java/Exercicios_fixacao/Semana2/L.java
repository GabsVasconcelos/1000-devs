import java.util.Scanner; 

public class L {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in); 

        System.out.print("Informe a cotação do dólar (US$):  ");
        double dolar = ler.nextDouble();
        System.out.print("Informe a quantidade de real (R$) você possui:  ");
        double qtd_real = ler.nextDouble();
        
        double real_total = qtd_real / dolar;


        System.out.println("O valor da conversão em dólar (US$): " + real_total);
;
ler.close();
    }
}

