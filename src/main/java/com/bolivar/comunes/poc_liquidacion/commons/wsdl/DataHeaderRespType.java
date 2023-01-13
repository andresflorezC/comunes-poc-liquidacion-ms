
package com.bolivar.comunes.poc_liquidacion.commons.wsdl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DataHeaderRespType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DataHeaderRespType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codRespuesta" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="errores" type="{http://www.segurosbolivar.com/autos/common/dto}ErrorTypeDto" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataHeaderRespType", namespace = "http://www.segurosbolivar.com/autos/common/dto", propOrder = {
    "codRespuesta",
    "errores"
})
public class DataHeaderRespType {

    protected int codRespuesta;
    @XmlElement(nillable = true)
    protected List<ErrorTypeDto> errores;

    /**
     * Obtiene el valor de la propiedad codRespuesta.
     * 
     */
    public int getCodRespuesta() {
        return codRespuesta;
    }

    /**
     * Define el valor de la propiedad codRespuesta.
     * 
     */
    public void setCodRespuesta(int value) {
        this.codRespuesta = value;
    }

    /**
     * Gets the value of the errores property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the errores property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrores().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ErrorTypeDto }
     * 
     * 
     */
    public List<ErrorTypeDto> getErrores() {
        if (errores == null) {
            errores = new ArrayList<ErrorTypeDto>();
        }
        return this.errores;
    }

}
