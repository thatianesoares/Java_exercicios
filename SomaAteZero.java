import java.util.Scanner;

public class main11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número: ");
		int x = sc.nextInt();
		
		int soma = 0;
		while (x != 0 ) {
			soma = soma + x;
			x = sc.nextInt();
		}
		
		System.out.println(soma);
				
				sc.close();
	}

}
