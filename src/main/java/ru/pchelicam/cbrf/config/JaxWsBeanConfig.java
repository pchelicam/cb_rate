package ru.pchelicam.cbrf.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.remoting.jaxws.JaxWsPortProxyFactoryBean;
import ru.pchelicam.cbrf.services.DailyInfoSoap;

import java.net.MalformedURLException;
import java.net.URL;

@Configuration
@ComponentScan("ru.pchelicam.cbrf")
public class JaxWsBeanConfig {

    private static final String wsdlUrl = "http://www.cbr.ru/DailyInfoWebServ/DailyInfo.asmx?WSDL";
    private static final String namespaceUri = "http://web.cbr.ru/";
    private static final String serviceName = "DailyInfo";
    private static final String portName = "DailyInfoSoap";

    @Lazy
    @Bean
    public JaxWsPortProxyFactoryBean dailyInfoData() throws MalformedURLException {
        JaxWsPortProxyFactoryBean ret = new JaxWsPortProxyFactoryBean();
        ret.setWsdlDocumentUrl(new URL(wsdlUrl));
        ret.setServiceInterface(DailyInfoSoap.class);
        ret.setNamespaceUri(namespaceUri);
        ret.setServiceName(serviceName);
        ret.setPortName(portName);
        return ret;
    }

}