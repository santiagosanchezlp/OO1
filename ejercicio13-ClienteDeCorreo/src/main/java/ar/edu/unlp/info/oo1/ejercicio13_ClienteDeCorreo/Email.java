package ar.edu.unlp.info.oo1.ejercicio13_ClienteDeCorreo;

import java.util.ArrayList;
import java.util.List;

public class Email {
	private String titulo;
	private String cuerpo;
	private List<Archivo> archivosAdjuntos;
	
	public Email(String unTitulo, String unCuerpo) {
		this.titulo = unTitulo;
		this.cuerpo = unCuerpo;
		this.archivosAdjuntos = new ArrayList<Archivo>();
	}
	
	public Email(String unTitulo, String unCuerpo, Archivo unArchivo) {
		this.titulo = unTitulo;
		this.cuerpo = unCuerpo;
		this.archivosAdjuntos = new ArrayList<Archivo>();
		this.archivosAdjuntos.add(unArchivo);
	}
	
	
	public Email(String unTitulo, String unCuerpo, List<Archivo> archivos) {
		this.titulo = unTitulo;
		this.cuerpo = unCuerpo;
		this.archivosAdjuntos = new ArrayList<Archivo>();
		this.archivosAdjuntos = archivos;
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	public String getCuerpo(){
		return this.cuerpo;
		}
	public List<Archivo> adjuntos() {
		return this.archivosAdjuntos;
	}
	public boolean buscarTexto(String unTexto) {
		return this.getCuerpo().equals(unTexto) || this.getTitulo().equals(unTexto); 
	}
	public int espacioOcupado() {
		return this.espacioOcupadoAdjuntos() 
				+ this.getTitulo().length() 
				+ this.getCuerpo().length();
	}
	private int espacioOcupadoAdjuntos() {
		if (this.adjuntos() != null)
			return this.archivosAdjuntos.stream().
					mapToInt(archivo->archivo.tamaño()).sum();
		else return 0;
	}
}
