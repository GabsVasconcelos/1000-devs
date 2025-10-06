import java.util.Scanner; 

public class D {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in); 
        
        System.out.print("Insira o tempo gasto em viagem: ");
        double  tempo = ler.nextDouble();

        System.out.print("Insira a velocidade média: ");
        double  velocidade = ler.nextDouble();
        
        double distancia = tempo * velocidade;
                
        double litros_usados = distancia / 12;

        System.out.println("Se a velocidade média é de " + velocidade + " e o tempo gasto na viagem é de " + tempo + " a distância percorrida será de " + distancia + " e você utilizará " + litros_usados + "litros de combustível na viagem")
;

    }
}

