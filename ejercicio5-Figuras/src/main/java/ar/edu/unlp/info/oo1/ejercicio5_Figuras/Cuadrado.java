package ar.edu.unlp.info.oo1.ejercicio5_Figuras;

public class Cuadrado implements Figura{
	private double lado;
	
	public Cuadrado(double unLado) {
		this.setLado(unLado);
	}
	public Cuadrado () {
		
	}
	public void setLado(double unLado) {
		this.lado = unLado;
	}
	public double getLado() {
		return this.lado;
	}
	public double getPerimetro() {
		return this.getLado() * 4;
	}
	public double getArea() {
		return Math.pow(this.getLado(),2);
	}
}
