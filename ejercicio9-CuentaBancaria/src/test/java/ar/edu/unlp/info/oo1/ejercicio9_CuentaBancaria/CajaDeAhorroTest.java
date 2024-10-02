package ar.edu.unlp.info.oo1.ejercicio9_CuentaBancaria;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Aca escribiremos los test de unidad para cada clase 
 * 
 */
public class CajaDeAhorroTest {
	
	CajaDeAhorro CajaAhorro1, CajaAhorro2;
	
	@BeforeEach
	void setUp() throws Exception {
		CajaAhorro1 = new CajaDeAhorro();
		CajaAhorro2 = new CajaDeAhorro();
    	CajaAhorro2.depositar(400);
	}
	
    @Test
    public void testAlta() {
        assertEquals(0, CajaAhorro1.getSaldo());
    }
    @Test
    public void testDeposito() {
    	CajaAhorro2.depositar(200);
    	assertEquals(588, CajaAhorro2.getSaldo());
    }

    @Test
    public void testExtraccion() {
    	assertTrue(CajaAhorro2.extraer(100));
    	assertFalse(CajaAhorro2.extraer(400));
    	assertEquals(290,CajaAhorro2.getSaldo());
    	
    }
    @Test
    public void testTransferencia() {
    	assertTrue(CajaAhorro2.transferirACuenta(300,CajaAhorro1));
    	assertFalse(CajaAhorro2.transferirACuenta(600,CajaAhorro1));
    	assertEquals(86,CajaAhorro2.getSaldo());
    	assertEquals(299.88,CajaAhorro1.getSaldo());
    	
    }
}