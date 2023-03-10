
package com.bolivar.comunes.poc_liquidacion.commons.wsdl;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.2.2
 * 2023-01-11T17:31:40.733-05:00
 * Generated source version: 3.2.2
 */

@WebFault(name = "AutosFault", targetNamespace = "http://www.segurosbolivar.com/autos/dto/crea")
public class FaultMessage extends Exception {

    private com.bolivar.comunes.poc_liquidacion.commons.wsdl.AutosFaultType autosFault;

    public FaultMessage() {
        super();
    }

    public FaultMessage(String message) {
        super(message);
    }

    public FaultMessage(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public FaultMessage(String message, com.bolivar.comunes.poc_liquidacion.commons.wsdl.AutosFaultType autosFault) {
        super(message);
        this.autosFault = autosFault;
    }

    public FaultMessage(String message, com.bolivar.comunes.poc_liquidacion.commons.wsdl.AutosFaultType autosFault, java.lang.Throwable cause) {
        super(message, cause);
        this.autosFault = autosFault;
    }

    public com.bolivar.comunes.poc_liquidacion.commons.wsdl.AutosFaultType getFaultInfo() {
        return this.autosFault;
    }
}
