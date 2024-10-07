package ar.edu.unlp.info.oo1.ejercicio13_ClienteDeCorreo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ClienteDeCorreoTest {
	private ClienteDeCorreo Cliente1;	
	private Carpeta Carpeta1;
	private Carpeta Carpeta2;
	private Email email1;
	private Email email2;
	private Email email3;
	private Email email4;
	private Email email5;
	private Email email6;
	private Email email7;
	private List<Archivo> adjuntos2;
	private List<Archivo> adjuntos3;
	private Archivo adjunto1;
	private Archivo adjunto2;
	private Archivo adjunto3;
	private Archivo adjunto4;
	private Archivo adjunto5;
	private Archivo adjunto6;
	
	@BeforeEach
	void setUp(){
		Cliente1 = new ClienteDeCorreo();
		Carpeta1 = new Carpeta("Carpeta 1");
		Carpeta2 = new Carpeta("Carpeta 2");
		Cliente1.crearCarpeta("carpeta 1");
		Cliente1.crearCarpeta("carpeta 2");
		Cliente1.agregarCarpeta(Carpeta1);
		Cliente1.agregarCarpeta(Carpeta2);
		adjunto1 = new Archivo ("Adjunto del correo 1"); //size = 20
		adjunto2 = new Archivo ("Adjunto del correo 2");
		adjunto3 = new Archivo ("Adjunto del correo 2");
		adjunto4 = new Archivo ("Adjunto del correo 3");
		adjunto5 = new Archivo ("Adjunto del correo 3");
		adjunto6 = new Archivo ("Adjunto del correo 6");
		adjuntos2 = new ArrayList<Archivo>();
		adjuntos2.add(adjunto2);
		adjuntos2.add(adjunto3);
		adjuntos3 = new ArrayList<Archivo>();
		adjuntos3.add(adjunto4);
		adjuntos3.add(adjunto5);
		email1 = new Email("Email 1", "Cuerpo del email 1", adjunto1); //size = 25 + 20
		email2 = new Email("Email 2", "Cuerpo del email 2", adjuntos2); //size = 25 + 20*2
		email3 = new Email("Email 3", "Cuerpo del email 3 y 4", adjuntos3); //size = 29 + 20*2
		email4 = new Email("Email 4", "Cuerpo del email 3 y 4"); //size = 29
		email5 = new Email("Email 5", "Cuerpo del email 5, 6 y 7"); //size = 32
		email6 = new Email("Email 6", "Cuerpo del email 5, 6 y 7", adjunto6); //size = 32 + 20
		email7 = new Email("Email 7", "Cuerpo del email 5, 6 y 7"); //size = 32
	//total size = 38 + 58 + 62 + 22 + 25 + 45 + 25 = 275
		Cliente1.recibir(email1);
		Cliente1.recibir(email2);
		Cliente1.recibir(email3);
		Cliente1.recibir(email4);
		Cliente1.recibir(email5);
		Cliente1.recibir(email6);
		Cliente1.recibir(email7);
	}
	
	
	@Test
	void recibirYMoverCorreosTest() {
		assertEquals(45, email1.espacioOcupado());
		assertEquals(65, email2.espacioOcupado());
		assertEquals(69, email3.espacioOcupado());
		assertEquals(29, email4.espacioOcupado());
		assertEquals(32, email5.espacioOcupado());
		assertEquals(52, email6.espacioOcupado());
		assertEquals(32, email7.espacioOcupado());
		assertEquals(324, Cliente1.espacioOcupado());
		Cliente1.mover(Carpeta1, email2); //inbox 1,3,4,5,6,7 - 1:2 - 2:Nada
		Cliente1.mover(Carpeta1, Carpeta2, email2); //inbox 1,3,4,5,6,7 - 1:Nada - 2:2
		Cliente1.mover(Carpeta2, email3); //inbox 1,4,5,6,7 - 1:Nada - 2:2,3
		Cliente1.mover(Carpeta2, email4); //inbox 1,5,6,7 - 1:Nada - 2:2,3,4
		Cliente1.mover(Carpeta1, email5); //inbox 1,6,7 - 1:5 - 2:2,3,4
		Cliente1.mover(Carpeta1, email6); //inbox 1,7 - 1:5,6 - 2:2,3,4
		Cliente1.mover(Carpeta1, email2); //inbox 1,7 - 1:5,6 - 2:2,3,4
		Cliente1.mover(Carpeta2, Carpeta1, email2); //inbox 1,7 - 1:5,6,2 - 2:3,4
		assertEquals(149, Carpeta1.espacioOcupado());
		assertEquals(98, Carpeta2.espacioOcupado());
	}
	
	@Test
	void buscarCorreosTest() {
		assertEquals(email1, Cliente1.buscar("Cuerpo del email 1"));
		assertEquals(email5, Cliente1.buscar("Email 5"));
		assertEquals(email5, Cliente1.buscar("Cuerpo del email 5, 6 y 7"));
		Cliente1.mover(Carpeta1, email2); //inbox 1,3,4,5,6,7 - 1:2 - 2:Nada
		Cliente1.mover(Carpeta1, Carpeta2, email2); //inbox 1,3,4,5,6,7 - 1:Nada - 2:2
		Cliente1.mover(Carpeta2, email3); //inbox 1,4,5,6,7 - 1:Nada - 2:2,3
		Cliente1.mover(Carpeta2, email4); //inbox 1,5,6,7 - 1:Nada - 2:2,3,4
		Cliente1.mover(Carpeta1, email5); //inbox 1,6,7 - 1:5 - 2:2,3,4
		Cliente1.mover(Carpeta1, email6); //inbox 1,7 - 1:5,6 - 2:2,3,4
		Cliente1.mover(Carpeta1, email2); //inbox 1,7 - 1:5,6 - 2:2,3,4
		Cliente1.mover(Carpeta2, Carpeta1, email2); //inbox 1,7 - 1:5,6,2 - 2:3,4
		Cliente1.mover(Carpeta2, Carpeta1, email4); //inbox 1,7 - 1:5,6,2,4 - 2:3
		assertEquals(email7, Cliente1.buscar("Cuerpo del email 5, 6 y 7"));
		assertEquals(email4, Cliente1.buscar("Cuerpo del email 3 y 4"));
		assertEquals(324, Cliente1.espacioOcupado());
	}
	
}
