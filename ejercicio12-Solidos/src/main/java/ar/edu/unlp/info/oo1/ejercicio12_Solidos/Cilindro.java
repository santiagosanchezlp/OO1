package ar.edu.unlp.info.oo1.ejercicio12_Solidos;

public class Cilindro extends Pieza{
	private int radio;
	private int altura;
	
	public Cilindro (String unColor, String unMaterial, int radio, int altura) {
		this.setMaterial(unMaterial);
		this.setColor(unColor);
		this.setRadio(radio);
		this.setAltura(altura);
	}
	
	public void setRadio(int unRadio) {
		this.radio = unRadio;
	}
	public int getRadio() {
		return this.radio;
	}
	public void setAltura(int unaAltura) {
		this.altura = unaAltura;
	}
	public int getAltura() {
		return this.altura;
	}
	
	// Volumen de un cilindro: π * radio 2 * h.
	
	public double getVolumenDeMaterial () {
		return Math.PI * Math.pow(this.radio, 2) * this.altura;
	}
	
	// Superficie de un cilindro: 2 * π * radio  * h + 2 * π * radio 2 
	public double getSuperficieDeColor () {
		return 2 * Math.PI * this.radio * this.altura + 2 * Math.PI * Math.pow(this.radio, 2);
	}
	

}
