
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package co.com.datacredito.services.v1.serviciolocalizacion;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.2.6
 * 2018-12-18T23:04:08.623-05:00
 * Generated source version: 3.2.6
 *
 */

@javax.jws.WebService(
                      serviceName = "ServicioLocalizacion",
                      portName = "ServicioLocalizacionPort.wan.https",
                      targetNamespace = "http://www.datacredito.com.co/services/v1/ServicioLocalizacion",
                      wsdlLocation = "file:/C:/Users/john/AppData/Local/Temp/tempdir4497559334029378679.tmp/ServicioLocalizacion_1.wsdl",
                      endpointInterface = "co.com.datacredito.services.v1.serviciolocalizacion.ServicioLocalizacion")

public class ServicioLocalizacionPortWanHttpsImpl implements ServicioLocalizacion {

    private static final Logger LOG = Logger.getLogger(ServicioLocalizacionPortWanHttpsImpl.class.getName());

    /* (non-Javadoc)
     * @see co.com.datacredito.services.v1.serviciolocalizacion.ServicioLocalizacion#consultarDatosLocalizacion(co.com.datacredito.services.schema.serviciolocalizacion.v1.ConsultarDatosLocalizacion parameters)*
     */
    public co.com.datacredito.services.schema.serviciolocalizacion.v1.ConsultarDatosLocalizacionResponse consultarDatosLocalizacion(co.com.datacredito.services.schema.serviciolocalizacion.v1.ConsultarDatosLocalizacion parameters) throws ServicioLocalizacionException   {
        LOG.info("Executing operation consultarDatosLocalizacion");
        System.out.println(parameters);
        try {
            co.com.datacredito.services.schema.serviciolocalizacion.v1.ConsultarDatosLocalizacionResponse _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new ServicioLocalizacionException("ServicioLocalizacionException...");
    }

    /* (non-Javadoc)
     * @see co.com.datacredito.services.v1.serviciolocalizacion.ServicioLocalizacion#customConsultarDatosLocalizacion(co.com.datacredito.services.schema.serviciolocalizacion.v1.CustomConsultarDatosLocalizacion parameters)*
     */
    public co.com.datacredito.services.schema.serviciolocalizacion.v1.CustomConsultarDatosLocalizacionResponse customConsultarDatosLocalizacion(co.com.datacredito.services.schema.serviciolocalizacion.v1.CustomConsultarDatosLocalizacion parameters) throws ServicioLocalizacionException   {
        LOG.info("Executing operation customConsultarDatosLocalizacion");
        System.out.println(parameters);
        try {
            co.com.datacredito.services.schema.serviciolocalizacion.v1.CustomConsultarDatosLocalizacionResponse _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new ServicioLocalizacionException("ServicioLocalizacionException...");
    }

}
