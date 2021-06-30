package curso;

import java.util.Locale;
import java.util.Scanner;

public class PrimeiroExercicio {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Enter your full name:");
		String name = sc.nextLine();
		System.out.println("How many bedrooms are there in you house?");
		int bedroom = sc.nextInt();
		System.out.println("Enter product price:");
		double price = sc.nextDouble();
		System.out.println("Enter your last name, age and height (Same line):");
		String lastname = sc.next();
		int age = sc.nextInt();
		double height = sc.nextDouble();
		
		
		System.out.println(name);
		System.out.println(bedroom);
		System.out.printf("%.2f%n", price);
		System.out.println(lastname);
		System.out.println(age);
		System.out.printf("%.2f%n",height);
		
		
		
		
		sc.close();
		

	}

}
