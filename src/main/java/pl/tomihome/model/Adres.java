package pl.tomihome.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017-06-27.
 */

@Getter
@Setter
@ToString
@Service
public class Adres {
    @Value("${adres.ulica}")
    String ulica;
    @Value("${adres.miejscowosc}")
    String miejscowosc;
    @Value("${adres.kodPocztowy}")
    String kodPocztowy;
}
