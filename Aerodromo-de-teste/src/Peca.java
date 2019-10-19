
public class Peca {

	private String numeroSerie;
	private String modelo;
	
	
	public Peca(String numeroSerie, String modelo) {
		super();
		this.numeroSerie = numeroSerie;
		this.modelo = modelo;
	}
	

	public String getPeca() {
		return  " Numero de Serie:" + numeroSerie +" Modelo:"+ modelo;
		
	}

	@Override
	public String toString() {
		
		return  "N°Serie:" + this.numeroSerie + " Tipo:"+ this.modelo; 
	}
	
}
