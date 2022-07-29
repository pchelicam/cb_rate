package ru.pchelicam.cbrf.services;

import org.springframework.stereotype.Component;
import ru.pchelicam.cbrf.xmlobjects.MainInfoXMLResponse;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@Component
@WebService(serviceName = "DailyInfo")
public interface DailyInfoSoap {

    @WebMethod(operationName = "MainInfoXML", action = "http://web.cbr.ru/MainInfoXML")
    @WebResult(name = "MainInfoXMLResult", targetNamespace = "http://web.cbr.ru/")
    @RequestWrapper(localName = "MainInfoXML", targetNamespace = "http://web.cbr.ru/", className = "MainInfoXML")
    @ResponseWrapper(localName = "MainInfoXMLResponse", targetNamespace = "http://web.cbr.ru/", className = "MainInfoXMLResponse")
    MainInfoXMLResponse.MainInfoXMLResult MainInfoXML();

}
