import java.util.Scanner; 

public class R {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in); 

        System.out.print("INSIRA A QUANTIDADE DE VOTOS PARA CANDIDATO A:  ");
        double A = ler.nextDouble();
        System.out.print("INSIRA A QUANTIDADE DE VOTOS PARA CANDIDATO B:  ");
        double B = ler.nextDouble();
        System.out.print("INSIRA A QUANTIDADE DE VOTOS PARA CANDIDATO C:  ");
        double C = ler.nextDouble();
        System.out.print("INSIRA A QUANTIDADE DE VOTOS EM BRANCO: ");
        double voto_branco = ler.nextDouble();
        System.out.print("INSIRA A QUANTIDADE DE VOTOS NULOS: ");
        double voto_nulo = ler.nextDouble();


        double voto_valido = A + B + C;
        double qntd_eleitores = voto_valido + voto_nulo + voto_branco;
        double perc_valido = voto_valido * 100 / qntd_eleitores;
        double perc_branco = voto_branco * 100 / qntd_eleitores;
        double perc_nulo =  voto_nulo * 100 / qntd_eleitores;
        double perc_a =  A * 100 / qntd_eleitores;
        double perc_b =  B * 100 / qntd_eleitores;
        double perc_c =  C * 100 / qntd_eleitores;


        System.out.println("\nHOUVERAM " + voto_valido + " votos válidos");
        System.out.println("\nA QUANTIDADE TOTAL DE ELEITORES FORAM DE " + qntd_eleitores);
        System.out.println("\nO PERCENTUAL TOTAL DE VOTOS VÁLIDOS FOI DE " + perc_valido + "%" );
        System.out.println("\nO PERCENTUAL TOTAL DE VOTOS BRANCO FOI DE " + perc_branco + "%" );
        System.out.println("\nO PERCENTUAL TOTAL DE VOTOS NULOS FOI DE " + perc_nulo + "%" );
        System.out.println("\nO PERCENTUAL DE VOTOS DO CANDIDATO A FOI DE " + perc_a + "%" );
        System.out.println("\nO PERCENTUAL DE VOTOS DO CANDIDATO B FOI DE " + perc_b + "%" );
        System.out.println("\nO PERCENTUAL DE VOTOS DO CANDIDATO C FOI DE " + perc_c + "%" );
;
ler.close();
    }
}

