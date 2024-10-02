package ar.edu.unlp.info.oo1.ejercicio11_Inversor;

public class InversionEnAcciones implements Inversiones{
	private String nombre;
	private int cantidad;
	private double valorUnitario;
	
	public InversionEnAcciones(String nombre) {
		this.nombre = nombre;
		this.cantidad = 0;
	}
	public void setCotizacion(double unaCotizacion) {
		this.valorUnitario = unaCotizacion;
	}
	public double getCotizacion () {
		return this.valorUnitario;
	}
	public void compra (int unaCantidad) {
		this.cantidad += unaCantidad;
	}
	public boolean venta (int unaCantidad) {
		if (unaCantidad <= cantidad) {
			this.cantidad -= unaCantidad;
			return true;
		}
		return false;
	}
	public String getEspecie() {
		return this.nombre;
	}
	public int getCantidad() {
		return this.cantidad;
	}
	public double valorActual() {
		return this.cantidad * this.valorUnitario;
	}
}
