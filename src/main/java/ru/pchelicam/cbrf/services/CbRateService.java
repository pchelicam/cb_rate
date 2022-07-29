package ru.pchelicam.cbrf.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class CbRateService {

    @Autowired
    private DailyInfoSoap dailyInfoSoap;

    public BigDecimal getCbRate() {
        return dailyInfoSoap.MainInfoXML().getRegData().getCbRate().getCbRateValue();
    }

}
