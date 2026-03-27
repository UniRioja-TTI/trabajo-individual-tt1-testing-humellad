import { EmailApi, ResultadosApi, SolicitudApi } from './api-client/api';
import { Configuration } from './api-client/configuration';

// Configuración del túnel hacia la VM (Puerto 8080 del anfitrión)
const config = new Configuration({
    basePath: "http://localhost:8080",
});

// Exportamos las instancias de las APIs disponibles
export const emailApi = new EmailApi(config);
export const resultadosApi = new ResultadosApi(config);
export const solicitudApi = new SolicitudApi(config);