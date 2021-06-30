package curso;

import java.util.Scanner;

public class CalculoDeHoras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		 int horaInicial = sc.nextInt();
		 int horaFinal = sc.nextInt();
		 
		 int duracao;
		 
		 if(horaInicial < horaFinal) {
			 duracao = horaFinal - horaInicial;
			 
		 }
		 else {
			 duracao = 24 - horaInicial + horaFinal;
		 }
		 
		System.out.println("O Jogo durou " + duracao + " Hora(S)");
		
		sc.close();

	}

}
