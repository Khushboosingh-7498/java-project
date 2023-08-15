  /**
 * Currency Converter
 */
  import java. util.Scanner;
public class currency {

    public static void main(String[] args) {
        System.out.println("1 Ruppe");
        System.out.println("2 Dollar");
        System.out.println("3 Euro");
        // take input
        Scanner sc = new Scanner(System.in);
        System. out.println(" Please Choose the currency");
        int choice = sc.nextInt();
        System.out.println("Enter the amount");
        double amount = sc.nextDouble();
        // convert the amount
        switch (choice) {
            case 1:
                Ruppees_To_OtherCurrency(amount);
                break;
            case 2:
                Dollar_To_OtherCurrency(amount);
                break;
            case 3:
                Euro_To_OtherCurrency(amount);
                break;
            default:
                System.out.println("Invalid choice");
        }
          sc.close();
    }

    public static void Ruppees_To_OtherCurrency(double amount) {
    System.out.println("1 Ruppees => " + 0.012 + " Dollar");
    System.out.println();

    System.out.println(amount+" Ruppees = " + (amount*0.012) + " Dollar");
    System.out.println();

    System.out.println("1 Ruppees => " + 0.011 + " Euro");
    System.out.println();
    System.out.println(amount+" Ruppees = " + (amount*0.011) + " Euro");
    System.out.println();

}
    
public static void  Dollar_To_OtherCurrency(double amount) {
    System.out.println("1 Dollar => " + 82.79 + " Ruppees");
    System.out.println();
    System.out.println(amount+" Dollar = " + (amount*82.79) + " Ruppees");
    System.out.println();

    System.out.println("1 Dollar => " + 0.91 + " Euro");
    System.out.println();

    System.out.println(amount+" Dollar = " + (amount*0.91) + " Euro");
}

    

public static void Euro_To_OtherCurrency(double amount){
    System.out.println("1 Euro => " + 90.92 + " Ruppe");
    System.out.println();
    System.out.println(amount+" Euro = " + (amount*90.92) + " Ruppe");
    System.out.println();

    System.out.println("1 Euro => " + 1.10 + " Dollar");
    System.out.println();

    System.out.println(amount+" Euro = " + (amount*1.10) + " Dollar");
}

}
