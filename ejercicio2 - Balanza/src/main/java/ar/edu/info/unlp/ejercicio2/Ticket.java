package ar.edu.info.unlp.ejercicio2;

import java.time.LocalDate;

public class Ticket {
	private LocalDate fecha;
	private int cantidadDeProductos;
	private double pesoTotal;
	private double precioTotal;
	private double impuesto;
	
	public Ticket(int unaCantidad, double unPrecio, double unPeso) {
		this.cantidadDeProductos = unaCantidad;
		this.pesoTotal = unPeso;
		this.precioTotal = unPrecio;
		this.fecha = LocalDate.now();
		this.impuesto = this.precioTotal * 0.21;
	}
	public double impuesto() {
		return impuesto;
	}
	public double getPrecioTotal() {
		return this.precioTotal;
	}
	public double getImpuesto() {
		return this.impuesto;
	}
	public LocalDate getFecha() {
		return this.fecha;
	}
	public int getCantidadDeProductos() {
		return this.cantidadDeProductos;
	}
	public double getPesoTotal() {
		return this.pesoTotal;
	}
	public double getMontoAPagar() {
		double montoAPagar = getPrecioTotal() + getImpuesto();
		return montoAPagar;
	}
	
}
