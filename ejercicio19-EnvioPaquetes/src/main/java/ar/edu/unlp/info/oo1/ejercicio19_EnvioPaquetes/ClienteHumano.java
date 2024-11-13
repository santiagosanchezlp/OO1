package ar.edu.unlp.info.oo1.ejercicio19_EnvioPaquetes;

public class ClienteHumano extends Cliente{
	private int DNI;
	
	public ClienteHumano (String unNombre, String unaDireccion, int unDNI) {
		super(unNombre, unaDireccion);
		this.DNI = unDNI;
	}
	public void setDNI(int unDNI) {
		this.DNI = unDNI;
	}
	public int getDNI() {
		return this.DNI;
	}
	@Override
	public double calcularCosto (java.time.LocalDate desde, java.time.LocalDate hasta) {
		return super.calcularCosto(desde, hasta) * 0.9;
	}
}
