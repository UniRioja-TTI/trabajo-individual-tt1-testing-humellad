package servicios;

import org.slf4j.*;
import modelo.Destinatario;

import org.junit.jupiter.api.*;

class EjemploEmailTest {

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
	void testEnviarEmail() {
		LoggerConfig config = new LoggerConfig();
		Logger log = config.simulationLogger();
		EjemploEmails ej = new EjemploEmails(log);
		Destinatario dest = new Destinatario();
		String email1 = "abc@gmail.com";
		String email2 = "def@gmail.com";
		String email3 = "ghi@gmail.com";
		ej.enviarEmail(dest, email1);
		ej.enviarEmail(dest, email2);
		ej.enviarEmail(dest, email3);
		
		System.out.println("Correcto");
	}

}
