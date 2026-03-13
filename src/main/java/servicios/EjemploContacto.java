package servicios;

import java.util.List;

import org.springframework.stereotype.Service;

import modelo.DatosSimulation;
import modelo.DatosSolicitud;
import modelo.Entidad;

@Service
public class EjemploContacto implements interfaces.InterfazContactoSim{

	@Override
	public int solicitarSimulation(DatosSolicitud sol) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public DatosSimulation descargarDatos(int ticket) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Entidad> getEntities() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isValidEntityId() {
		// TODO Auto-generated method stub
		return false;
	}

}
