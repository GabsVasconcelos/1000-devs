import java.util.Scanner; 

public class E {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in); 
        
        System.out.print("Insira o Valor da prestação do imóvel: ");
        double  VALOR = ler.nextDouble();

        System.out.print("Insira o tempo de atraso da prestação (em meses): ");
        double  TEMPO = ler.nextDouble();
        
        System.out.print("Insira a taxa por atraso (em %): ");
        double  TAXA = ler.nextDouble();
        
        double prestacao = VALOR + (VALOR* (TAXA/100) * TEMPO);
                
        
        System.out.println("O valor da prestação está em R$ " + prestacao)
;

    }
}

