package modules;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

public class TaxaDeCambio {
    private String apiKey;

    public TaxaDeCambio(String apiKey) {
        this.apiKey = apiKey;
    }

    public double getExchangeRate(String baseCurrency, String targetCurrency) throws IOException {
        URL url = new URL("https://v6.exchangeratesapi.io/latest?base=" + baseCurrency + "&symbols=" + targetCurrency);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestProperty("Content-Type", "application/json");
        connection.setRequestProperty("Authorization", "Bearer " + apiKey);

        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        StringBuilder response = new StringBuilder();
        String line;

        while ((line = reader.readLine()) != null) {
            response.append(line);
        }

        reader.close();
        connection.disconnect();

        Gson gson = new Gson();
        ExchangeRateResponse exchangeRateResponse = gson.fromJson(response.toString(), ExchangeRateResponse.class);
        Map<String, Double> rates = exchangeRateResponse.getRates();
        return rates.get(targetCurrency);
    }
}
