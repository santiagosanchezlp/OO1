package ar.edu.unlp.info.oo1.ejercicio13_ClienteDeCorreo;
import java.util.ArrayList;
import java.util.List;

public class Carpeta {
	private List <Email> emails;
	private String nombre;
	
	public Carpeta(String unNombre) {
		this.nombre = unNombre;
		this.emails = new ArrayList<Email>();
	}
	
	public String getNombre() {
		return this.nombre;
	}
	public void recibir(Email unEmail) {
		emails.add(unEmail);
	}
	public void eliminar(Email unEmail) {
		emails.remove(unEmail);
	}
	public void mover(Email unEmail, Carpeta destino) {
		if (emails.stream().anyMatch(email->email == unEmail)) {
			destino.recibir(unEmail);
			this.eliminar(unEmail);
		}
	}
	public Email buscar(String texto) {
		return this.emails.stream().
				filter(email-> email.buscarTexto(texto)).
				findFirst().orElse(null);
	}
	public int espacioOcupado() {
		return this.emails.stream().mapToInt(email-> email.espacioOcupado()).sum();
	}
}
