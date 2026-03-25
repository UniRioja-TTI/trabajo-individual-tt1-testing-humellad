package servicios;

import java.util.*;

import org.springframework.stereotype.Service;

import modelo.*;

@Service
public class EjemploContacto implements interfaces.InterfazContactoSim{
	private List<Entidad> entidades = new ArrayList<>();
	public Map<Integer, DatosSolicitud> solicitudes = new HashMap<Integer, DatosSolicitud>();
    private Random random = new Random();
    
    public EjemploContacto() {
    	Entidad a = new Entidad();
    	a.setId(1);
    	a.setName("a");
    	a.setDescripcion("ej1");
    	Entidad b = new Entidad();
    	b.setId(2);
    	b.setName("b");
    	b.setDescripcion("ej2");
    	Entidad c = new Entidad();
    	c.setId(3);
    	c.setName("c");
    	c.setDescripcion("ej3");
    	Entidad d = new Entidad();
    	d.setId(4);
    	d.setName("d");
    	d.setDescripcion("ej4");
    	entidades.add(a);
    	entidades.add(b);
    	entidades.add(c);
    	entidades.add(d);
    }
    
	@Override
	public int solicitarSimulation(DatosSolicitud sol) {
		int token = this.random.nextInt();
		this.solicitudes.put(token, sol);
		return token;
	}

	@Override
	public DatosSimulation descargarDatos(int ticket) {
		return null;
	}

	@Override
	public List<Entidad> getEntities() {
		return this.entidades;
	}

	@Override
	public boolean isValidEntityId() {
		return false;
	}

}
