	
public class Tucano extends Aeronave implements Informacoes{

	private String versaoPainel = " Vers�o do painel: REV1.039518";
	
	public String getVersaoPainel() {
		return versaoPainel;
	}

	@Override
	public String exibirDados(String dados) {
		System.out.println ("Aeronave: " + this.getNome()+ " Ano de Fabrica��o: " + this.getDataFab() + " Modelo: " + this.getModelo()+ this.getVersaoPainel());
		return dados;
	}


	
	 
}
