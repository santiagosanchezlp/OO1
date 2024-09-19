package ar.edu.info.unlp.ejercicio3;

public class Producto {
	private double peso;
	private double precioPorKilo;
	private String descripcion;
	
	public Producto() {
		
	}
	
	public Producto(double unPeso, double unPrecio, String unaDescripcion) {
		this.peso = unPeso;
		this.precioPorKilo = unPrecio;
		this.descripcion = unaDescripcion;
	}
	public void setPeso (double unPeso) {
		this.peso = unPeso;
	}
	public double getPeso () {
		return this.peso;
	}
	public void setPrecioPorKilo(double unPrecio) {
		this.precioPorKilo = unPrecio;
	}
	public double getPrecioPorKilo () {
		return this.precioPorKilo;
	}
	public void setDescripcion(String unaDescripcion) {
		this.descripcion = unaDescripcion;
	}
	public String getDescripcion () {
		return this.descripcion;
	}
	public double getPrecio() {
		double precio = this.peso * this.precioPorKilo;
		return precio;
	}
}
