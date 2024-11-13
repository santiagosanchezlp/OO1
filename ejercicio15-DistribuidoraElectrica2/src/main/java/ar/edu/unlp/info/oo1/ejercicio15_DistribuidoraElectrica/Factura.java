package ar.edu.unlp.info.oo1.ejercicio15_DistribuidoraElectrica;

public class Factura {
	private Usuario usuario;
	private java.time.LocalDate fecha;
	private double bonificacion;
	private double montoFinal;
	private gestorCuadroTarifario tarifas;
	
	public Factura(gestorCuadroTarifario unaTarifa) {
		this.tarifas = unaTarifa;
	}
	
	public void nuevaFactura (Usuario unUsuario) {
		this.usuario = unUsuario;
		this.fecha = java.time.LocalDate.now();
		this.bonificacion = this.calculoBonificacion();
		this.montoFinal = this.calcularCosto() - this.bonificacion;
	}
	
	private double calcularCosto() {
		return usuario.getUltimoConsumoActivo() * tarifas.getTarifaVigente().getCosto();
	}
	
	private double calculoBonificacion() {
		if (correspondeBonificacion())
			return this.calcularCosto() * 0.1;
		return 0;
	}
	
	private boolean correspondeBonificacion() {
		return this.factorDePotencia() > 0.8;
	}
	private double factorDePotencia() {
		return usuario.getUltimoConsumoActivo() / Math.sqrt(Math.pow(usuario.getUltimoConsumoActivo(), 2) + Math.pow(usuario.getUltimoConsumoReactivo(), 2));
	}

	public double getMontoFinal() {
		return this.montoFinal;
	}
}
