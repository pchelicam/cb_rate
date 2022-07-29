package ru.pchelicam.cbrf;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import ru.pchelicam.cbrf.services.DailyInfoSoap;
import ru.pchelicam.cbrf.xmlobjects.MainInfoXMLResponse;


public class Application {

    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context =
                     new AnnotationConfigApplicationContext(Application.class)) {

        }
    }

}
