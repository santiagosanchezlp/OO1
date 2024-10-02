package ar.edu.unlp.info.oo1.ejercicio9_CuentaBancaria;

public class CajaDeAhorro extends Cuenta{
	
	public CajaDeAhorro() {
		super();
	}
	
	protected boolean puedeExtraer(double monto) {
		return (this.getSaldo() >= monto);
	}
	public boolean extraer(double monto) {
		if (super.extraer(monto * 1.02)) {
			return true;
		}
		return false;
	}
	public boolean transferirACuenta(double monto, Cuenta cuentaDestino) {
		if (super.transferirACuenta(monto * 1.02, cuentaDestino)){
			return true;
		}
		return false;
	}
	public void depositar(double monto) {
		super.depositar(monto * 0.98);
	}
	
}
