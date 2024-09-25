package ar.edu.unlp.info.oo1.ejercicio9_CuentaBancaria;

public class CajaDeAhorro extends Cuenta{
	
	public CajaDeAhorro() {
		super();
	}
	
	protected boolean puedeExtraer(double monto) {
		return (this.getSaldo()* 1.02 > monto);
	}
	public boolean extraer(double monto) {
		if (super.extraer(monto)) {
			super.extraerSinControlar(monto * 0.02);
			return true;
		}
		return false;
	}
	public boolean transferirACuenta(double monto, Cuenta cuentaDestino) {
		if (super.transferirACuenta(monto, cuentaDestino)){
			super.extraerSinControlar(monto * 0.02);
			return true;
		}
		return false;
	}
	public void depositar(double monto) {
		// si recibe una transferencia, se aplica un doble cobro de comisión. Debería ser así?
		super.depositar(monto);
		super.extraerSinControlar(monto * 0.02);
	}
	
}
