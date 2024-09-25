package ar.edu.unlp.info.oo1.ejercicio9_CuentaBancaria;

public class CuentaCorriente extends Cuenta{
	
	private double descubierto;

	public CuentaCorriente() {
		super();
		this.descubierto = 0;
	}
	
	public void setDescubierto(double monto) {
		this.descubierto = monto;
	}
	public double getDescubierto() {
		return this.descubierto;
	}
	
	protected boolean puedeExtraer(double monto) {
		return (this.getSaldo() + this.getDescubierto() > monto);
	}
	
}
