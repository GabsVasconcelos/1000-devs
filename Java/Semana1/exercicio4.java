import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in); 
        
        System.out.print("Informe o salário:  ");
        double salario = ler.nextDouble();
        
        double percentual0 = 0.15;

        double percentual1 = 0.11;
        
        double percentual2 = 0.08;
        
        double per15 = salario * percentual0;
        
        double totalin = salario + per15;
        
        double per11 = totalin * percentual1;
        
        double per8 = totalin * percentual2;
        
        double totaldesc = per11 + per8;
        
        double totalfinal = totalin - totaldesc;
        

        System.out.println("Salario Inicial: R$" + salario);
        
        System.out.println("Salario Reajustado: R$ " + totalin);
        
        System.out.println("Desconto de 11% INSS: R$ " + per11);
        
        System.out.println("Desconto 8% FGTS: R$ " + per8);
        
        System.out.println("Total Descontos(INSS + FGTS): R$" + totaldesc);
        
        System.out.println("Salario Final: R$" + totalfinal);


        ler.close();
    }
}
