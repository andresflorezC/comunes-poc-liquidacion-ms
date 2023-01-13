
package com.bolivar.comunes.poc_liquidacion.commons.wsdl;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para crearCotizacionRequestIn complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="crearCotizacionRequestIn"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="placaVeh" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipoDocTom" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="numDocTom" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="nomTomador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="apeTomador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mailTomador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="celTomador" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="telTomador" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="dirTomador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ciuTomador" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="nomConductor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sexoConductor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fecNacConductor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="marcaVeh" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="modeloVeh" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="claveAsesor" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="sumaAsegurada" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="sumaAccesorios" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="ciudadMovilizacion" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="ceroKm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="opcionAutos" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="opcionPa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="opcionAsis" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="periodoFacturacion" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="secuencia" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "crearCotizacionRequestIn", propOrder = {
    "placaVeh",
    "tipoDocTom",
    "numDocTom",
    "nomTomador",
    "apeTomador",
    "mailTomador",
    "celTomador",
    "telTomador",
    "dirTomador",
    "ciuTomador",
    "nomConductor",
    "sexoConductor",
    "fecNacConductor",
    "marcaVeh",
    "modeloVeh",
    "claveAsesor",
    "sumaAsegurada",
    "sumaAccesorios",
    "ciudadMovilizacion",
    "ceroKm",
    "opcionAutos",
    "opcionPa",
    "opcionAsis",
    "periodoFacturacion",
    "secuencia"
})
public class CrearCotizacionRequestIn {

    protected String placaVeh;
    @XmlElement(required = true)
    protected String tipoDocTom;
    @XmlElement(required = true)
    protected BigDecimal numDocTom;
    protected String nomTomador;
    protected String apeTomador;
    protected String mailTomador;
    protected Long celTomador;
    protected Long telTomador;
    protected String dirTomador;
    protected Long ciuTomador;
    protected String nomConductor;
    protected String sexoConductor;
    protected String fecNacConductor;
    @XmlElement(required = true)
    protected String marcaVeh;
    protected long modeloVeh;
    protected BigDecimal claveAsesor;
    @XmlElement(required = true)
    protected BigDecimal sumaAsegurada;
    @XmlElement(required = true)
    protected BigDecimal sumaAccesorios;
    @XmlElement(required = true)
    protected BigDecimal ciudadMovilizacion;
    protected String ceroKm;
    protected BigDecimal opcionAutos;
    protected String opcionPa;
    protected BigDecimal opcionAsis;
    protected Long periodoFacturacion;
    protected Long secuencia;

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
     * Obtiene el valor de la propiedad tipoDocTom.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDocTom() {
        return tipoDocTom;
    }

    /**
     * Define el valor de la propiedad tipoDocTom.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDocTom(String value) {
        this.tipoDocTom = value;
    }

    /**
     * Obtiene el valor de la propiedad numDocTom.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNumDocTom() {
        return numDocTom;
    }

    /**
     * Define el valor de la propiedad numDocTom.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNumDocTom(BigDecimal value) {
        this.numDocTom = value;
    }

    /**
     * Obtiene el valor de la propiedad nomTomador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomTomador() {
        return nomTomador;
    }

    /**
     * Define el valor de la propiedad nomTomador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomTomador(String value) {
        this.nomTomador = value;
    }

    /**
     * Obtiene el valor de la propiedad apeTomador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApeTomador() {
        return apeTomador;
    }

    /**
     * Define el valor de la propiedad apeTomador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApeTomador(String value) {
        this.apeTomador = value;
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
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCelTomador() {
        return celTomador;
    }

    /**
     * Define el valor de la propiedad celTomador.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCelTomador(Long value) {
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
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCiuTomador() {
        return ciuTomador;
    }

    /**
     * Define el valor de la propiedad ciuTomador.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCiuTomador(Long value) {
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
     * Obtiene el valor de la propiedad marcaVeh.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarcaVeh() {
        return marcaVeh;
    }

    /**
     * Define el valor de la propiedad marcaVeh.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarcaVeh(String value) {
        this.marcaVeh = value;
    }

    /**
     * Obtiene el valor de la propiedad modeloVeh.
     * 
     */
    public long getModeloVeh() {
        return modeloVeh;
    }

    /**
     * Define el valor de la propiedad modeloVeh.
     * 
     */
    public void setModeloVeh(long value) {
        this.modeloVeh = value;
    }

    /**
     * Obtiene el valor de la propiedad claveAsesor.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getClaveAsesor() {
        return claveAsesor;
    }

    /**
     * Define el valor de la propiedad claveAsesor.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setClaveAsesor(BigDecimal value) {
        this.claveAsesor = value;
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
     * Obtiene el valor de la propiedad ciudadMovilizacion.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCiudadMovilizacion() {
        return ciudadMovilizacion;
    }

    /**
     * Define el valor de la propiedad ciudadMovilizacion.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCiudadMovilizacion(BigDecimal value) {
        this.ciudadMovilizacion = value;
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
     * Obtiene el valor de la propiedad opcionAutos.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOpcionAutos() {
        return opcionAutos;
    }

    /**
     * Define el valor de la propiedad opcionAutos.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOpcionAutos(BigDecimal value) {
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
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOpcionAsis() {
        return opcionAsis;
    }

    /**
     * Define el valor de la propiedad opcionAsis.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOpcionAsis(BigDecimal value) {
        this.opcionAsis = value;
    }

    /**
     * Obtiene el valor de la propiedad periodoFacturacion.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPeriodoFacturacion() {
        return periodoFacturacion;
    }

    /**
     * Define el valor de la propiedad periodoFacturacion.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPeriodoFacturacion(Long value) {
        this.periodoFacturacion = value;
    }

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

}
