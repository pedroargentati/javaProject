import java.util.Scanner;

public class GlobalSolution {
	
	public static void main(String[] args) {      
        final int PAPEL = 1;
        final int VIDRO = 2;
        final int ALUMINIO = 3;
        final int PLASTICO = 4;
        final int SAIR = 5;
        
        Scanner entrada = new Scanner(System.in);
        
        double maiorDimensaoCaixa, menorDimensaoCaixa, pesoCaixa;
        double creditoFinal;
        double creditoPapel, creditoVidro,

        comLacre, semLacre, creditoPlastico, volume, peso;
        
        int material, a, b, c, contador;
        int qtdGarrafas, qtdLatasComLacre, qtdLatasSemLacre, qtdPET, qtdLatasTotal;

        maiorDimensaoCaixa = 0;
        menorDimensaoCaixa = 0;
        pesoCaixa = 0;
        creditoFinal = 0;
        peso = 0;
        contador = 0;
        qtdGarrafas = 0;
        qtdLatasComLacre = 0;
        qtdLatasSemLacre = 0;
        qtdLatasTotal = 0;
        qtdPET = 0;


        do
        {
        	System.out.println("\nMenu de Escola");
            System.out.print("\n1- PAPEL (CAIXA DE PAPEL�O)"); 
            System.out.print("\n2- VIDRO (GARRAFAS DE VINHO)");
            System.out.print("\n3- ALUM�NIO (LATAS DE REFRIGERANTE)");
            System.out.print("\n4- PL�STICO");
            System.out.print("\n5- [!] SAIR");
            System.out.println();
            System.out.print("\n* Digite o  material da coleta: ");
            material = entrada.nextInt();
            
            
            if (material < 1 || material > 5) 
            {
                System.out.println("[!]ERRO: op��o inv�lida.");
            }       
        }
        while (material < 1 || material > 5);

        while (material != SAIR) {

            if (material == PAPEL) {
            	do {
                    System.out.print("* Digite a maior dimens�o da caixa:");
                    maiorDimensaoCaixa = entrada.nextDouble();
                    System.out.print("* Digite a menor dimens�o da caixa:");
                    menorDimensaoCaixa = entrada.nextDouble();                
                   {
                	   for (a = 1; a <= maiorDimensaoCaixa; a++)
                            for (b = 1; b < menorDimensaoCaixa; b++) {
                                for (c = 1; c <= b; c++) {
                                    if (a * a == b * b + c * c) {
                                        contador++;
                                    }
                                }
                            }
                	    System.out.println();
                        System.out.println("[!] O n�mero de termos pitag�ricos s�o:" + contador);
                        creditoPapel = (0.10 * contador);
                        System.out.println("[!] O cr�dito de papel�o � R$: " + creditoPapel);
                    }
                    System.out.println();
                    System.out.print("[!]Digite o peso da caixa em (kg): ");
                    pesoCaixa = entrada.nextDouble();
                    
                    if (pesoCaixa >= 0.5 && pesoCaixa <= 2) {
                        peso = pesoCaixa * 0.2;
                        System.out.println();
                        System.out.println("O cr�dito do peso da caixa de papel�o � R$" + peso);
                        material = 0;
                    } 
                    else 
                    	System.out.println();
                    	System.out.println("[!]ERRO: O peso informado � inv�lido.");
                    
                    creditoFinal = creditoFinal + creditoPapel + peso;
                }
            	while (material == PAPEL);
            	
            	System.out.println();
                System.out.println("Digite o material ou digite 5 para SAIR do programa: ");
                material = entrada.nextInt();
            }


            if (material == VIDRO){
                do {
                    System.out.println("Informe a quantidade de garrafas: ");
                    qtdGarrafas = entrada.nextInt();
                    qtdGarrafas = qtdGarrafas;

                    if (qtdGarrafas >= 1 && qtdGarrafas <= 20) {
                        creditoVidro = qtdGarrafas * 0.15;
                        System.out.println("O cr�dito de material de vidro � (R$):" + creditoVidro);
                        material = 0;
                        creditoFinal = creditoFinal + creditoVidro;
                    } else 
                    	System.out.println("Quantidade de garrafas de vidro inv�lidas! Insira um valor entre 1 e 20");
                } while (material == VIDRO);
                	System.out.println("Digite o material ou digite 5 para SAIR do programa: ");
                	material = entrada.nextInt();
            }


            if (material == ALUMINIO) {
                do {
                    System.out.println("Digite a quantidade de latinhas com lacre: ");
                    qtdLatasComLacre = entrada.nextInt();
                    System.out.println("Digite a quantidade de latinhas sem lacre: ");
                    qtdLatasSemLacre = entrada.nextInt();
                    qtdLatasTotal = qtdLatasComLacre + qtdLatasSemLacre;

                    if (qtdLatasComLacre >= 1 && qtdLatasComLacre <= 30) {
                        comLacre = qtdLatasComLacre * 0.3;
                        System.out.printf("O cr�dito de latas com lacre  � R$: " + comLacre);
                        volume = qtdLatasSemLacre * 0.005;
                        semLacre = volume * 0.25;
                        System.out.println("O cr�dito de latas sem lacre  � R$: " + semLacre);
                        material = 0;
                        creditoFinal = creditoFinal + comLacre + semLacre;
                        
                    } else
                    	System.out.println("Quantidade de latas inv�lidas! Insira um valor entre 1 e 30");
                } while (material == ALUMINIO);

                System.out.println();
                System.out.println("Informe o material ou digite 5 para 'SAIR' do programa. ");
                material = entrada.nextInt();
            }

            if (material == PLASTICO){
                do {
                    System.out.println("Informe a quantidade de garrafas PET: ");
                    qtdPET = entrada.nextInt();
                    qtdPET = qtdPET;
                    if (qtdPET >= 1 && qtdPET <= 12){
                        creditoPlastico = qtdPET * 0.05;
                        System.out.println("O cr�dito de plastico � R$" + creditoPlastico);
                        material = 0;
                        creditoFinal = creditoFinal + creditoPlastico;
                    } else
                    	System.out.println("Quantidade de PETs inv�lida! Insira um valor entre 1 e 12");
                }  while (material == PLASTICO);

                System.out.println("Informe o material ou digite 5 para SAIR do programa: ");
                material = entrada.nextInt();
            }
        }

        if (material == SAIR){

            System.out.printf("O cr�dito final � de R$ %3.2f\n", creditoFinal);
            if (qtdGarrafas > qtdPET && qtdGarrafas > qtdLatasTotal) {
                System.out.println("A maior quantidade de material recicl�vel foi o vidro");
            }
            if (qtdLatasTotal > qtdGarrafas && qtdLatasTotal > qtdPET) {
                System.out.println("A maior quantidade de material recicl�vel foi o Alum�nio");
            }
            if (qtdPET > qtdGarrafas && qtdPET > qtdLatasTotal) {
                System.out.println("A maior quantidade de material recicl�vel foi o pl�stico");
            }  else if (qtdGarrafas == qtdPET && qtdGarrafas == qtdLatasTotal)
            		System.out.println("Os materias foram entregues em quantidades similares!");
        }
        
        System.out.println("\nPARAB�NS pela boa a��o! O mundo agradece.");
        entrada.close();
    }
}