package ar.edu.unlp.info.oo1.ejercicio3_Presupuesto;

public class Item {
	private String detalle;
	private int cantidad;
	private double costoUnitario;
	
	public Item() {
		this.cantidad = 1;
	}
	
	public Item(String unDetalle, int unaCantidad, double unCosto) {
		this.setDetalle(unDetalle);
		this.setCantidad(unaCantidad);
		this.setCostoUnitario(unCosto);
	}
	
	public void setDetalle(String unDetalle) {
		this.detalle = unDetalle;
	}
	public String getDetalle() {
		return this.detalle;
	}
	public void setCantidad(int unaCantidad) {
		this.cantidad = unaCantidad;
	}
	public int getCantidad() {
		return this.cantidad;
	}
	public void setCostoUnitario(double unCosto) {
		this.costoUnitario = unCosto;
	}
	public double getCostoUnitario() {
		return this.costoUnitario;
	}
	public double costo() {
		return this.getCostoUnitario() * this.getCantidad();
	}
}
