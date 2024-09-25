package ar.edu.unlp.info.oo1.ejercicio8_Empleados;

public class EmpleadoJerarquico extends Empleado{
	
	public EmpleadoJerarquico() {
		
	}
	public EmpleadoJerarquico(String unNombre) {
		super(unNombre);
	}
	
	public double montoBasico() {
		return 45000;
	}
	public double sueldoBasico() {
		return super.sueldoBasico() + this.bonoPorCategoria();
	}
	public double bonoPorCategoria() {
		return 8000;
	}
}
