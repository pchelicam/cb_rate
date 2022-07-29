package ru.pchelicam.cbrf.xmlobjects;

import ru.pchelicam.cbrf.adapters.LocalDateAdapter;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.math.BigDecimal;
import java.time.LocalDate;

@XmlRootElement(name = "stavka_ref")
public class CbRate {

    @XmlValue
    private BigDecimal cbRateValue;

    @XmlAttribute(name = "Date")
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    private LocalDate updatedDate;

    @XmlAttribute(name = "Title")
    private String title;

    public BigDecimal getCbRateValue() {
        return cbRateValue;
    }

    public LocalDate getUpdatedDate() {
        return updatedDate;
    }

    public String getTitle() {
        return title;
    }

}
