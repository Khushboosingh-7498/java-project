import java.util.Scanner;
public class MultiplicationTable 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");      
        int number1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = sc.nextInt();
        for (int i = 1; i <= number2; i++) {
            int result = number1 * i;
            System.out.println("Multiplication Table for "+ number1 + " * " + i + " = " + result);
        
        }
        sc.close();
    }
    
}
