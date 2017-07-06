package pl.tomihome;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import pl.tomihome.impl.LoggerDate;
import pl.tomihome.model.Adres;
import pl.tomihome.model.Autor;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017-07-04.
 */

@Configuration
//TODO zanotować:
/*
Uwaga: jeśli nie podamy żadnych pakietów
skanowanie rozpocznie się od bieżącego pakiet
(tzn tego, w którym znajduje się klasa z tą adnotacją)
– przeskanowane zostaną także wszystkie pakiety ‚podrzędne’
 do obecnego.
 */
@ComponentScan//(basePackages = "pl.tomihome")
//TODO learn more
@PropertySource("classpath:adres.properties")
//        ignoreResourceNotFound = true
public class AppConfig {
    @Resource(name = "loggerDate")
    LoggerDate loggerDate;

    @Autowired
    Adres adres;

    @Bean(name = "autor123", initMethod = "myInitMethod", destroyMethod = "myDestroyMethod")
    //TODO zantować properties name
    public Autor autor(){
        Autor autor = new Autor();
        autor.setLoggerDate(loggerDate);
        autor.setAdres(adres);
        return autor;
    }
}