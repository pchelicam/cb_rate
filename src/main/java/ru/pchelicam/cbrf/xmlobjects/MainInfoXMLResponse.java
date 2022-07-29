package ru.pchelicam.cbrf.xmlobjects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "mainInfoXMLResult"
})
@XmlRootElement(name = "MainInfoXMLResponse")
public class MainInfoXMLResponse {

    @XmlElement(name = "MainInfoXMLResult")
    protected MainInfoXMLResult mainInfoXMLResult;

    public MainInfoXMLResult getMainInfoXMLResult() {
        return mainInfoXMLResult;
    }

    public void setMainInfoXMLResult(MainInfoXMLResult value) {
        this.mainInfoXMLResult = value;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    public static class MainInfoXMLResult {

        @XmlElement(name = "RegData")
        private RegData regData;

        public RegData getRegData() {
            return regData;
        }

    }

}
