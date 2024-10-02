package ar.edu.unlp.info.oo1.ejercicio12_Solidos;

public class Esfera extends Pieza{
	private int radio;
	
	public Esfera (String unColor, String unMaterial, int radio) {
		this.setMaterial(unMaterial);
		this.setColor(unColor);
		this.setRadio(radio);
	}
	
	public void setRadio(int unRadio) {
		this.radio = unRadio;
	}
	public int getRadio() {
		return this.radio;
	}
	
	// Volumen de una esfera: ⁴⁄₃ * π * radio ³
	public double getVolumenDeMaterial () {
		return ((double) 4/3) * Math.PI * Math.pow(this.getRadio(), 3);
	}
	
	
	// Superficie de una esfera: 4 * π * radio 2

	
	public double getSuperficieDeColor () {
		return 4 * Math.PI * Math.pow(this.getRadio(), 2);
	}

}
