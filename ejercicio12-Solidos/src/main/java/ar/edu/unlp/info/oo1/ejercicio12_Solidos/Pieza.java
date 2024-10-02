package ar.edu.unlp.info.oo1.ejercicio12_Solidos;

public abstract class Pieza {
	private String material;
	private String color;
	
	public void setMaterial(String unMaterial) {
		this.material = unMaterial;
	}
	public String getMaterial() {
		return this.material;
	}
	public void setColor(String unColor) {
		this.color = unColor;
	}
	public String getColor() {
		return this.color;
	}
	
	public abstract double getVolumenDeMaterial ();
	public abstract double getSuperficieDeColor ();
	
	
}
