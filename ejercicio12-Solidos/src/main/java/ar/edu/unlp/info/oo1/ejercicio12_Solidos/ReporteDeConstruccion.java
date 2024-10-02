package ar.edu.unlp.info.oo1.ejercicio12_Solidos;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ReporteDeConstruccion {
	private List<Pieza> piezas;
	
	public ReporteDeConstruccion() {
		this.piezas = new ArrayList<>();
	}
	public void agregarPieza(Pieza unaPieza) {
		this.piezas.add(unaPieza);
	}
	public void quitarPieza(Pieza unaPieza) {
		this.piezas.remove(unaPieza);
	}
	
	public double volumenDeMaterial(String material) {
		List<Pieza> piezasMaterial = piezas.stream().filter(pieza -> pieza.getMaterial() == material).collect(Collectors.toList());
		return piezasMaterial.stream().mapToDouble(pieza -> pieza.getVolumenDeMaterial()).sum();
	}
	public double superficieDeColor (String color) {
		List <Pieza> piezasColor = piezas.stream().filter(pieza -> pieza.getColor() == color).collect(Collectors.toList());
		return piezasColor.stream().mapToDouble(pieza -> pieza.getSuperficieDeColor()).sum();
	}
	
}
