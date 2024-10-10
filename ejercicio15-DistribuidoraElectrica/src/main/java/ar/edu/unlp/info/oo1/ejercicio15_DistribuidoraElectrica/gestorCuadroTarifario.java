package ar.edu.unlp.info.oo1.ejercicio15_DistribuidoraElectrica;

import java.util.ArrayList;
import java.util.List;

public class gestorCuadroTarifario {
	private List<CuadroTarifario> historial;
	private CuadroTarifario tarifaVigente;
	
	public gestorCuadroTarifario(double unCosto, java.time.LocalDate unaFecha) {
		this.tarifaVigente = new CuadroTarifario(unCosto, unaFecha);
		this.historial = new ArrayList<CuadroTarifario>();
	}
	
	public void nuevaTarifa (double unCosto, java.time.LocalDate unaFecha) {
		CuadroTarifario anterior = tarifaVigente;
		anterior.setHasta(unaFecha);
		historial.add(anterior);
		this.tarifaVigente.setCosto(unCosto);
		this.tarifaVigente.setDesde(unaFecha);
	}
	
	public CuadroTarifario getTarifaVigente() {
		return this.tarifaVigente;
	}
}
