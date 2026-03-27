package servicios;

import org.openapitools.client.*;
import org.openapitools.client.api.*;
import org.openapitools.client.model.*;
import org.slf4j.Logger;

import modelo.Destinatario;

public class EjemploEmails implements interfaces.InterfazEnviarEmails{
	private Logger logger;
	
	public EjemploEmails(Logger logger) {
		this.logger=logger;
	}
	
	@Override
	public boolean enviarEmail(Destinatario dest, String email) {
		// 1. Configurar el cliente (URL base de la API)
        ApiClient apiClient = new ApiClient();
        apiClient.setBasePath("https://api.tu-servidor.com");

        // 2. Instanciar el servicio específico
        EmailApi emailApi = new EmailApi(apiClient);

        try {
            // 3. Llamar al método (los parámetros coinciden con tu swagger.json)
            EmailResponse respuesta = emailApi.emailPost("usuario@correo.com", "Hola desde Java");
            
            if (respuesta.getDone()) {
                System.out.println("Correo enviado con éxito");
            }
        } catch (Exception e) {
            // Manejo de errores de conexión o 400 Bad Request
            System.err.println("Error al enviar email: " + e.getMessage());
        }
        return true;
	}

}
