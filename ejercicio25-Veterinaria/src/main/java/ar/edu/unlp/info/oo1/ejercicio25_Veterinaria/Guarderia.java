package ar.edu.unlp.info.oo1.ejercicio25_Veterinaria;

import java.time.LocalDate;

public class Guarderia implements ServiciosMedicos{
	private Mascota mascota;
	private int cantidadDias;
	private LocalDate fechaInicio;
	
	public Guarderia (Mascota unaMascota, int unaCant) {
		this.mascota = unaMascota;
		this.cantidadDias= unaCant;
		this.fechaInicio = LocalDate.now();
	}
	
	private double porcentajeDescuento(){
		if (this.mascota.getCantidadServicios() >= 5)
			return 0.1;
		return 0;
	}
	
	public double calcularCosto() {
		return this.cantidadDias * 500 
				* (1 - this.porcentajeDescuento());
	}
	
	public LocalDate getFechaPrestacion() {
		return this.fechaInicio.plusDays(cantidadDias);
	}
}
