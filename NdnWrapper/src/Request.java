import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import model.Forecast;

import java.io.InputStream;
import java.net.URL;
import java.util.Objects;

@SuppressWarnings({"unused", "SpellCheckingInspection"})
public class Request {
    public Forecast getForecast(String request) {
        Gson gsonObject = new GsonBuilder().create();
        StringBuilder response;
        Forecast forecast;
        String downloadFileFromInternet = downloadFileFromInternet(request);
        forecast = gsonObject.fromJson(downloadFileFromInternet, Forecast.class);
        return forecast;
    }

    private String downloadFileFromInternet(String url) {

        StringBuilder sb = new StringBuilder();
        InputStream inStream;
        try {
            URL link = new URL(Objects.requireNonNull(url));
            inStream = link.openStream();
            int i;
            int total = 0;
            byte[] buffer = new byte[8 * 1024];
            while ((i = inStream.read(buffer)) != -1) {
                if (total >= (1024 * 1024)) {
                    return "";
                }
                total += i;
                sb.append(new String(buffer, 0, i));
            }
        } catch (Exception | OutOfMemoryError e) {
            e.printStackTrace();
            return null;
        }
        return sb.toString();
    }
}
