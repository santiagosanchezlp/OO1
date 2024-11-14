package ar.edu.unlp.info.oo1.ejercicio25_Veterinaria;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Vacunacion extends AtencionMedica{
	private String vacuna;
	private double costo;
	
	public Vacunacion (Veterinario unVeterinario, Mascota unaMascota, String unaVacuna, double unCosto) {
		super(unVeterinario, unaMascota);
		this.vacuna = unaVacuna;
		this.costo = unCosto;
	}

	@Override
	protected double calcularAdicionalMateriales() {
		return 500;
	}
	
	public double calcularCosto() {
		return this.veterinario.getHonorarios() 
				+ this.calcularAdicionalMateriales()
				+ this.calcularAdicionalDomingo() 
				+ this.costo;
	}
	
}
