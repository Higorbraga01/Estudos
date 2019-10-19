import java.util.ArrayList;
import java.util.List;

public class TestaAeronave {

	public static void main(String[] args) {
		
		
		//Hercules
		Hercules a1 = new Hercules();
		a1.setNome("Hercules");
		a1.setDataFab("1954");
		a1.setModelo("C-130");
		a1.exibirDados("Informações");
		Peca ph1 = new Peca("CA14105","FLAPS");
		Peca ph2 = new Peca("T56-A-15", "MOTOR");
		Peca ph3 = new Peca("APS-42", "RADAR");
		List PecasHercules = new ArrayList<Peca>();
		PecasHercules.add(ph1);
		PecasHercules.add(ph2);
		PecasHercules.add(ph3);
		for (Object peca : PecasHercules) {
			System.out.println("Peças disponiveis -> " +peca);
		}
		System.out.println("---------------------------------------");
		
		Caravan a2 = new Caravan();
		a2.setNome("Caravan");
		a2.setDataFab("1984");
		a2.setModelo("C-98");
		a2.exibirDados("Informaçoes");
		Peca pc1 = new Peca("3GFR34C703/106GA-0", "Hélice");
		Peca pc2 = new Peca("GKS254842", "GPS King Kln 89");
		Peca pc3 = new Peca("NI9528DC", "BATERIA");
		List PecasCaravan = new ArrayList<Peca>();
		PecasCaravan.add(pc1);
		PecasCaravan.add(pc2);
		PecasCaravan.add(pc3);
		for (Object pc : PecasCaravan) {
			System.out.println("Pecas Disponiveis -> " + pc);
		}
		System.out.println("---------------------------------------");
		
		Tucano a3 = new Tucano();
		a3.setNome("Tucano");
		a3.setDataFab("1980");
		a3.setModelo("EMB-312");
		a3.exibirDados("Informações");
		Peca pt1 = new Peca("BR3589CDS", "PT6A-25C");
		Peca pt2 = new Peca("NIDC25A", "BATERIA");
		Peca pt3 = new Peca("GSKBRDA", "Trem de pouso");
		List PecasTucano = new ArrayList<Peca>();
		PecasTucano.add(pt1);
		PecasTucano.add(pt2);
		PecasTucano.add(pt3);
		for (Object pt : PecasTucano) {
			System.out.println("Pecas Disponiveis ->" + pt);
			
		}

	

		
		
		

		
		
	
		
		
	}

}
