package ru.pchelicam.cbrf.xmlobjects;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import ru.pchelicam.cbrf.services.DailyInfoSoap;
import ru.pchelicam.cbrf.config.JaxWsBeanConfig;
import ru.pchelicam.cbrf.services.CbRateService;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {JaxWsBeanConfig.class})
public class CbRateTest {

    @Autowired
    private DailyInfoSoap dailyInfoSoap;

    @Autowired
    private CbRateService cbRateService;

    /*
     * Relevant for refinancing rate, updated on 25.07.2022
     */
    @Test
    public void getCbRate() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        MainInfoXMLResponse.MainInfoXMLResult mainInfoXMLResult = dailyInfoSoap.MainInfoXML();
        CbRate cbRate = mainInfoXMLResult.getRegData().getCbRate();

        Assert.assertEquals(new BigDecimal("8.00"), cbRate.getCbRateValue());
        Assert.assertEquals(LocalDate.parse("25.07.2022", formatter), cbRate.getUpdatedDate());
    }

}
