package ar.edu.unlp.info.oo1.ejercicio12_Solidos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PiezaTest {
	
	private ReporteDeConstruccion reporte;
	private Cilindro cili1, cili2;
	private Esfera esf1, esf2;
	private PrismaRectangular pris1, pris2;
	
	@BeforeEach
	public void setUp() {
		cili1 = new Cilindro("Rojo", "Hierro", 2,2);
		cili2 = new Cilindro("Verde", "Cedro", 1,2);
		esf1 = new Esfera("Marron", "Hierro", 3);
		esf2 = new Esfera("Azul", "Pino", 2);
		pris1 = new PrismaRectangular("Verde", "Hierro", 2, 2, 2);
		pris2 = new PrismaRectangular("Azul", "Pino", 2, 3, 4);
		
		reporte = new ReporteDeConstruccion();
		reporte.agregarPieza(cili1);
		reporte.agregarPieza(cili2);
		reporte.agregarPieza(esf1);
		reporte.agregarPieza(esf2);
		reporte.agregarPieza(pris1);
		reporte.agregarPieza(pris2);
	}
	
	@Test
	public void volumenTest() {
	assertEquals(25, Math.round(cili1.getVolumenDeMaterial()));
	assertEquals(6, Math.round(cili2.getVolumenDeMaterial()));
	assertEquals(113, Math.round(esf1.getVolumenDeMaterial()));
	assertEquals(34, Math.round(esf2.getVolumenDeMaterial()));
	assertEquals(8, Math.round(pris1.getVolumenDeMaterial()));
	assertEquals(24, Math.round(pris2.getVolumenDeMaterial()));
	}
	
	@Test
	public void superficieTest() {
	assertEquals(50, Math.round(cili1.getSuperficieDeColor()));
	assertEquals(19, Math.round(cili2.getSuperficieDeColor()));
	assertEquals(113, Math.round(esf1.getSuperficieDeColor()));
	assertEquals(50, Math.round(esf2.getSuperficieDeColor()));
	assertEquals(24, Math.round(pris1.getSuperficieDeColor()));
	assertEquals(52, Math.round(pris2.getSuperficieDeColor()));
	}
	
	@Test
	public void materialTest() {
		assertEquals(146, Math.round(reporte.volumenDeMaterial("Hierro")));
		assertEquals(6, Math.round(reporte.volumenDeMaterial("Cedro")));
		assertEquals(58, Math.round(reporte.volumenDeMaterial("Pino")));
		assertEquals(0, Math.round(reporte.volumenDeMaterial("Marfil")));
	}
	@Test
	public void colorTest() {
		
		assertEquals(50, Math.round(reporte.superficieDeColor("Rojo")));
		assertEquals(43, Math.round(reporte.superficieDeColor("Verde")));
		assertEquals(113, Math.round(reporte.superficieDeColor("Marron")));
		assertEquals(102, Math.round(reporte.superficieDeColor("Azul")));
	}
}
