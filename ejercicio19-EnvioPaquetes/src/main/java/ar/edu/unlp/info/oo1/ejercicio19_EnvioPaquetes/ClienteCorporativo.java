package ar.edu.unlp.info.oo1.ejercicio19_EnvioPaquetes;

public class ClienteCorporativo extends Cliente{
	private int CUIT;
	
	public ClienteCorporativo (String unNombre, String unaDireccion, int unCUIT) {
		super(unNombre, unaDireccion);
		this.CUIT = unCUIT;
	}
	public void setDNI(int unCUIT) {
		this.CUIT = unCUIT;
	}
	public int getDNI() {
		return this.CUIT;
	}
}
