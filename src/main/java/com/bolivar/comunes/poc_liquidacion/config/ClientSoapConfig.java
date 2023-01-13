package com.bolivar.comunes.poc_liquidacion.config;

import com.bolivar.comunes.poc_liquidacion.commons.wsdl.AutosPort;
import com.bolivar.comunes.poc_liquidacion.commons.wsdl.AutosService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ClientSoapConfig {

    @Bean
    public AutosPort getClientAutosService() {
        AutosService autosService = new AutosService();
        AutosPort autosPort = autosService.getPort(AutosPort.class);
        return autosPort;
    }
}
