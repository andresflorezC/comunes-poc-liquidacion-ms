
package com.bolivar.comunes.poc_liquidacion.commons.wsdl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CotizacionAutosType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CotizacionAutosType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="claveAsesor" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="numLiquidacion" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="autos" type="{http://www.segurosbolivar.com/autos/dto/crea}RiesgoAutoType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="tomador" type="{http://www.segurosbolivar.com/autos/dto/crea}TomadorType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CotizacionAutosType", propOrder = {
    "claveAsesor",
    "numLiquidacion",
    "autos",
    "tomador"
})
public class CotizacionAutosType {

    @XmlElement(required = true)
    protected String claveAsesor;
    protected Long numLiquidacion;
    @XmlElement(required = true)
    protected List<RiesgoAutoType> autos;
    protected TomadorType tomador;

    /**
     * Obtiene el valor de la propiedad claveAsesor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaveAsesor() {
        return claveAsesor;
    }

    /**
     * Define el valor de la propiedad claveAsesor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaveAsesor(String value) {
        this.claveAsesor = value;
    }

    /**
     * Obtiene el valor de la propiedad numLiquidacion.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumLiquidacion() {
        return numLiquidacion;
    }

    /**
     * Define el valor de la propiedad numLiquidacion.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumLiquidacion(Long value) {
        this.numLiquidacion = value;
    }

    /**
     * Gets the value of the autos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the autos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAutos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RiesgoAutoType }
     * 
     * 
     */
    public List<RiesgoAutoType> getAutos() {
        if (autos == null) {
            autos = new ArrayList<RiesgoAutoType>();
        }
        return this.autos;
    }

    /**
     * Obtiene el valor de la propiedad tomador.
     * 
     * @return
     *     possible object is
     *     {@link TomadorType }
     *     
     */
    public TomadorType getTomador() {
        return tomador;
    }

    /**
     * Define el valor de la propiedad tomador.
     * 
     * @param value
     *     allowed object is
     *     {@link TomadorType }
     *     
     */
    public void setTomador(TomadorType value) {
        this.tomador = value;
    }

}
