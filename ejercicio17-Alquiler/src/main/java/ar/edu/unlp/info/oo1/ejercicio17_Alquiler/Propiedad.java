package ar.edu.unlp.info.oo1.ejercicio17_Alquiler;

import java.util.ArrayList;
import java.util.List;

public class Propiedad {
	private String direccion;
	private String descripcion;
	private double precio;
	private List<Reserva> reservas;
	
	public Propiedad(String unaDireccion, String unaDescripcion) {
		this.setDireccion(unaDireccion);
		this.setDescripcion(unaDescripcion);
		this.reservas = new ArrayList<Reserva>();
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public boolean disponible(DateLapse unPeriodo) {
		return !this.reservas.stream().anyMatch(r->r.getPeriod().includesPeriod(unPeriodo));
	}
	
	public boolean crearReserva(DateLapse unPeriodo) {
		if (this.disponible(unPeriodo)) {
			Reserva reserva = new Reserva(this, unPeriodo);
			return this.reservas.add(reserva);
		}
		return false;
	}
	
	public boolean cancelarReserva(DateLapse unPeriodo) {
		if (unPeriodo.includesDate(java.time.LocalDate.now()) == false) {
			Reserva reserva = reservas.stream().filter(r->r.getPeriod().equals(unPeriodo)).findAny().orElse(null);
			return this.reservas.remove(reserva);
		}	
		return false;
	}
	
	public double calcularIngreso() {
		return reservas.stream().mapToDouble(r->r.getPrecio()).sum();
	}
}
