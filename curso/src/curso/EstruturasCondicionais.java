package curso;

import java.util.Scanner;

public class EstruturasCondicionais {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com um numero inteiro");
		int n = sc.nextInt();
		
		if (n % 2 == 0) {
			System.out.println("Par!");
		}
		else {
			System.out.println("Impar!");
		}
		
		
		sc.close();
		
	}

}
