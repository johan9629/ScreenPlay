package in.automationtesting.practice.pruebas.utils;

import in.automationtesting.practice.pruebas.exceptions.InternetConnectionExcepction;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class CheckInternetConnection {

    private static final Logger LOGGER = LogManager.getLogger(CheckInternetConnection.class.getName());
    private URL url;

    public CheckInternetConnection(URL url) {
        this.url = url;
    }

    public void checkConnection() {
        try {
            URL urlConnection = new URL(String.valueOf(url));
            HttpURLConnection huc = (HttpURLConnection) urlConnection.openConnection();
            huc.connect();
        } catch (IOException e) {
            LOGGER.error("There's no connection on internet");
            throw new InternetConnectionExcepction(InternetConnectionExcepction.INTERNET_FAILED);
        }
    }

}
