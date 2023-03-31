package ru.pchelicam.cbrf.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import ru.pchelicam.cbrf.xmlobjects.CbRate;

@Component
public class CbRateService {

    @Lazy
    @Autowired
    private DailyInfoSoap dailyInfoSoap;

    public CbRate getCbRate() {
        return dailyInfoSoap.MainInfoXML().getRegData().getCbRate();
    }

}
