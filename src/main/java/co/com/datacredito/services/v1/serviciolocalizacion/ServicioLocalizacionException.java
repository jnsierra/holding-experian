
package co.com.datacredito.services.v1.serviciolocalizacion;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.18
 * 2019-04-21T20:18:29.390-05:00
 * Generated source version: 2.7.18
 */

@WebFault(name = "Fault", targetNamespace = "http://www.datacredito.com.co/services/schema/ServicioLocalizacion/v1")
public class ServicioLocalizacionException extends Exception {
    
    private co.com.datacredito.services.schema.serviciolocalizacion.v1.Fault fault;

    public ServicioLocalizacionException() {
        super();
    }
    
    public ServicioLocalizacionException(String message) {
        super(message);
    }
    
    public ServicioLocalizacionException(String message, Throwable cause) {
        super(message, cause);
    }

    public ServicioLocalizacionException(String message, co.com.datacredito.services.schema.serviciolocalizacion.v1.Fault fault) {
        super(message);
        this.fault = fault;
    }

    public ServicioLocalizacionException(String message, co.com.datacredito.services.schema.serviciolocalizacion.v1.Fault fault, Throwable cause) {
        super(message, cause);
        this.fault = fault;
    }

    public co.com.datacredito.services.schema.serviciolocalizacion.v1.Fault getFaultInfo() {
        return this.fault;
    }
}
