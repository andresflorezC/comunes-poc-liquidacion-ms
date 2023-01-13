
package com.bolivar.comunes.poc_liquidacion.commons.wsdl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para liquidarPrimaResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="liquidarPrimaResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dataHeader" type="{http://www.segurosbolivar.com/autos/common/dto}DataHeaderRespType" minOccurs="0"/&gt;
 *         &lt;element name="Data" type="{http://www.segurosbolivar.com/autos/dto/crea}ConsultaCotizAutoOutType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "liquidarPrimaResponse", propOrder = {
    "dataHeader",
    "data"
})
public class LiquidarPrimaResponse {

    protected DataHeaderRespType dataHeader;
    @XmlElement(name = "Data")
    protected List<ConsultaCotizAutoOutType> data;

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
     * Gets the value of the data property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the data property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsultaCotizAutoOutType }
     * 
     * 
     */
    public List<ConsultaCotizAutoOutType> getData() {
        if (data == null) {
            data = new ArrayList<ConsultaCotizAutoOutType>();
        }
        return this.data;
    }

}
