
package com.bolivar.comunes.poc_liquidacion.commons.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ConsultaCotizAutoOutType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ConsultaCotizAutoOutType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="requestData" type="{http://www.segurosbolivar.com/autos/dto/crea}CotizacionAutosType"/&gt;
 *         &lt;element name="responseData" type="{http://www.segurosbolivar.com/autos/dto/crea}CotizacionAutosOutType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultaCotizAutoOutType", propOrder = {
    "requestData",
    "responseData"
})
public class ConsultaCotizAutoOutType {

    @XmlElement(required = true)
    protected CotizacionAutosType requestData;
    @XmlElement(required = true)
    protected CotizacionAutosOutType responseData;

    /**
     * Obtiene el valor de la propiedad requestData.
     * 
     * @return
     *     possible object is
     *     {@link CotizacionAutosType }
     *     
     */
    public CotizacionAutosType getRequestData() {
        return requestData;
    }

    /**
     * Define el valor de la propiedad requestData.
     * 
     * @param value
     *     allowed object is
     *     {@link CotizacionAutosType }
     *     
     */
    public void setRequestData(CotizacionAutosType value) {
        this.requestData = value;
    }

    /**
     * Obtiene el valor de la propiedad responseData.
     * 
     * @return
     *     possible object is
     *     {@link CotizacionAutosOutType }
     *     
     */
    public CotizacionAutosOutType getResponseData() {
        return responseData;
    }

    /**
     * Define el valor de la propiedad responseData.
     * 
     * @param value
     *     allowed object is
     *     {@link CotizacionAutosOutType }
     *     
     */
    public void setResponseData(CotizacionAutosOutType value) {
        this.responseData = value;
    }

}
