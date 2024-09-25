package ar.edu.unlp.info.oo1.ejercicio8_Empleados;

public class Gerente extends EmpleadoJerarquico{
	
	public Gerente() {
		
	}
	public Gerente(String unNombre) {
		super(unNombre);
	}
	public double montoBasico() {
		return 57000;
	}	
	
	public double aportes() {
		return this.montoBasico() * 0.05;
	}

}
//(1) Metodo aportes de la clase Gerente.
//(2) a) Metodo sueldoBasico de la clase EmpleadoJerarquico; 
//    b) Metodo sueldoBasico de la clase Empleado;
//    c) Metodo bonoPorCategoria de la clase EmpleadoJerarquico;
