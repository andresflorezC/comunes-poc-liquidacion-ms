
package com.bolivar.comunes.poc_liquidacion.commons.wsdl;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para liquidarPrimaIn complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="liquidarPrimaIn"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="placaVeh" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipoDocTom" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="numDocTom" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="nomTomador" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="apeTomador" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fechaNacimiento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sexo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="marcaVeh" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="modeloVeh" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="claveAsesor" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="sumaAccesorios" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ciudadMovilizacion" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="ceroKm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="opcionPa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="opcionAsis" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="valorAsegurado" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="licitacion" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "liquidarPrimaIn", propOrder = {
    "placaVeh",
    "tipoDocTom",
    "numDocTom",
    "nomTomador",
    "apeTomador",
    "fechaNacimiento",
    "sexo",
    "marcaVeh",
    "modeloVeh",
    "claveAsesor",
    "sumaAccesorios",
    "ciudadMovilizacion",
    "ceroKm",
    "opcionPa",
    "opcionAsis",
    "valorAsegurado",
    "licitacion"
})
public class LiquidarPrimaIn {

    protected String placaVeh;
    @XmlElement(required = true)
    protected String tipoDocTom;
    @XmlElement(required = true)
    protected String numDocTom;
    @XmlElement(required = true)
    protected String nomTomador;
    @XmlElement(required = true)
    protected String apeTomador;
    @XmlElement(required = true)
    protected String fechaNacimiento;
    @XmlElement(required = true)
    protected String sexo;
    protected String marcaVeh;
    @XmlElement(required = true)
    protected String modeloVeh;
    protected BigDecimal claveAsesor;
    protected String sumaAccesorios;
    protected BigDecimal ciudadMovilizacion;
    protected String ceroKm;
    protected String opcionPa;
    protected Integer opcionAsis;
    protected BigDecimal valorAsegurado;
    protected BigDecimal licitacion;

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
     *     {@link String }
     *     
     */
    public String getNumDocTom() {
        return numDocTom;
    }

    /**
     * Define el valor de la propiedad numDocTom.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumDocTom(String value) {
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
     * Obtiene el valor de la propiedad fechaNacimiento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Define el valor de la propiedad fechaNacimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaNacimiento(String value) {
        this.fechaNacimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad sexo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * Define el valor de la propiedad sexo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSexo(String value) {
        this.sexo = value;
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
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModeloVeh() {
        return modeloVeh;
    }

    /**
     * Define el valor de la propiedad modeloVeh.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModeloVeh(String value) {
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
     * Obtiene el valor de la propiedad sumaAccesorios.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSumaAccesorios() {
        return sumaAccesorios;
    }

    /**
     * Define el valor de la propiedad sumaAccesorios.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSumaAccesorios(String value) {
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
     * Obtiene el valor de la propiedad valorAsegurado.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorAsegurado() {
        return valorAsegurado;
    }

    /**
     * Define el valor de la propiedad valorAsegurado.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorAsegurado(BigDecimal value) {
        this.valorAsegurado = value;
    }

    /**
     * Obtiene el valor de la propiedad licitacion.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLicitacion() {
        return licitacion;
    }

    /**
     * Define el valor de la propiedad licitacion.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLicitacion(BigDecimal value) {
        this.licitacion = value;
    }

}
