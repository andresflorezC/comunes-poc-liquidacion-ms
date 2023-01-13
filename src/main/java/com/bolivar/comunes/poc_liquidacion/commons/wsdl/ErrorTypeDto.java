
package com.bolivar.comunes.poc_liquidacion.commons.wsdl;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ErrorTypeDto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ErrorTypeDto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idError" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="descError" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipoError" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="msgErrorOrcl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="msgErrorOrcl1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ErrorTypeDto", namespace = "http://www.segurosbolivar.com/autos/common/dto", propOrder = {
    "idError",
    "descError",
    "tipoError",
    "msgErrorOrcl",
    "msgErrorOrcl1"
})
public class ErrorTypeDto {

    protected BigDecimal idError;
    protected String descError;
    protected String tipoError;
    protected String msgErrorOrcl;
    protected String msgErrorOrcl1;

    /**
     * Obtiene el valor de la propiedad idError.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIdError() {
        return idError;
    }

    /**
     * Define el valor de la propiedad idError.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIdError(BigDecimal value) {
        this.idError = value;
    }

    /**
     * Obtiene el valor de la propiedad descError.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescError() {
        return descError;
    }

    /**
     * Define el valor de la propiedad descError.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescError(String value) {
        this.descError = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoError.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoError() {
        return tipoError;
    }

    /**
     * Define el valor de la propiedad tipoError.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoError(String value) {
        this.tipoError = value;
    }

    /**
     * Obtiene el valor de la propiedad msgErrorOrcl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgErrorOrcl() {
        return msgErrorOrcl;
    }

    /**
     * Define el valor de la propiedad msgErrorOrcl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgErrorOrcl(String value) {
        this.msgErrorOrcl = value;
    }

    /**
     * Obtiene el valor de la propiedad msgErrorOrcl1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgErrorOrcl1() {
        return msgErrorOrcl1;
    }

    /**
     * Define el valor de la propiedad msgErrorOrcl1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgErrorOrcl1(String value) {
        this.msgErrorOrcl1 = value;
    }

}
