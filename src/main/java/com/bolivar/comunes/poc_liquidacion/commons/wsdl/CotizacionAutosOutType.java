
package com.bolivar.comunes.poc_liquidacion.commons.wsdl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CotizacionAutosOutType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CotizacionAutosOutType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="secuencia" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="numCotizacion" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="prima" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="impuestoPrima" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="totalPrima" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="coberturasCotizacion" type="{http://www.segurosbolivar.com/autos/dto/crea}CoberturasCotizacionOutType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="reqInspeccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="opcionAutosDescripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="deducibleEnRCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="deduciblePeridaParcial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="deduciblePeridaTotal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="deducibleEnHurto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CotizacionAutosOutType", propOrder = {
    "secuencia",
    "numCotizacion",
    "prima",
    "impuestoPrima",
    "totalPrima",
    "coberturasCotizacion",
    "reqInspeccion",
    "opcionAutosDescripcion",
    "deducibleEnRCE",
    "deduciblePeridaParcial",
    "deduciblePeridaTotal",
    "deducibleEnHurto"
})
public class CotizacionAutosOutType {

    protected Long secuencia;
    protected long numCotizacion;
    @XmlElement(required = true)
    protected BigDecimal prima;
    @XmlElement(required = true)
    protected BigDecimal impuestoPrima;
    @XmlElement(required = true)
    protected BigDecimal totalPrima;
    @XmlElement(required = true)
    protected List<CoberturasCotizacionOutType> coberturasCotizacion;
    protected String reqInspeccion;
    protected String opcionAutosDescripcion;
    protected String deducibleEnRCE;
    protected String deduciblePeridaParcial;
    protected String deduciblePeridaTotal;
    protected String deducibleEnHurto;

    /**
     * Obtiene el valor de la propiedad secuencia.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSecuencia() {
        return secuencia;
    }

    /**
     * Define el valor de la propiedad secuencia.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSecuencia(Long value) {
        this.secuencia = value;
    }

    /**
     * Obtiene el valor de la propiedad numCotizacion.
     * 
     */
    public long getNumCotizacion() {
        return numCotizacion;
    }

    /**
     * Define el valor de la propiedad numCotizacion.
     * 
     */
    public void setNumCotizacion(long value) {
        this.numCotizacion = value;
    }

    /**
     * Obtiene el valor de la propiedad prima.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrima() {
        return prima;
    }

    /**
     * Define el valor de la propiedad prima.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrima(BigDecimal value) {
        this.prima = value;
    }

    /**
     * Obtiene el valor de la propiedad impuestoPrima.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getImpuestoPrima() {
        return impuestoPrima;
    }

    /**
     * Define el valor de la propiedad impuestoPrima.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setImpuestoPrima(BigDecimal value) {
        this.impuestoPrima = value;
    }

    /**
     * Obtiene el valor de la propiedad totalPrima.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalPrima() {
        return totalPrima;
    }

    /**
     * Define el valor de la propiedad totalPrima.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalPrima(BigDecimal value) {
        this.totalPrima = value;
    }

    /**
     * Gets the value of the coberturasCotizacion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coberturasCotizacion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCoberturasCotizacion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CoberturasCotizacionOutType }
     * 
     * 
     */
    public List<CoberturasCotizacionOutType> getCoberturasCotizacion() {
        if (coberturasCotizacion == null) {
            coberturasCotizacion = new ArrayList<CoberturasCotizacionOutType>();
        }
        return this.coberturasCotizacion;
    }

    /**
     * Obtiene el valor de la propiedad reqInspeccion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReqInspeccion() {
        return reqInspeccion;
    }

    /**
     * Define el valor de la propiedad reqInspeccion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReqInspeccion(String value) {
        this.reqInspeccion = value;
    }

    /**
     * Obtiene el valor de la propiedad opcionAutosDescripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpcionAutosDescripcion() {
        return opcionAutosDescripcion;
    }

    /**
     * Define el valor de la propiedad opcionAutosDescripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpcionAutosDescripcion(String value) {
        this.opcionAutosDescripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad deducibleEnRCE.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeducibleEnRCE() {
        return deducibleEnRCE;
    }

    /**
     * Define el valor de la propiedad deducibleEnRCE.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeducibleEnRCE(String value) {
        this.deducibleEnRCE = value;
    }

    /**
     * Obtiene el valor de la propiedad deduciblePeridaParcial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeduciblePeridaParcial() {
        return deduciblePeridaParcial;
    }

    /**
     * Define el valor de la propiedad deduciblePeridaParcial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeduciblePeridaParcial(String value) {
        this.deduciblePeridaParcial = value;
    }

    /**
     * Obtiene el valor de la propiedad deduciblePeridaTotal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeduciblePeridaTotal() {
        return deduciblePeridaTotal;
    }

    /**
     * Define el valor de la propiedad deduciblePeridaTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeduciblePeridaTotal(String value) {
        this.deduciblePeridaTotal = value;
    }

    /**
     * Obtiene el valor de la propiedad deducibleEnHurto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeducibleEnHurto() {
        return deducibleEnHurto;
    }

    /**
     * Define el valor de la propiedad deducibleEnHurto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeducibleEnHurto(String value) {
        this.deducibleEnHurto = value;
    }

}
