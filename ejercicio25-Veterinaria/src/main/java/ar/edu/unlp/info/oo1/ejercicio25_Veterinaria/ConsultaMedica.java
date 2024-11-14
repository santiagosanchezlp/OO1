package ar.edu.unlp.info.oo1.ejercicio25_Veterinaria;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class ConsultaMedica extends AtencionMedica{
	
	public ConsultaMedica (Veterinario unVeterinario, Mascota unaMascota) {
		super(unVeterinario, unaMascota);
	}
	
	public double calcularCosto() {
		return this.veterinario.getHonorarios() 
				+ this.calcularAdicionalMateriales()
				+ this.calcularAdicionalDomingo() 
				+ this.veterinario.getAntiguedad() * 100;
	}
}
