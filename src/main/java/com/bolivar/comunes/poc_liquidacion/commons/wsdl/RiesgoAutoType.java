
package com.bolivar.comunes.poc_liquidacion.commons.wsdl;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RiesgoAutoType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RiesgoAutoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codRiesgo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="placa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="marca" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="modelo" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="sumaAsegurada" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="sumaAccesorios" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="localidadMovilizacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ceroKm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reqInspeccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="opcionAutos" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="opcionPa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="opcionAsis" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="primaAsisBa" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RiesgoAutoType", propOrder = {
    "codRiesgo",
    "placa",
    "marca",
    "modelo",
    "sumaAsegurada",
    "sumaAccesorios",
    "localidadMovilizacion",
    "ceroKm",
    "reqInspeccion",
    "opcionAutos",
    "opcionPa",
    "opcionAsis",
    "primaAsisBa"
})
public class RiesgoAutoType {

    protected int codRiesgo;
    protected String placa;
    @XmlElement(required = true)
    protected String marca;
    protected long modelo;
    @XmlElement(required = true)
    protected BigDecimal sumaAsegurada;
    @XmlElement(required = true)
    protected BigDecimal sumaAccesorios;
    @XmlElement(required = true)
    protected String localidadMovilizacion;
    protected String ceroKm;
    protected String reqInspeccion;
    protected Integer opcionAutos;
    protected String opcionPa;
    protected Integer opcionAsis;
    protected Integer primaAsisBa;

    /**
     * Obtiene el valor de la propiedad codRiesgo.
     * 
     */
    public int getCodRiesgo() {
        return codRiesgo;
    }

    /**
     * Define el valor de la propiedad codRiesgo.
     * 
     */
    public void setCodRiesgo(int value) {
        this.codRiesgo = value;
    }

    /**
     * Obtiene el valor de la propiedad placa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * Define el valor de la propiedad placa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaca(String value) {
        this.placa = value;
    }

    /**
     * Obtiene el valor de la propiedad marca.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Define el valor de la propiedad marca.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarca(String value) {
        this.marca = value;
    }

    /**
     * Obtiene el valor de la propiedad modelo.
     * 
     */
    public long getModelo() {
        return modelo;
    }

    /**
     * Define el valor de la propiedad modelo.
     * 
     */
    public void setModelo(long value) {
        this.modelo = value;
    }

    /**
     * Obtiene el valor de la propiedad sumaAsegurada.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSumaAsegurada() {
        return sumaAsegurada;
    }

    /**
     * Define el valor de la propiedad sumaAsegurada.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSumaAsegurada(BigDecimal value) {
        this.sumaAsegurada = value;
    }

    /**
     * Obtiene el valor de la propiedad sumaAccesorios.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSumaAccesorios() {
        return sumaAccesorios;
    }

    /**
     * Define el valor de la propiedad sumaAccesorios.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSumaAccesorios(BigDecimal value) {
        this.sumaAccesorios = value;
    }

    /**
     * Obtiene el valor de la propiedad localidadMovilizacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalidadMovilizacion() {
        return localidadMovilizacion;
    }

    /**
     * Define el valor de la propiedad localidadMovilizacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalidadMovilizacion(String value) {
        this.localidadMovilizacion = value;
    }

    /**
     * Obtiene el valor de la propiedad ceroKm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCeroKm() {
        return ceroKm;
    }

    /**
     * Define el valor de la propiedad ceroKm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCeroKm(String value) {
        this.ceroKm = value;
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
     * Obtiene el valor de la propiedad opcionAutos.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOpcionAutos() {
        return opcionAutos;
    }

    /**
     * Define el valor de la propiedad opcionAutos.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOpcionAutos(Integer value) {
        this.opcionAutos = value;
    }

    /**
     * Obtiene el valor de la propiedad opcionPa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpcionPa() {
        return opcionPa;
    }

    /**
     * Define el valor de la propiedad opcionPa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpcionPa(String value) {
        this.opcionPa = value;
    }

    /**
     * Obtiene el valor de la propiedad opcionAsis.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOpcionAsis() {
        return opcionAsis;
    }

    /**
     * Define el valor de la propiedad opcionAsis.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOpcionAsis(Integer value) {
        this.opcionAsis = value;
    }

    /**
     * Obtiene el valor de la propiedad primaAsisBa.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPrimaAsisBa() {
        return primaAsisBa;
    }

    /**
     * Define el valor de la propiedad primaAsisBa.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPrimaAsisBa(Integer value) {
        this.primaAsisBa = value;
    }

}
