package ru.pchelicam.cbrf.xmlobjects;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "RegData")
public class RegData {

    @XmlElement(name = "stavka_ref")
    private CbRate cbRate;

    public CbRate getCbRate() {
        return cbRate;
    }

}
