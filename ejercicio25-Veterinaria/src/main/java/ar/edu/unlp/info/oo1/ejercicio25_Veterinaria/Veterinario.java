package ar.edu.unlp.info.oo1.ejercicio25_Veterinaria;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Veterinario {
	private String nombre;
	private LocalDate fechaIngreso;
	private double honorarios;
	
	public Veterinario (String unNombre, LocalDate unaFecha, double unHonorario) {
		this.nombre = unNombre;
		this.fechaIngreso = unaFecha;
		this.setHonorarios(unHonorario);
	}

	public double getHonorarios() {
		return honorarios;
	}

	public void setHonorarios(double honorarios) {
		this.honorarios = honorarios;
	}
	
	public int getAntiguedad() {
		return (int) ChronoUnit.YEARS.between(fechaIngreso, LocalDate.now());
	}
}
