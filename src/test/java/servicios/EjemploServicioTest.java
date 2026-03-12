package servicios;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EjemploServicioTest {

	private EjemploServicio e;

    @BeforeEach
    void setUp() {
        // Instanciamos la clase manualmente para un test unitario puro
    	e = new EjemploServicio();
    }

    @Test
    void deberiaInstanciarseCorrectamente() {
        assertNotNull(e, "El servicio no debería ser nulo");
    }
	@Test
	void test() {
		fail("Not yet implemented");
	}

}
