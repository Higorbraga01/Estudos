package curso;

import java.util.Locale;
import java.util.Scanner;

public class TerceiroExercicio {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a > b && a > c) {
			System.out.println(" Maior numero = " + a);
		}
		else if (b > c) {
			System.out.println("Maior numero = " + b);
		}
		else {
			System.out.println("Maior numero = " + c);
		}
		sc.close();
	}

}
