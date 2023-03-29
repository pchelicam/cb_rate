package ru.pchelicam.cbrf.xmlobjects;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "RegData")
public class RegData {

    @XmlElement(name = "keyRate")
    private KeyRate keyRate;

    @XmlElement(name = "Inflation")
    private Inflation inflation;

    @XmlElement(name = "stavka_ref")
    private CbRate cbRate;

    @XmlElement(name = "GoldBaks")
    private GoldBaks goldBaks;

    public CbRate getCbRate() {
        return cbRate;
    }

    public KeyRate getKeyRate() {
        return keyRate;
    }

    public Inflation getInflation() {
        return inflation;
    }

    public GoldBaks getGoldBaks() {
        return goldBaks;
    }
}
