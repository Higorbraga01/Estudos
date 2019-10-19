
public class Hercules extends Aeronave implements Informacoes {
	private String capacidadeCarga = " Capacidade de Carga: 33 000 kg";
	
	public String getCapacidadeCarga() {
		 return capacidadeCarga;
	}

	@Override
	public String exibirDados(String dados) {
		System.out.println ("Aeronave: " + this.getNome()+" Ano de Fabricação: " + this.getDataFab() + " Modelo: " + this.getModelo()+ this.getCapacidadeCarga());
		return dados;
	}




		
}
