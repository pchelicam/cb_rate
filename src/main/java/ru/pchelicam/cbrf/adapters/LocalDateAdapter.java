package ru.pchelicam.cbrf.adapters;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateAdapter extends XmlAdapter<String, LocalDate> {

    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

    @Override
    public String marshal(LocalDate date) throws Exception {
        return date.toString();
    }

    @Override
    public LocalDate unmarshal(String v) throws Exception {
        return LocalDate.parse(v, formatter);
    }

}
