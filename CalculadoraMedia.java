import java.util.Locale;
import java.util.Scanner;

public class Main10 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Qual a primeira nota do aluno?");
              double nota1 = sc.nextDouble();
        System.out.println("Qual a segunda nota do aluno ?");
              double nota2 = sc.nextDouble();
              
        System.out.println("Analisando....");
		
              double notaFinal = nota1+nota2;
		
		System.out.printf("Nota Final = %.1f%n", notaFinal );
		
		if (notaFinal < 60.0) {
			System.out.println("REPROVADO(A)! Tente novamente ano que vem :(");
		
		} else {
			    System.out.println("APROVO(A)!");
		}	
		
	sc.close();
	
     }
}
