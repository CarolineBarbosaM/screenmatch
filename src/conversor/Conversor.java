package conversor;
import modules.ConversorDeMoedas;

import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) {
        String apiKey = "ce7fd8fb759bfbdbb9465f47";
        ConversorDeMoedas converter = new ConversorDeMoedas(apiKey);

        Scanner scanner = new Scanner(System.in);
        int optional;

        do {
            System.out.println("***********************************************************************");
            System.out.println("             Seja Bem-Vindo(a) ao Conversor de Moedas!\n");
            System.out.println("" +
                    "1- Dólar ==> Peso Argentino " +
                    "\n2- Peso Argentino ==> Dólar" +
                    "\n3- Dólar ==> Real" +
                    "\n4- Real Brasileiro ==> Dólar" +
                    "\n5- Dólar ==> Peso Colombiano" +
                    "\n6- Peso Colombiano ==> Dólar" +
                    "\n7- Sair\n" +
                    "\nEscolha uma opção: "
            );

            optional = Integer.parseInt(scanner.nextLine());


            switch (optional) {
                case 1:
                    String baseCurrency = "USD";
                    String targetCurrency = "EUR";
                    double amount = 100.0;

                    double convertedAmount = converter.convertCurrency(baseCurrency, targetCurrency, amount);
                    if (convertedAmount >= 0) {
                        System.out.println(amount + " " + baseCurrency + " = " + convertedAmount + " " + targetCurrency);
                    } else {
                        System.out.println("Erro na conversão de moeda.");
                    }

                    break;
                case 2:
                    System.out.println("Peso Argentino ==> Dólar");
                    break;
                case 3:
                    System.out.println("Dólar ==> Real");
                    break;
                case 4:
                    System.out.println("Real Brasileiro ==> Dólar");
                    break;
                case 5:
                    System.out.println("Dólar ==> Peso Colombiano");
                    break;
                case 6:
                    System.out.println("Peso Colombiano ==> Dólar");
                    break;
                case 7:
                    continue;
                default:
                    System.out.println("Opção Inválida!");
            }
        } while (optional != 7);
        scanner.close();

    }
}