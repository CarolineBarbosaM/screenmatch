package modules;
import java.io.IOException;

public class ConversorDeMoedas {

    private TaxaDeCambio exchangeRateAPI;

    public ConversorDeMoedas(String apiKey) {
        this.exchangeRateAPI = new TaxaDeCambio(apiKey);
    }

    public double convertCurrency(String baseCurrency, String targetCurrency, double amount) {
        try {
            double exchangeRate = exchangeRateAPI.getExchangeRate(baseCurrency, targetCurrency);
            return amount * exchangeRate;
        } catch (IOException e) {
            e.printStackTrace();
            return -1;
        }
    }


}
