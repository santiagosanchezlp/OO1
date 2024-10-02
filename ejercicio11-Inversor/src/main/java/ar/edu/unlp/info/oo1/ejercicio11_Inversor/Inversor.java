package ar.edu.unlp.info.oo1.ejercicio11_Inversor;

import java.util.ArrayList;
import java.util.List;

public class Inversor {
	private String nombre;
	private List<Inversiones> inversiones;
	
	public Inversor(String nombre) {
		this.nombre = nombre;
		this.inversiones = new ArrayList<Inversiones>();
	}
	public void compra(InversionEnAcciones unaAccion) {
			inversiones.add(unaAccion);
	}

	public void venta(InversionEnAcciones unaAccion) {
		inversiones.remove(unaAccion);
	}
	
	public void constituirPlazoFijo(double unMonto, double unaTasa) {
		PlazoFijo plazoFijo = new PlazoFijo(unMonto, unaTasa);
		inversiones.add(plazoFijo);
	}
	
	public double valorActual() {
		return inversiones.stream().mapToDouble(inversiones -> inversiones.valorActual()).sum();
	}
	public void agregarPlazoFijo(PlazoFijo unPlazoFijo) {
		inversiones.add(unPlazoFijo);
	}
	public void eliminarPlazoFijo(PlazoFijo unPlazoFijo) {
		inversiones.remove(unPlazoFijo);
	}
	
}
