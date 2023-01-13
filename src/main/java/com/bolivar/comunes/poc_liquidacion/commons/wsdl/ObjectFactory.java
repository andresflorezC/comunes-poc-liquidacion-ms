
package com.bolivar.comunes.poc_liquidacion.commons.wsdl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bolivar.comunes.poc_liquidacion.commons.wsdl package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _LiquidarPrimaRequest_QNAME = new QName("http://www.segurosbolivar.com/autos/dto/crea", "liquidarPrimaRequest");
    private final static QName _LiquidarPrimaResponse_QNAME = new QName("http://www.segurosbolivar.com/autos/dto/crea", "liquidarPrimaResponse");
    private final static QName _CrearCotizacionRequest_QNAME = new QName("http://www.segurosbolivar.com/autos/dto/crea", "crearCotizacionRequest");
    private final static QName _CrearCotizacionResponse_QNAME = new QName("http://www.segurosbolivar.com/autos/dto/crea", "crearCotizacionResponse");
    private final static QName _ListaDeCiudadesRequest_QNAME = new QName("http://www.segurosbolivar.com/autos/dto/crea", "listaDeCiudadesRequest");
    private final static QName _ListaDeCiudadesResponse_QNAME = new QName("http://www.segurosbolivar.com/autos/dto/crea", "listaDeCiudadesResponse");
    private final static QName _CrearCotizacionResumeRequest_QNAME = new QName("http://www.segurosbolivar.com/autos/dto/crea", "crearCotizacionResumeRequest");
    private final static QName _CrearCotizacionResumeResponse_QNAME = new QName("http://www.segurosbolivar.com/autos/dto/crea", "crearCotizacionResumeResponse");
    private final static QName _AutosFault_QNAME = new QName("http://www.segurosbolivar.com/autos/dto/crea", "AutosFault");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bolivar.comunes.poc_liquidacion.commons.wsdl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LiquidarPrimaRequest }
     * 
     */
    public LiquidarPrimaRequest createLiquidarPrimaRequest() {
        return new LiquidarPrimaRequest();
    }

    /**
     * Create an instance of {@link LiquidarPrimaResponse }
     * 
     */
    public LiquidarPrimaResponse createLiquidarPrimaResponse() {
        return new LiquidarPrimaResponse();
    }

    /**
     * Create an instance of {@link CrearCotizacionRequest }
     * 
     */
    public CrearCotizacionRequest createCrearCotizacionRequest() {
        return new CrearCotizacionRequest();
    }

    /**
     * Create an instance of {@link CrearCotizacionResponse }
     * 
     */
    public CrearCotizacionResponse createCrearCotizacionResponse() {
        return new CrearCotizacionResponse();
    }

    /**
     * Create an instance of {@link ListaDeCiudadesRequest }
     * 
     */
    public ListaDeCiudadesRequest createListaDeCiudadesRequest() {
        return new ListaDeCiudadesRequest();
    }

    /**
     * Create an instance of {@link ListaDeCiudadesResponse }
     * 
     */
    public ListaDeCiudadesResponse createListaDeCiudadesResponse() {
        return new ListaDeCiudadesResponse();
    }

    /**
     * Create an instance of {@link CrearCotizacionResumeRequest }
     * 
     */
    public CrearCotizacionResumeRequest createCrearCotizacionResumeRequest() {
        return new CrearCotizacionResumeRequest();
    }

    /**
     * Create an instance of {@link CrearCotizacionResumeResponse }
     * 
     */
    public CrearCotizacionResumeResponse createCrearCotizacionResumeResponse() {
        return new CrearCotizacionResumeResponse();
    }

    /**
     * Create an instance of {@link AutosFaultType }
     * 
     */
    public AutosFaultType createAutosFaultType() {
        return new AutosFaultType();
    }

    /**
     * Create an instance of {@link LiquidarPrimaIn }
     * 
     */
    public LiquidarPrimaIn createLiquidarPrimaIn() {
        return new LiquidarPrimaIn();
    }

    /**
     * Create an instance of {@link ConsultaCotizAutoOutType }
     * 
     */
    public ConsultaCotizAutoOutType createConsultaCotizAutoOutType() {
        return new ConsultaCotizAutoOutType();
    }

    /**
     * Create an instance of {@link CotizacionAutosType }
     * 
     */
    public CotizacionAutosType createCotizacionAutosType() {
        return new CotizacionAutosType();
    }

    /**
     * Create an instance of {@link RiesgoAutoType }
     * 
     */
    public RiesgoAutoType createRiesgoAutoType() {
        return new RiesgoAutoType();
    }

    /**
     * Create an instance of {@link TomadorType }
     * 
     */
    public TomadorType createTomadorType() {
        return new TomadorType();
    }

    /**
     * Create an instance of {@link CrearCotizacionRequestIn }
     * 
     */
    public CrearCotizacionRequestIn createCrearCotizacionRequestIn() {
        return new CrearCotizacionRequestIn();
    }

    /**
     * Create an instance of {@link CotizacionAutosOutType }
     * 
     */
    public CotizacionAutosOutType createCotizacionAutosOutType() {
        return new CotizacionAutosOutType();
    }

    /**
     * Create an instance of {@link CoberturasCotizacionOutType }
     * 
     */
    public CoberturasCotizacionOutType createCoberturasCotizacionOutType() {
        return new CoberturasCotizacionOutType();
    }

    /**
     * Create an instance of {@link ListaDeCiudadesRequestIn }
     * 
     */
    public ListaDeCiudadesRequestIn createListaDeCiudadesRequestIn() {
        return new ListaDeCiudadesRequestIn();
    }

    /**
     * Create an instance of {@link ListaDeCiudadesOutType }
     * 
     */
    public ListaDeCiudadesOutType createListaDeCiudadesOutType() {
        return new ListaDeCiudadesOutType();
    }

    /**
     * Create an instance of {@link CatalogoDatoType }
     * 
     */
    public CatalogoDatoType createCatalogoDatoType() {
        return new CatalogoDatoType();
    }

    /**
     * Create an instance of {@link CrearCotizacionResumeRequestIn }
     * 
     */
    public CrearCotizacionResumeRequestIn createCrearCotizacionResumeRequestIn() {
        return new CrearCotizacionResumeRequestIn();
    }

    /**
     * Create an instance of {@link DataHeaderReqType }
     * 
     */
    public DataHeaderReqType createDataHeaderReqType() {
        return new DataHeaderReqType();
    }

    /**
     * Create an instance of {@link ErrorTypeDto }
     * 
     */
    public ErrorTypeDto createErrorTypeDto() {
        return new ErrorTypeDto();
    }

    /**
     * Create an instance of {@link DataHeaderRespType }
     * 
     */
    public DataHeaderRespType createDataHeaderRespType() {
        return new DataHeaderRespType();
    }

    /**
     * Create an instance of {@link LookupTypeDto }
     * 
     */
    public LookupTypeDto createLookupTypeDto() {
        return new LookupTypeDto();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LiquidarPrimaRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LiquidarPrimaRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.segurosbolivar.com/autos/dto/crea", name = "liquidarPrimaRequest")
    public JAXBElement<LiquidarPrimaRequest> createLiquidarPrimaRequest(LiquidarPrimaRequest value) {
        return new JAXBElement<LiquidarPrimaRequest>(_LiquidarPrimaRequest_QNAME, LiquidarPrimaRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LiquidarPrimaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LiquidarPrimaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.segurosbolivar.com/autos/dto/crea", name = "liquidarPrimaResponse")
    public JAXBElement<LiquidarPrimaResponse> createLiquidarPrimaResponse(LiquidarPrimaResponse value) {
        return new JAXBElement<LiquidarPrimaResponse>(_LiquidarPrimaResponse_QNAME, LiquidarPrimaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearCotizacionRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CrearCotizacionRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.segurosbolivar.com/autos/dto/crea", name = "crearCotizacionRequest")
    public JAXBElement<CrearCotizacionRequest> createCrearCotizacionRequest(CrearCotizacionRequest value) {
        return new JAXBElement<CrearCotizacionRequest>(_CrearCotizacionRequest_QNAME, CrearCotizacionRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearCotizacionResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CrearCotizacionResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.segurosbolivar.com/autos/dto/crea", name = "crearCotizacionResponse")
    public JAXBElement<CrearCotizacionResponse> createCrearCotizacionResponse(CrearCotizacionResponse value) {
        return new JAXBElement<CrearCotizacionResponse>(_CrearCotizacionResponse_QNAME, CrearCotizacionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaDeCiudadesRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListaDeCiudadesRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.segurosbolivar.com/autos/dto/crea", name = "listaDeCiudadesRequest")
    public JAXBElement<ListaDeCiudadesRequest> createListaDeCiudadesRequest(ListaDeCiudadesRequest value) {
        return new JAXBElement<ListaDeCiudadesRequest>(_ListaDeCiudadesRequest_QNAME, ListaDeCiudadesRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaDeCiudadesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListaDeCiudadesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.segurosbolivar.com/autos/dto/crea", name = "listaDeCiudadesResponse")
    public JAXBElement<ListaDeCiudadesResponse> createListaDeCiudadesResponse(ListaDeCiudadesResponse value) {
        return new JAXBElement<ListaDeCiudadesResponse>(_ListaDeCiudadesResponse_QNAME, ListaDeCiudadesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearCotizacionResumeRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CrearCotizacionResumeRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.segurosbolivar.com/autos/dto/crea", name = "crearCotizacionResumeRequest")
    public JAXBElement<CrearCotizacionResumeRequest> createCrearCotizacionResumeRequest(CrearCotizacionResumeRequest value) {
        return new JAXBElement<CrearCotizacionResumeRequest>(_CrearCotizacionResumeRequest_QNAME, CrearCotizacionResumeRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearCotizacionResumeResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CrearCotizacionResumeResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.segurosbolivar.com/autos/dto/crea", name = "crearCotizacionResumeResponse")
    public JAXBElement<CrearCotizacionResumeResponse> createCrearCotizacionResumeResponse(CrearCotizacionResumeResponse value) {
        return new JAXBElement<CrearCotizacionResumeResponse>(_CrearCotizacionResumeResponse_QNAME, CrearCotizacionResumeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AutosFaultType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AutosFaultType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.segurosbolivar.com/autos/dto/crea", name = "AutosFault")
    public JAXBElement<AutosFaultType> createAutosFault(AutosFaultType value) {
        return new JAXBElement<AutosFaultType>(_AutosFault_QNAME, AutosFaultType.class, null, value);
    }

}
