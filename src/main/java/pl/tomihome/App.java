package pl.tomihome;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.tomihome.model.Autor;

/**
 * Hello world!
 */

public class App {
    final Logger logger = LoggerFactory.getLogger(getClass());

    public static void main(String[] args) {
        new App().depencencyInjection();
    }

    private void depencencyInjection() {
        logger.info("====Let's start it====");
//        ApplicationContext xmlApplicationContext = new ClassPathXmlApplicationContext("app-ctx.xml");
//        Autor autor = xmlApplicationContext.getBean("autor", Autor.class);
//        autor.getLoggerCounter().log("teścik");
//
//        logger.info(autor.toString());
//        logger.info("is adres null? " + (autor.getAdres() == null));

        AbstractApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        Autor autor1 = annotationConfigApplicationContext.getBean("autor123", Autor.class);
        autor1.getLoggerDate().log("test appConfig");
        logger.info("autor1: " + autor1);

        annotationConfigApplicationContext.close();
    }
}
