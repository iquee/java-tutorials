package br.com.luiztaira.designpatterns.bridge;

import java.io.InputStream;
import java.net.URL;

public class GoogleMaps implements Maps {

    public String getMaps(String adress) throws Exception {
        URL url = new URL(adress);
        final InputStream inputStream = url.openStream();
        // do something
        return "google maps";
    }
}
