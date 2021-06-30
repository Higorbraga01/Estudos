package curso;

import java.util.Locale;
import java.util.Scanner;

public class Exercicios {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Digite um numero negativo ou positivo ");
		int  a = sc.nextInt();
		
		if(a < 0) {
			System.out.println("Negativo");
		}
		else {
			System.out.println("Não negativo ");
		}
		
		System.out.println("------------------------------");
		
		System.out.println("Digite um numero para saber se é PAR OU IMPAR");
		
		int b = sc.nextInt();
		
		if(b % 2 == 0) {
			System.out.println("PAR");
		}
		else {
			System.out.println("IMPAR");
		}
		
		sc.close();
	}


}
