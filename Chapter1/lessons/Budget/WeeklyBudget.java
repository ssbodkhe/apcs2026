/**
 * Weekly Budget
 * Shourya Bodkhe
 * Last Updated: 8/25/26
 */
import java.util.Scanner;
import java.text.NumberFormat;
public class WeeklyBudget
{
    //Calculate weekly lunch spending and remaining money
    public static void main(String[] args) {
        String name;
        double allowance, lunchPrice, totalCost, remaining;
        int lunchesPerWeek;
        
        NumberFormat money = NumberFormat.getCurrencyInstance();
        
        // Instantiate the Scanner obj to read from the keyboard
        Scanner scan = new Scanner(System.in);
        
        // Read a String (Object)
        System.out.print("Enter your name: ");
        name = scan.nextLine();
        
        // read doubles (floating point number)
        System.out.print("Enter your weekly allowance: $");
        allowance = scan.nextDouble();
        
        System.out.print("Enter price of one school lunch: $");
        lunchPrice = scan.nextDouble();
        
        //read an int
        System.out.print("Enter number of school lunches ordered this week: y");
        lunchesPerWeek = scan.nextInt();
        
        //perform calculations (Arithemntic expresiions)
        totalCost = lunchPrice * lunchesPerWeek;
        remaining = allowance - totalCost;
        
        // printf allows placeholders for strings using %s
        // %n adds new line
        System.out.printf("%n--- Weekly Budget Summary for %s ---%n", name);
        
        System.out.printf("%-25s %s%n", "Weekly Allowance:", money.format(allowance));
        System.out.printf("%-25s %s%n", "Total Spent on lunches:", money.format(totalCost));
        System.out.printf("%-25s %s%n", "Money remaining:", money.format(remaining));
        
        
        
        
        
    }
}
