package curso;

import java.util.Scanner;

public class EstruturaPara {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many integer numbers are you going to  enter: ");
		int n = sc.nextInt();
		
		int sum = 0;
	
		for(int i = 1; i <= n; i++) {
			
			System.out.print("Value #" + i + ": ");
			int x = sc.nextInt();
			sum += x;
			
		}
		System.out.print("Sum = " + sum);
		sc.close();
		

	}

}
