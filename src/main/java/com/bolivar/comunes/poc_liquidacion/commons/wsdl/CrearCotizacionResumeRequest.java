
package com.bolivar.comunes.poc_liquidacion.commons.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para crearCotizacionResumeRequest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="crearCotizacionResumeRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dataHeader" type="{http://www.segurosbolivar.com/autos/common/dto}DataHeaderReqType"/&gt;
 *         &lt;element name="data" type="{http://www.segurosbolivar.com/autos/dto/crea}crearCotizacionResumeRequestIn"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "crearCotizacionResumeRequest", propOrder = {
    "dataHeader",
    "data"
})
public class CrearCotizacionResumeRequest {

    @XmlElement(required = true)
    protected DataHeaderReqType dataHeader;
    @XmlElement(required = true)
    protected CrearCotizacionResumeRequestIn data;

    /**
     * Obtiene el valor de la propiedad dataHeader.
     * 
     * @return
     *     possible object is
     *     {@link DataHeaderReqType }
     *     
     */
    public DataHeaderReqType getDataHeader() {
        return dataHeader;
    }

    /**
     * Define el valor de la propiedad dataHeader.
     * 
     * @param value
     *     allowed object is
     *     {@link DataHeaderReqType }
     *     
     */
    public void setDataHeader(DataHeaderReqType value) {
        this.dataHeader = value;
    }

    /**
     * Obtiene el valor de la propiedad data.
     * 
     * @return
     *     possible object is
     *     {@link CrearCotizacionResumeRequestIn }
     *     
     */
    public CrearCotizacionResumeRequestIn getData() {
        return data;
    }

    /**
     * Define el valor de la propiedad data.
     * 
     * @param value
     *     allowed object is
     *     {@link CrearCotizacionResumeRequestIn }
     *     
     */
    public void setData(CrearCotizacionResumeRequestIn value) {
        this.data = value;
    }

}
