
public class Caravan extends Aeronave implements Informacoes{
	private String modeloMotor = " Motor: PT6A-114A";

	public String getModeloMotor() {
		return modeloMotor;
	}

	
	@Override
	public String exibirDados(String dados) {
		System.out.println ("Aeronave: " + this.getNome()+ " Ano de Fabrica��o: " + this.getDataFab() + " Modelo: " + this.getModelo()+ this.getModeloMotor());
		return dados;
	}


	
}
