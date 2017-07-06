package pl.tomihome.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import pl.tomihome.api.Logger;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

/**
 * Created by Administrator on 2017-06-26.
 */

@Getter
@Setter
@ToString
@Service
public class Autor {
//    @Id
//    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CUST_SEQ")
//    @SequenceGenerator(sequenceName = "customer_seq", allocationSize = 1, name = "CUST_SEQ")
    int idAutora;
    String imie;
    String nazwisko;
    String nazwiskoRodowe;
//    @Autowired
    Adres adres;
    @Resource(name = "loggerCounter")
    Logger loggerCounter;
    @Value("#{systemProperties['user']}")
    String user;
    @Value("#{systemProperties['password']}")
    String password;
    //zwykle pole
    Logger loggerDate;
    java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Autor.class.getName());

    @PostConstruct
    private void postContruct(){
        logger.info("postConstruct");
    }

    @PreDestroy
    private void preDestroy(){
        logger.info("preDestroy");
    }

    private void myInitMethod(){
        logger.info("myInitMethod");
    }

    private void myDestroyMethod(){
        logger.info("myDestroyMethod");
    }
}
