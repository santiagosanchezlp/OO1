package ar.edu.unlp.info.oo1.ejercicio19_EnvioPaquetes;

public class EnvioLocal extends Envio{
	public boolean entregaRapida;
	
	public EnvioLocal(java.time.LocalDate unaFecha, String unOrigen, String unDestino, int unPeso, boolean condEntrega) {
		super(unaFecha, unOrigen, unDestino, unPeso);
		this.entregaRapida = condEntrega;
	}
	
	private double costoEnvioRapido() {
		if (this.entregaRapida)
			return 500;
		return 0;
	}
	
	public double calcularCosto() {
		return 1000 + this.costoEnvioRapido();
	}
}
