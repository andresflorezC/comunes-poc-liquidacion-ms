
package com.bolivar.comunes.poc_liquidacion.commons.wsdl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ListaDeCiudadesOutType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ListaDeCiudadesOutType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="catalogo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="catalogoDato" type="{http://www.segurosbolivar.com/autos/dto/crea}CatalogoDatoType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListaDeCiudadesOutType", propOrder = {
    "catalogo",
    "catalogoDato"
})
public class ListaDeCiudadesOutType {

    @XmlElement(required = true)
    protected String catalogo;
    protected List<CatalogoDatoType> catalogoDato;

    /**
     * Obtiene el valor de la propiedad catalogo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatalogo() {
        return catalogo;
    }

    /**
     * Define el valor de la propiedad catalogo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatalogo(String value) {
        this.catalogo = value;
    }

    /**
     * Gets the value of the catalogoDato property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the catalogoDato property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCatalogoDato().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CatalogoDatoType }
     * 
     * 
     */
    public List<CatalogoDatoType> getCatalogoDato() {
        if (catalogoDato == null) {
            catalogoDato = new ArrayList<CatalogoDatoType>();
        }
        return this.catalogoDato;
    }

}
