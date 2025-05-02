import java.util.Scanner;

public class main11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos números deseja somar ?: ");
		int N = sc.nextInt();
		int soma = 0;
		
		
		
		for (int i=0; i<N; i=i+1) {
			System.out.print("Digite o " + (i + 1) + "º número: ");
			int x = sc.nextInt();
			soma=soma+x;
		}
				
		System.out.println("A soma total é: " + soma);
				
	sc.close();
	}

}
