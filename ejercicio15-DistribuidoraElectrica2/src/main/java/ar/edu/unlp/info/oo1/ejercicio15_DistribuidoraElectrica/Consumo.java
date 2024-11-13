package ar.edu.unlp.info.oo1.ejercicio15_DistribuidoraElectrica;

public class Consumo {
	private double energiaActiva;
	private double energiaReactiva;
	
	public Consumo (double unaEnergiaActiva, double unaEnergiaReactiva) {
		this.setEnergiaActiva(unaEnergiaActiva);
		this.setEnergiaReactiva(unaEnergiaReactiva);
	}

	public double getEnergiaActiva() {
		return this.energiaActiva;
	}

	public void setEnergiaActiva(double energiaActiva) {
		this.energiaActiva = energiaActiva;
	}

	public double getEnergiaReactiva() {
		return this.energiaReactiva;
	}

	public void setEnergiaReactiva(double energiaReactiva) {
		this.energiaReactiva = energiaReactiva;
	}


}
