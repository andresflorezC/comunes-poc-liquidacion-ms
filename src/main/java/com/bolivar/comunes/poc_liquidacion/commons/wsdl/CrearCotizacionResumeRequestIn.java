
package com.bolivar.comunes.poc_liquidacion.commons.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para crearCotizacionResumeRequestIn complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="crearCotizacionResumeRequestIn"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="placaVeh" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="mailTomador" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="celTomador" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="telTomador" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="dirTomador" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ciuTomador" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="nomConductor" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sexoConductor" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fecNacConductor" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="secuencia" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "crearCotizacionResumeRequestIn", propOrder = {
    "placaVeh",
    "mailTomador",
    "celTomador",
    "telTomador",
    "dirTomador",
    "ciuTomador",
    "nomConductor",
    "sexoConductor",
    "fecNacConductor",
    "secuencia"
})
public class CrearCotizacionResumeRequestIn {

    @XmlElement(required = true)
    protected String placaVeh;
    @XmlElement(required = true)
    protected String mailTomador;
    protected long celTomador;
    protected Long telTomador;
    @XmlElement(required = true)
    protected String dirTomador;
    protected long ciuTomador;
    @XmlElement(required = true)
    protected String nomConductor;
    @XmlElement(required = true)
    protected String sexoConductor;
    @XmlElement(required = true)
    protected String fecNacConductor;
    protected long secuencia;

    /**
     * Obtiene el valor de la propiedad placaVeh.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlacaVeh() {
        return placaVeh;
    }

    /**
     * Define el valor de la propiedad placaVeh.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlacaVeh(String value) {
        this.placaVeh = value;
    }

    /**
     * Obtiene el valor de la propiedad mailTomador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailTomador() {
        return mailTomador;
    }

    /**
     * Define el valor de la propiedad mailTomador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailTomador(String value) {
        this.mailTomador = value;
    }

    /**
     * Obtiene el valor de la propiedad celTomador.
     * 
     */
    public long getCelTomador() {
        return celTomador;
    }

    /**
     * Define el valor de la propiedad celTomador.
     * 
     */
    public void setCelTomador(long value) {
        this.celTomador = value;
    }

    /**
     * Obtiene el valor de la propiedad telTomador.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTelTomador() {
        return telTomador;
    }

    /**
     * Define el valor de la propiedad telTomador.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTelTomador(Long value) {
        this.telTomador = value;
    }

    /**
     * Obtiene el valor de la propiedad dirTomador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirTomador() {
        return dirTomador;
    }

    /**
     * Define el valor de la propiedad dirTomador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirTomador(String value) {
        this.dirTomador = value;
    }

    /**
     * Obtiene el valor de la propiedad ciuTomador.
     * 
     */
    public long getCiuTomador() {
        return ciuTomador;
    }

    /**
     * Define el valor de la propiedad ciuTomador.
     * 
     */
    public void setCiuTomador(long value) {
        this.ciuTomador = value;
    }

    /**
     * Obtiene el valor de la propiedad nomConductor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomConductor() {
        return nomConductor;
    }

    /**
     * Define el valor de la propiedad nomConductor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomConductor(String value) {
        this.nomConductor = value;
    }

    /**
     * Obtiene el valor de la propiedad sexoConductor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSexoConductor() {
        return sexoConductor;
    }

    /**
     * Define el valor de la propiedad sexoConductor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSexoConductor(String value) {
        this.sexoConductor = value;
    }

    /**
     * Obtiene el valor de la propiedad fecNacConductor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFecNacConductor() {
        return fecNacConductor;
    }

    /**
     * Define el valor de la propiedad fecNacConductor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFecNacConductor(String value) {
        this.fecNacConductor = value;
    }

    /**
     * Obtiene el valor de la propiedad secuencia.
     * 
     */
    public long getSecuencia() {
        return secuencia;
    }

    /**
     * Define el valor de la propiedad secuencia.
     * 
     */
    public void setSecuencia(long value) {
        this.secuencia = value;
    }

}
