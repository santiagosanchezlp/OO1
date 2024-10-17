package ar.edu.unlp.info.oo1.ejercicio17_Alquiler;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private String nombre;
	private String direccion;
	private int DNI;
	private List<Propiedad> inmuebles;
	
	public Usuario(String unNombre, String unaDireccion, int unDNI) {
		this.setNombre(unNombre);
		this.setDireccion(unaDireccion);
		this.setDNI(unDNI);
		inmuebles = new ArrayList<Propiedad>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getDNI() {
		return DNI;
	}

	public void setDNI(int dNI) {
		DNI = dNI;
	}

	public List<Propiedad> getInmuebles() {
		return inmuebles;
	}
	
	public void addInmuebles(Propiedad unInmueble) {
		inmuebles.add(unInmueble);
	}
	
	public double ingresos() {
		return this.inmuebles.stream().mapToDouble(i->i.calcularIngreso()).sum() * 0.75;
	}
	
}
