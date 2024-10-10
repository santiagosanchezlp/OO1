package ar.edu.unlp.info.oo1.ejercicio15_DistribuidoraElectrica;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private String nombre;
	private String domicilio;
	private List<Consumo> consumos;
	
	public Usuario (String unNombre, String unDomicilio) {
		this.nombre = unNombre;
		this.domicilio = unDomicilio;
		consumos = new ArrayList<Consumo>();
	}
	
	public void agregarConsumo(Consumo unConsumo) {
		consumos.add(unConsumo);
	}
	
	public double getUltimoConsumoActivo() {
		if (consumos.size() != 0)
			return consumos.get(consumos.size()-1).getEnergiaActiva();
		return 0;
	}
	public double getUltimoConsumoReactivo() {
		if (consumos.size() != 0)
			return consumos.get(consumos.size()-1).getEnergiaReactiva();
		return 0;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
}
