package ar.edu.unlp.info.oo1.ejercicio25_Veterinaria;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Mascota {
	private String nombre;
	private LocalDate fechaNacimiento;
	private String especie;
	private List<ServiciosMedicos> servicios;
	
	public Mascota (String unNombre, LocalDate unaFecha, String unaEspecie) {
		this.nombre = unNombre;
		this.fechaNacimiento = unaFecha;
		this.especie = unaEspecie;
		this.servicios = new ArrayList<ServiciosMedicos>();
	}
	public int getCantidadServicios() {
		return servicios.size();
	}
	
	public double recaudacionGenerada(LocalDate unaFecha) {
		List<ServiciosMedicos> serviciosRecibidos = servicios.stream().filter(s -> s.getFechaPrestacion().isEqual(unaFecha)).collect(Collectors.toList());
		return serviciosRecibidos.stream().mapToDouble(s -> s.calcularCosto()).sum();
	}
}
