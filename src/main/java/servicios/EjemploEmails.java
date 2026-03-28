package servicios;

import org.slf4j.Logger;

import modelo.Destinatario;

public class EjemploEmails implements interfaces.InterfazEnviarEmails{
	private Logger logger;
	
	public EjemploEmails(Logger logger) {
		this.logger=logger;
	}
	
	@Override
	public boolean enviarEmail(Destinatario dest, String email) {
		
        return true;
	}

}
