package servicios;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Assertions.*;

import modelo.DatosSolicitud;

class EjemploContactoTest {
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
	@Test
	void testSolicitarSimulation() {
		EjemploContacto ej = new EjemploContacto();
		Map<Integer, Integer> datos = new HashMap<Integer, Integer>();
		datos.put(1, 1);
		DatosSolicitud d1= new DatosSolicitud(datos);
		int t1=ej.solicitarSimulation(d1);
		datos.put(2, 2);
		DatosSolicitud d2= new DatosSolicitud(datos);
		int t2=ej.solicitarSimulation(d2);
		datos.put(3, 3);
		DatosSolicitud d3= new DatosSolicitud(datos);
		int t3=ej.solicitarSimulation(d3);
		datos.put(4, 4);
		DatosSolicitud d4= new DatosSolicitud(datos);
		int t4=ej.solicitarSimulation(d4);
		assertNotNull(t1);
		assertNotNull(t2);
		assertNotNull(t3);
		assertNotNull(t4);
		assertEquals(ej.solicitudes.get(t1), d1);
		assertEquals(ej.solicitudes.get(t2), d2);
		assertEquals(ej.solicitudes.get(t3), d3);
		assertEquals(ej.solicitudes.get(t4), d4);
		System.out.println("Correcto");
	}

}
