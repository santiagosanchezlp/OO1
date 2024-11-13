package ar.edu.unlp.info.oo1.ejercicio19_EnvioPaquetes;

public abstract class Envio {
	protected java.time.LocalDate fechaDespacho;
	protected String origen;
	protected String destino;
	protected int peso;
	
	public Envio(java.time.LocalDate unaFecha, String unOrigen, String unDestino, int unPeso) {
		this.fechaDespacho = unaFecha;
		this.setOrigen(unOrigen);
		this.setDestino(unDestino);
		this.setPeso(unPeso);
	}
	
	public void setFechaDespacho (java.time.LocalDate unaFecha) {
		this.fechaDespacho = unaFecha;
	}
	public java.time.LocalDate getFechaDespacho (){
		return this.fechaDespacho;
	}
	
	public abstract double calcularCosto();
	
	public boolean entreFechas(java.time.LocalDate desde, java.time.LocalDate hasta) {
		return this.fechaDespacho.isAfter(desde) && this.fechaDespacho.isBefore(hasta);
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}
}
