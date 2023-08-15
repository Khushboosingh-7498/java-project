import java.util.Scanner;

public class Currencyconverter {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount to be converted: ");

        double amount = scanner.nextDouble();

        System.out.print("Enter the source currency: ");

        String sourceCurrency = scanner.next();

        System.out.print("Enter the target currency: ");
        
        String targetCurrency = scanner.next();

        double exchangeRate = 1.2;

        double convertedAmount = amount * exchangeRate;

        System.out.println(amount + " " + sourceCurrency + " is equal to " + convertedAmount + " " + targetCurrency);
        scanner.close();
    
    }
}

