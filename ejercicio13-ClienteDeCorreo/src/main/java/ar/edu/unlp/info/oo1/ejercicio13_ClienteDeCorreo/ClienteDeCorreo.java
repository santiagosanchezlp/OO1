package ar.edu.unlp.info.oo1.ejercicio13_ClienteDeCorreo;
import java.util.ArrayList;
import java.util.List;

public class ClienteDeCorreo {
	private Carpeta inbox;
	private List<Carpeta> carpetas;
	
	public ClienteDeCorreo() {
		this.inbox = new Carpeta("inbox");
		this.carpetas = new ArrayList<Carpeta>();
		this.carpetas.add(inbox);
	}
	
	public void agregarCarpeta(Carpeta unaCarpeta) {
		this.carpetas.add(unaCarpeta);
	}
	
	public void crearCarpeta(String unNombre) {
		Carpeta unaCarpeta = new Carpeta(unNombre);
		this.carpetas.add(unaCarpeta);
	}
	
	public void recibir(Email unEmail) {
		this.inbox.recibir(unEmail);
	}
	public void mover (Carpeta origen, Carpeta destino, Email unEmail) {
		// suponemos que origen y destino son parte de carpetas
		origen.mover(unEmail, destino);
	}
	public void mover (Carpeta destino, Email unEmail) {
		// suponemos que origen y destino son parte de carpetas
		inbox.mover(unEmail, destino);
	}
	public Email buscar(String texto) {
		return this.buscarCarpeta(texto).buscar(texto);
	}
	
	private Carpeta buscarCarpeta (String texto) {
		return this.carpetas.stream().
				filter(carpeta-> carpeta.buscar(texto) != null).
				findFirst().orElse(null);
	}
	public int espacioOcupado(){
		return this.carpetas.stream().mapToInt(carpeta -> carpeta.espacioOcupado()).sum();
	}
	
	
}
