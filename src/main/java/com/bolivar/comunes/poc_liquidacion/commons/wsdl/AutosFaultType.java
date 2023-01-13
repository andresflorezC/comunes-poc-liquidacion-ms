
package com.bolivar.comunes.poc_liquidacion.commons.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AutosFaultType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AutosFaultType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="exceptionType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="exceptionMessage" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="exceptionTrace" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AutosFaultType", namespace = "http://www.segurosbolivar.com/autos/common/dto", propOrder = {
    "exceptionType",
    "exceptionMessage",
    "exceptionTrace"
})
public class AutosFaultType {

    @XmlElement(required = true)
    protected String exceptionType;
    @XmlElement(required = true)
    protected String exceptionMessage;
    @XmlElement(required = true)
    protected String exceptionTrace;

    /**
     * Obtiene el valor de la propiedad exceptionType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExceptionType() {
        return exceptionType;
    }

    /**
     * Define el valor de la propiedad exceptionType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExceptionType(String value) {
        this.exceptionType = value;
    }

    /**
     * Obtiene el valor de la propiedad exceptionMessage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExceptionMessage() {
        return exceptionMessage;
    }

    /**
     * Define el valor de la propiedad exceptionMessage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExceptionMessage(String value) {
        this.exceptionMessage = value;
    }

    /**
     * Obtiene el valor de la propiedad exceptionTrace.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExceptionTrace() {
        return exceptionTrace;
    }

    /**
     * Define el valor de la propiedad exceptionTrace.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExceptionTrace(String value) {
        this.exceptionTrace = value;
    }

}
