
package com.bolivar.comunes.poc_liquidacion.commons.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para listaDeCiudadesRequest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="listaDeCiudadesRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dataHeader" type="{http://www.segurosbolivar.com/autos/common/dto}DataHeaderReqType"/&gt;
 *         &lt;element name="data" type="{http://www.segurosbolivar.com/autos/dto/crea}listaDeCiudadesRequestIn"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listaDeCiudadesRequest", propOrder = {
    "dataHeader",
    "data"
})
public class ListaDeCiudadesRequest {

    @XmlElement(required = true)
    protected DataHeaderReqType dataHeader;
    @XmlElement(required = true)
    protected ListaDeCiudadesRequestIn data;

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
     *     {@link ListaDeCiudadesRequestIn }
     *     
     */
    public ListaDeCiudadesRequestIn getData() {
        return data;
    }

    /**
     * Define el valor de la propiedad data.
     * 
     * @param value
     *     allowed object is
     *     {@link ListaDeCiudadesRequestIn }
     *     
     */
    public void setData(ListaDeCiudadesRequestIn value) {
        this.data = value;
    }

}
