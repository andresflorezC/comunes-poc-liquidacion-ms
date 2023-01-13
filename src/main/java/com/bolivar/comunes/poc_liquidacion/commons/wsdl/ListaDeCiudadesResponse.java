
package com.bolivar.comunes.poc_liquidacion.commons.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para listaDeCiudadesResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="listaDeCiudadesResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dataHeader" type="{http://www.segurosbolivar.com/autos/common/dto}DataHeaderRespType" minOccurs="0"/&gt;
 *         &lt;element name="Data" type="{http://www.segurosbolivar.com/autos/dto/crea}ListaDeCiudadesOutType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listaDeCiudadesResponse", propOrder = {
    "dataHeader",
    "data"
})
public class ListaDeCiudadesResponse {

    protected DataHeaderRespType dataHeader;
    @XmlElement(name = "Data")
    protected ListaDeCiudadesOutType data;

    /**
     * Obtiene el valor de la propiedad dataHeader.
     * 
     * @return
     *     possible object is
     *     {@link DataHeaderRespType }
     *     
     */
    public DataHeaderRespType getDataHeader() {
        return dataHeader;
    }

    /**
     * Define el valor de la propiedad dataHeader.
     * 
     * @param value
     *     allowed object is
     *     {@link DataHeaderRespType }
     *     
     */
    public void setDataHeader(DataHeaderRespType value) {
        this.dataHeader = value;
    }

    /**
     * Obtiene el valor de la propiedad data.
     * 
     * @return
     *     possible object is
     *     {@link ListaDeCiudadesOutType }
     *     
     */
    public ListaDeCiudadesOutType getData() {
        return data;
    }

    /**
     * Define el valor de la propiedad data.
     * 
     * @param value
     *     allowed object is
     *     {@link ListaDeCiudadesOutType }
     *     
     */
    public void setData(ListaDeCiudadesOutType value) {
        this.data = value;
    }

}
