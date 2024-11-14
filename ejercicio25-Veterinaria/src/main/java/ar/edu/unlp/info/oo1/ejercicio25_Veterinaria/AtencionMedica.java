package ar.edu.unlp.info.oo1.ejercicio25_Veterinaria;

import java.time.DayOfWeek;
import java.time.LocalDate;

public abstract class AtencionMedica implements ServiciosMedicos{
	protected Veterinario veterinario;
	protected Mascota mascota;
	protected LocalDate fechaAtencion;
	
	public AtencionMedica (Veterinario unVeterinario, Mascota unaMascota) {
		this.veterinario = unVeterinario;
		this.mascota = unaMascota;
		this.fechaAtencion = LocalDate.now();
	}
	
	protected double calcularAdicionalDomingo() {
		if (fechaAtencion.getDayOfWeek() == DayOfWeek.SUNDAY)
			return 200;
		return 0;
	}
	
	protected double calcularAdicionalMateriales() {
		return 300;
	}
	
	public LocalDate getFechaPrestacion() {
		return fechaAtencion;
	}
	
	public abstract double calcularCosto();
}
