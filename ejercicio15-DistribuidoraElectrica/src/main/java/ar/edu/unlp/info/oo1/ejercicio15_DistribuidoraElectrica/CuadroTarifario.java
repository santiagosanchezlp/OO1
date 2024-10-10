package ar.edu.unlp.info.oo1.ejercicio15_DistribuidoraElectrica;

public class CuadroTarifario {
	private double costo;
	private java.time.LocalDate desde;
	private java.time.LocalDate hasta;
	
	public CuadroTarifario(double unCosto, java.time.LocalDate unaFecha) {
		this.setCosto(unCosto);
		this.setDesde(unaFecha);
	}
	
	public double getCosto() {
		return this.costo;
	}
	
	public java.time.LocalDate getDesde(){
		return this.desde;
	}

	public java.time.LocalDate getHasta(){
		return this.hasta;
	}
	
	public void setCosto(double costo) {
		this.costo = costo;
	}
	
	public void setDesde(java.time.LocalDate unaFecha){
		this.desde = unaFecha;
	}
		
	public void setHasta(java.time.LocalDate unaFecha){
		this.hasta = unaFecha;
	}
}
