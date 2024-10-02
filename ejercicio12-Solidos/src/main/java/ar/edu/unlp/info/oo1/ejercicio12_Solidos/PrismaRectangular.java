package ar.edu.unlp.info.oo1.ejercicio12_Solidos;

public class PrismaRectangular extends Pieza{
	private int ladoMayor;
	private int ladoMenor;
	private int altura;
	
	public PrismaRectangular (String unColor, String unMaterial, int ladoMayor, int ladoMenor, int altura) {
		this.setMaterial(unMaterial);
		this.setColor(unColor);
		this.setLadoMayor(ladoMayor);
		this.setLadoMenor(ladoMenor);
		this.setAltura(altura);
	}
	
	public void setLadoMayor(int unLado) {
		this.ladoMayor = unLado;
	}
	public double getLadoMayor() {
		return this.ladoMayor;
	}
	public void setLadoMenor(int unLado) {
		this.ladoMenor = unLado;
	}
	public double getLadoMenor() {
		return this.ladoMenor;
	}
	public void setAltura(int unaAltura) {
		this.altura = unaAltura;
	}
	public int getAltura() {
		return this.altura;
	}
	
	// Volumen del prisma: ladoMayor * ladoMenor * altura

	public double getVolumenDeMaterial () {
		return this.ladoMayor * this.ladoMenor * this.altura;
	}
	
	// Superficie del prisma: 2 * (ladoMayor * ladoMenor + ladoMayor * altura + ladoMenor * altura)
	public double getSuperficieDeColor () {
		return 2 * (this.ladoMayor * this.ladoMenor + this.ladoMayor * this.altura + this.ladoMenor * this.altura);
	}
}
