package ar.edu.unlp.info.oo1.ejercicio5_Figuras;

public class Circulo implements Figura{
	private double diametro;
	private double radio;

	public Circulo (double unRadio) {
		this.setRadio(unRadio);
	}
	public Circulo () {
		
	}
	
	public void setRadio(double unRadio) {
		this.radio = unRadio;
		this.diametro = unRadio * 2;
	}
	public double getRadio() {
		return this.radio;
	}
	public void setDiametro(double unDiametro) {
		this.radio = unDiametro / 2;
		this.diametro = unDiametro;
	}
	public double getDiametro() {
		return this.diametro;
	}
	public double getPerimetro() {
		return this.getDiametro() * Math.PI;
	}
	public double getArea() {
		return Math.pow(this.getRadio(),2) * Math.PI;
	}
}

