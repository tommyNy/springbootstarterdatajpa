package pl.tomihome.impl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import pl.tomihome.api.Logger;

import java.time.LocalDate;

/**
 * Created by Administrator on 2017-06-30.
 */

@Service("loggerDate")
public class LoggerDate implements Logger {
    public void log(String message) {
        System.out.println(getClass() + " " + LocalDate.now() + ": message: " +
            message);
    }
}
