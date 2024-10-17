package ar.edu.unlp.info.oo1.ejercicio17_Alquiler;

public class Reserva {
	private Propiedad propiedad;
	private DateLapse periodo;
	private double precio;
	
	public Reserva (Propiedad unaPropiedad, DateLapse unPeriodo) {
		this.propiedad = unaPropiedad;
		this.periodo = unPeriodo;
		this.precio = this.calcularPrecio();
	}
	
	private double calcularPrecio() {
		return this.periodo.sizeInDays() * this.propiedad.getPrecio();
	}
	
	public DateLapse getPeriod() {
		return this.periodo;
	}

	public double getPrecio() {
		return this.precio;
	}
	
	
}
