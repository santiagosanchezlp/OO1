package ar.edu.unlp.info.oo1.ejercicio19_EnvioPaquetes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public abstract class Cliente {
	protected String nombre;
	protected String direccion;
	protected List <Envio> envios;
	
	public Cliente (String unNombre, String unaDireccion) {
		this.nombre = unNombre;
		this.setDireccion(unaDireccion);
		this.envios = new ArrayList<Envio>();
	}
	
	public void setNombre (String unNombre) {
		this.nombre = unNombre;
	}
	public String getNombre() {
		return this.nombre;
	}
	public boolean agregarEnvio (Envio unEnvio) {
		return this.envios.add(unEnvio);
	}
	
	public double calcularCosto (java.time.LocalDate desde, java.time.LocalDate hasta) {
		List<Envio> envioEntreFechas = envios.stream().filter(envio -> envio.entreFechas(desde, hasta)).collect(Collectors.toList());
		return envioEntreFechas.stream().mapToDouble(envio -> envio.calcularCosto()).sum();
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
}
