
package com.bolivar.comunes.poc_liquidacion.commons.wsdl;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DataHeaderReqType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DataHeaderReqType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="modulo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="proceso" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="subProceso" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="codCia" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="codSecc" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="codProducto" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="subProducto" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="codigoUsuario" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="agenciaUsuario" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="entidadColocadora" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="canal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="sistemaOrigen" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="paisISO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pais" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="sessionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="direccionIp" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="versionServicio" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="info1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="info2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="info3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="info4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="info5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataHeaderReqType", namespace = "http://www.segurosbolivar.com/autos/common/dto", propOrder = {
    "modulo",
    "proceso",
    "subProceso",
    "codCia",
    "codSecc",
    "codProducto",
    "subProducto",
    "codigoUsuario",
    "agenciaUsuario",
    "entidadColocadora",
    "canal",
    "sistemaOrigen",
    "paisISO",
    "pais",
    "sessionId",
    "direccionIp",
    "versionServicio",
    "info1",
    "info2",
    "info3",
    "info4",
    "info5"
})
public class DataHeaderReqType {

    @XmlElement(required = true)
    protected String modulo;
    @XmlElement(required = true)
    protected BigDecimal proceso;
    @XmlElement(required = true)
    protected BigDecimal subProceso;
    @XmlElement(required = true)
    protected BigDecimal codCia;
    @XmlElement(required = true)
    protected BigDecimal codSecc;
    @XmlElement(required = true)
    protected BigDecimal codProducto;
    protected BigDecimal subProducto;
    @XmlElement(required = true)
    protected String codigoUsuario;
    protected BigDecimal agenciaUsuario;
    @XmlElement(required = true)
    protected BigDecimal entidadColocadora;
    protected BigDecimal canal;
    @XmlElement(required = true)
    protected BigDecimal sistemaOrigen;
    protected String paisISO;
    @XmlElement(required = true)
    protected BigDecimal pais;
    protected String sessionId;
    @XmlElement(required = true)
    protected String direccionIp;
    @XmlElement(required = true, defaultValue = "1.0")
    protected BigDecimal versionServicio;
    protected String info1;
    protected String info2;
    protected String info3;
    protected String info4;
    protected String info5;

    /**
     * Obtiene el valor de la propiedad modulo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModulo() {
        return modulo;
    }

    /**
     * Define el valor de la propiedad modulo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModulo(String value) {
        this.modulo = value;
    }

    /**
     * Obtiene el valor de la propiedad proceso.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getProceso() {
        return proceso;
    }

    /**
     * Define el valor de la propiedad proceso.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setProceso(BigDecimal value) {
        this.proceso = value;
    }

    /**
     * Obtiene el valor de la propiedad subProceso.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSubProceso() {
        return subProceso;
    }

    /**
     * Define el valor de la propiedad subProceso.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSubProceso(BigDecimal value) {
        this.subProceso = value;
    }

    /**
     * Obtiene el valor de la propiedad codCia.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCodCia() {
        return codCia;
    }

    /**
     * Define el valor de la propiedad codCia.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCodCia(BigDecimal value) {
        this.codCia = value;
    }

    /**
     * Obtiene el valor de la propiedad codSecc.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCodSecc() {
        return codSecc;
    }

    /**
     * Define el valor de la propiedad codSecc.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCodSecc(BigDecimal value) {
        this.codSecc = value;
    }

    /**
     * Obtiene el valor de la propiedad codProducto.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCodProducto() {
        return codProducto;
    }

    /**
     * Define el valor de la propiedad codProducto.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCodProducto(BigDecimal value) {
        this.codProducto = value;
    }

    /**
     * Obtiene el valor de la propiedad subProducto.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSubProducto() {
        return subProducto;
    }

    /**
     * Define el valor de la propiedad subProducto.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSubProducto(BigDecimal value) {
        this.subProducto = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoUsuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoUsuario() {
        return codigoUsuario;
    }

    /**
     * Define el valor de la propiedad codigoUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoUsuario(String value) {
        this.codigoUsuario = value;
    }

    /**
     * Obtiene el valor de la propiedad agenciaUsuario.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAgenciaUsuario() {
        return agenciaUsuario;
    }

    /**
     * Define el valor de la propiedad agenciaUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAgenciaUsuario(BigDecimal value) {
        this.agenciaUsuario = value;
    }

    /**
     * Obtiene el valor de la propiedad entidadColocadora.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEntidadColocadora() {
        return entidadColocadora;
    }

    /**
     * Define el valor de la propiedad entidadColocadora.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEntidadColocadora(BigDecimal value) {
        this.entidadColocadora = value;
    }

    /**
     * Obtiene el valor de la propiedad canal.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCanal() {
        return canal;
    }

    /**
     * Define el valor de la propiedad canal.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCanal(BigDecimal value) {
        this.canal = value;
    }

    /**
     * Obtiene el valor de la propiedad sistemaOrigen.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSistemaOrigen() {
        return sistemaOrigen;
    }

    /**
     * Define el valor de la propiedad sistemaOrigen.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSistemaOrigen(BigDecimal value) {
        this.sistemaOrigen = value;
    }

    /**
     * Obtiene el valor de la propiedad paisISO.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaisISO() {
        return paisISO;
    }

    /**
     * Define el valor de la propiedad paisISO.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaisISO(String value) {
        this.paisISO = value;
    }

    /**
     * Obtiene el valor de la propiedad pais.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPais() {
        return pais;
    }

    /**
     * Define el valor de la propiedad pais.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPais(BigDecimal value) {
        this.pais = value;
    }

    /**
     * Obtiene el valor de la propiedad sessionId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * Define el valor de la propiedad sessionId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionId(String value) {
        this.sessionId = value;
    }

    /**
     * Obtiene el valor de la propiedad direccionIp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDireccionIp() {
        return direccionIp;
    }

    /**
     * Define el valor de la propiedad direccionIp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDireccionIp(String value) {
        this.direccionIp = value;
    }

    /**
     * Obtiene el valor de la propiedad versionServicio.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVersionServicio() {
        return versionServicio;
    }

    /**
     * Define el valor de la propiedad versionServicio.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVersionServicio(BigDecimal value) {
        this.versionServicio = value;
    }

    /**
     * Obtiene el valor de la propiedad info1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfo1() {
        return info1;
    }

    /**
     * Define el valor de la propiedad info1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfo1(String value) {
        this.info1 = value;
    }

    /**
     * Obtiene el valor de la propiedad info2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfo2() {
        return info2;
    }

    /**
     * Define el valor de la propiedad info2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfo2(String value) {
        this.info2 = value;
    }

    /**
     * Obtiene el valor de la propiedad info3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfo3() {
        return info3;
    }

    /**
     * Define el valor de la propiedad info3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfo3(String value) {
        this.info3 = value;
    }

    /**
     * Obtiene el valor de la propiedad info4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfo4() {
        return info4;
    }

    /**
     * Define el valor de la propiedad info4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfo4(String value) {
        this.info4 = value;
    }

    /**
     * Obtiene el valor de la propiedad info5.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfo5() {
        return info5;
    }

    /**
     * Define el valor de la propiedad info5.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfo5(String value) {
        this.info5 = value;
    }

}
