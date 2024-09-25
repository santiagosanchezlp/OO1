package ar.edu.unlp.info.oo1.ejercicio11_Inversor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Inversor {
	private String nombre;
	private List<Inversiones> inversiones;
	
	public Inversor(String nombre) {
		this.nombre = nombre;
		this.inversiones = new ArrayList<Inversiones>();
	}
	
	public void compra(String unaEspecie, int unaCantidad) {
		//como hago que este metodo aplique solo a acciones?
		InversionEnAcciones accionBuscada = inversiones.stream().filter(accion->accion.getEspecie().equals(unaEspecie));
		if (accionBuscada == null) {
			accionBuscada = new InversionEnAcciones(unaEspecie);
			inversiones.add(accionBuscada);
		}
		accionBuscada.compra(unaCantidad);
	}
	public boolean venta(String unaEspecie, int unaCantidad) {
		//como hago que este metodo aplique solo a acciones?
		InversionEnAcciones accionBuscada = inversiones.stream().filter(accion->accion.getEspecie().equals(unaEspecie));
		if (accionBuscada == null)
			return false;
		return accionBuscada.venta(unaCantidad);
	}
	
	public void constituirPlazoFijo(double unMonto, double unaTasa) {
		PlazoFijo plazoFijo = new PlazoFijo(unMonto, unaTasa);
		inversiones.add(plazoFijo);
	}
	
	public double valorActual() {
		return inversiones.stream().mapToDouble(inversiones -> inversiones.valorActual()).sum();
	}
	
}
