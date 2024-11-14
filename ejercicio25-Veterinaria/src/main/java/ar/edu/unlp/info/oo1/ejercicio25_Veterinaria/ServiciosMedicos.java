package ar.edu.unlp.info.oo1.ejercicio25_Veterinaria;

import java.time.LocalDate;

public interface ServiciosMedicos {
	abstract double calcularCosto();
	abstract LocalDate getFechaPrestacion();
	
	
}
