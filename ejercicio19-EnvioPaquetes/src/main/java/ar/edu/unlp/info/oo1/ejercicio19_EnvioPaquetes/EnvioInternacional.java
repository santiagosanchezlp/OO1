package ar.edu.unlp.info.oo1.ejercicio19_EnvioPaquetes;

public class EnvioInternacional extends Envio{
	
	public EnvioInternacional(java.time.LocalDate unaFecha, String unOrigen, String unDestino, int unPeso) {
		super(unaFecha, unOrigen, unDestino, unPeso);
	}
	
	private double costoVariable() {
		if (this.peso <= 1000)
			return this.peso*10;
		return this.peso*12;
	}
	
	public double calcularCosto() {
		return 5000 + this.costoVariable();
	}

}
