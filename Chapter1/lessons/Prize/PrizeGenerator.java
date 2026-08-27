
/**
 * Write a description of class PrizeGenerator here.
 * Geerate a random cash prize
 * Shourya Bodkhe
 * Date modified: 8/26/2026
 */
import java.util.Scanner;
import java.text.NumberFormat;

public class PrizeGenerator
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        NumberFormat money = NumberFormat.getCurrencyInstance();
        
        System.out.println("Welmoce to the APCSA Prize Sim");
        System.out.println("------------------------------");
        System.out.println("Please enter name");
        String name = scan.nextLine();
        
        System.out.print("How much money do you have? $");
        double startBalance = scan.nextDouble();
        
        // generqate random cash prixe from 10 o 100
        //Math.random generates a number bertween 0 (inclusive) and 1 (exclusive)
        // (Math.random() * 91) generats a uymber wetween 0 and 90.99999999999999
        // (int) at the start makes it gen a num between 0 abd 90
        //adding 10 + and *91 gens a num between 10-100
        int prizeAmount = 10 + (int)(Math.random() * 91);
        
        //gen rand fee between 1-5 dollar
        int fee = 1 + (int)(Math.random() * 5);
    
        // int values are autmatically promoted to double
        // allowed bc no info is lost from int to double
        double finalBalance = startBalance + prizeAmount - fee;      
        
        System.out.println("/n Congrats " +name+" Here is your balance");
        System.out.println("==========================================");
        
        System.out.printf("%-25s %s%n", "Starting balance", money.format(startBalance));
        System.out.printf("%-25s %s%n", "prize money", money.format(prizeAmount));
        System.out.printf("%-25s %s%n", "gratuity", money.format(fee));
        System.out.printf("---------------------------------------------------");
        System.out.printf("%-25s %s%n", "final balance", money.format(finalBalance));
        System.out.println("==========================================");
    }
}
