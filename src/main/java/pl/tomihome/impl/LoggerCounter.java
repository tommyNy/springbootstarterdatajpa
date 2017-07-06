package pl.tomihome.impl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import pl.tomihome.api.Logger;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017-06-30.
 */

@Service("loggerCounter")
public class LoggerCounter implements Logger {
    int count = 0;
    public void log(String message) {
        System.out.println(getClass() + " count: " + count
                + " message: " + message);
    }
}
