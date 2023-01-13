package com.bolivar.comunes.poc_liquidacion.liquidar.services;

import com.bolivar.comunes.poc_liquidacion.commons.wsdl.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.math.BigDecimal;

@Service
public class LiquidarServiceImpl {

    @Autowired
    AutosPort autosPort;

    private void consumirServicio() throws FaultMessage {
        LiquidarPrimaResponse liquidarPrimaResponse = new LiquidarPrimaResponse();
        LiquidarPrimaRequest liquidarPrimaRequest = new LiquidarPrimaRequest();
        DataHeaderReqType dataHeaderReqType =  new DataHeaderReqType();
        dataHeaderReqType.setModulo("2");
        dataHeaderReqType.setProceso(BigDecimal.valueOf(200));
        dataHeaderReqType.setSubProceso(BigDecimal.valueOf(201));
        dataHeaderReqType.setCodCia(BigDecimal.valueOf(3));
        dataHeaderReqType.setCodSecc(BigDecimal.valueOf(1));
        dataHeaderReqType.setCodProducto(BigDecimal.valueOf(250));
        dataHeaderReqType.setSubProducto(BigDecimal.valueOf(251));
        dataHeaderReqType.setCodigoUsuario("74189717");
        dataHeaderReqType.setEntidadColocadora(BigDecimal.valueOf(60));
        dataHeaderReqType.setCanal(BigDecimal.valueOf(3));
        dataHeaderReqType.setSistemaOrigen(BigDecimal.valueOf(124));
        dataHeaderReqType.setPais(BigDecimal.valueOf(1));
        dataHeaderReqType.setDireccionIp("190.159.116.24;API");
        dataHeaderReqType.setVersionServicio(BigDecimal.valueOf(1.0));

        liquidarPrimaRequest.setDataHeader(dataHeaderReqType);

        LiquidarPrimaIn liquidarPrimaIn = new LiquidarPrimaIn();
        liquidarPrimaIn.setPlacaVeh("GBT847");
        liquidarPrimaIn.setTipoDocTom("CC");
        liquidarPrimaIn.setNumDocTom("1033827366");
        liquidarPrimaIn.setNomTomador("Argelio");
        liquidarPrimaIn.setApeTomador("Rodriguez");
        liquidarPrimaIn.setFechaNacimiento("1995-03-11");
        liquidarPrimaIn.setSexo("M");
        liquidarPrimaIn.setMarcaVeh("8001192");
        liquidarPrimaIn.setModeloVeh("2020");
        liquidarPrimaIn.setClaveAsesor(BigDecimal.valueOf(61009));
        liquidarPrimaIn.setSumaAccesorios("0");
        liquidarPrimaIn.setCiudadMovilizacion(BigDecimal.valueOf(14000));
        liquidarPrimaIn.setCeroKm("false");
        liquidarPrimaIn.setOpcionPa("S");

        liquidarPrimaRequest.setData(liquidarPrimaIn);

        liquidarPrimaResponse = autosPort.liquidarPrima(liquidarPrimaRequest);

        System.out.println(liquidarPrimaResponse);
    }

    @PostConstruct
    public void test() throws FaultMessage {
        this.consumirServicio();
    }
}
