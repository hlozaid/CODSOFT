import java.util.*;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Define exchange rates
        double usdToEurRate = 0.85;
        double usdToGbpRate = 0.75;
        double usdToInrRate = 73.5;

        System.out.println("Welcome to Currency Converter!");
        System.out.print("Enter the amount in USD: ");
        double usdAmount = sc.nextDouble();

        System.out.println("Select the currency to convert to:");
        System.out.println("1. EUR (Euros)");
        System.out.println("2. GBP (British Pounds)");
        System.out.println("3. INR (Indian Rupees)");
        System.out.print("Enter your choice (1/2/3): ");
        int choice = sc.nextInt();

        double convertedAmount = 0.0;
        String currencyCode = "";

        switch (choice) {
            case 1:
                convertedAmount = usdAmount * usdToEurRate;
                currencyCode = "EUR";
                break;
            case 2:
                convertedAmount = usdAmount * usdToGbpRate;
                currencyCode = "GBP";
                break;
            case 3:
                convertedAmount = usdAmount * usdToInrRate;
                currencyCode = "INR";
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }

        System.out.println(usdAmount + " USD is equal to " + convertedAmount + " " + currencyCode);
    }
}
