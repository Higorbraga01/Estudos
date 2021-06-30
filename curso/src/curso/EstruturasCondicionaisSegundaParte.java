package curso;

import java.util.Scanner;

public class EstruturasCondicionaisSegundaParte {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Que horas são ? ");
		int time = sc.nextInt();
		
		if (time < 12) {
			System.out.println("Bom dia! ");
		}
		else if (time < 18){
			System.out.println("Boa Tarde! ");
		}
			else {
				System.out.println("Boa Noite! ");
			}
			
		
		
		sc.close();
	}

}
