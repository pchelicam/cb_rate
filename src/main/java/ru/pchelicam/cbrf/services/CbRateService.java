package ru.pchelicam.cbrf.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDate;

@Component
public class CbRateService {

    @Lazy
    @Autowired
    private DailyInfoSoap dailyInfoSoap;

    public BigDecimal getCbRate() {
        return dailyInfoSoap.MainInfoXML().getRegData().getCbRate().getCbRateValue();
    }

    public LocalDate getCbRateUpdatedDate() {
        return dailyInfoSoap.MainInfoXML().getRegData().getCbRate().getUpdatedDate();
    }

}
