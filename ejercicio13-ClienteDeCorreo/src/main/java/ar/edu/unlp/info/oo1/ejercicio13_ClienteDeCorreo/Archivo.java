package ar.edu.unlp.info.oo1.ejercicio13_ClienteDeCorreo;

public class Archivo {
	private String nombre;
	private int tamaño;
	
	public Archivo(String unNombre) {
		this.nombre = unNombre;
		this.tamaño = unNombre.length();
	}
	public String getNombre() {
		return this.nombre;
	}
	public int tamaño() {
		return this.tamaño;
	}
	
}
