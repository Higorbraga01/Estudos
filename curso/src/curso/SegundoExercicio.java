package curso;

import java.util.Locale;
import java.util.Scanner;

public class SegundoExercicio {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); // Atalho para importar a biblioteca automaticamente = CTRL + SHIFT + O 
	    
		System.out.println("Digite a largura do terreno");
		double largura = sc.nextDouble();
		System.out.println("Digite o comprimento do terreno");
		double comprimento = sc.nextDouble();
		System.out.println("Digite o preço do metro quadrado");
		double metroQuadrado = sc.nextDouble();
		
		double area = largura * comprimento;
		double preco = area * metroQuadrado;
		
		System.out.printf("AREA = %.2f%n", area);
		System.out.printf("PRECO = %.2f%n" , preco);
		
		
		
		
		sc.close(); // Não esquecer de fechar 
	}

}
