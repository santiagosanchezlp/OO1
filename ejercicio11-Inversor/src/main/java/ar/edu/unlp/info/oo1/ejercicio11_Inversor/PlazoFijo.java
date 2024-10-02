package ar.edu.unlp.info.oo1.ejercicio11_Inversor;

import java.time.LocalDate;
import static java.time.temporal.ChronoUnit.DAYS;

public class PlazoFijo implements Inversiones {
	private LocalDate fechaDeConstitucion;
	private double montoDepositado;
	private double porcentajeDeInteresDiario;
	
	public PlazoFijo(double unMonto, double unaTasa) {
		this.fechaDeConstitucion = LocalDate.now();
		this.montoDepositado = unMonto;
		this.porcentajeDeInteresDiario = unaTasa;
	}
	public PlazoFijo(double unMonto, double unaTasa, LocalDate unaFecha) {
		this.fechaDeConstitucion = unaFecha;
		this.montoDepositado = unMonto;
		this.porcentajeDeInteresDiario = unaTasa;
	}
	public LocalDate getFechaConstitucion() {
		return this.fechaDeConstitucion;
	}
	public double getMontoDepositado() {
		return this.montoDepositado;
	}
	public double getTasa() {
		return this.porcentajeDeInteresDiario;
	}
	public long getAnticuacion() {
		return DAYS.between(LocalDate.now(), this.fechaDeConstitucion);
	}
	public double valorActual() {
		return this.montoDepositado * (1 + (this.getAnticuacion() * this.getTasa()));
	}
}
