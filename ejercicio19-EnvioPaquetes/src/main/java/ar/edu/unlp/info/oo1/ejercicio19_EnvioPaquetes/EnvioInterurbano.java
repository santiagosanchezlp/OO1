package ar.edu.unlp.info.oo1.ejercicio19_EnvioPaquetes;

public class EnvioInterurbano extends Envio{
	public double distancia;
	
	public EnvioInterurbano(java.time.LocalDate unaFecha, String unOrigen, String unDestino, int unPeso, double unaDistancia) {
		super(unaFecha, unOrigen, unDestino, unPeso);
		this.distancia = unaDistancia;
	}
	
	public void setDistancia(double unaDistancia) {
		this.distancia = unaDistancia;
	}
	public double getDistancia () {
		return this.distancia;
	}
	
	private int costoPorKm() {
		if (this.distancia < 100)
			return 20;
		if (this.distancia > 500)
			return 30;
		return 25;
	}
	public double calcularCosto() {
		return this.costoPorKm() * this.peso;
	}
	
}