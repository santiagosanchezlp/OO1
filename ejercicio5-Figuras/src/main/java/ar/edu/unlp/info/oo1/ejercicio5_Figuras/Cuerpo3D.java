package ar.edu.unlp.info.oo1.ejercicio5_Figuras;

public class Cuerpo3D {
	private Figura cara;
	private double altura;
	
	public Cuerpo3D(Figura unaCara, double unaAltura) {
		this.setAltura(unaAltura);
		this.setCaraBasal(unaCara);
	}
	public Cuerpo3D() {
	}
	public void setAltura (double unaAltura) {
		this.altura = unaAltura;
	}
	public double getAltura () {
		return this.altura;
	}
	public void setCaraBasal (Figura unaCara) {
		this.cara = unaCara;
	}
	public double getVolumen() {
		return this.cara.getArea() * this.getAltura();
	}
	public double getSuperficieExterior() {
		return this.cara.getArea() * 2 + this.cara.getPerimetro() * this.getAltura();
	}
}
