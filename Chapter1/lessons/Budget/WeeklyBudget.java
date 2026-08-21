/**
 * Weekly Budget
 * Shourya Bodkhe
 * Last Updated: 8/21/26
 */
import java.util.Scanner;
public class WeeklyBudget
{
    //Calculate weekly lunch spending and remaining money
    public static void main(String[] args) {
        String name;
        double allowance, lunchPrice, totalCost, remaining;
        int lunchesPerWeek;
        
        // Instantiate the Scanner obj to read from the keyboard
        Scanner scan = new Scanner(System.in);
        
        // Read a String (Object)
        System.out.print("Enter your name: ");
        name = scan.nextLine();
        
        // read doubles (floating point number)
        System.out.print("Enter your weekly allowance: $");
        allowance = scan.nextDouble();
        
        System.out.print("Entr proce of one school lunch");
        lunchPrice = scan.nextDouble();
        
        //read an int
        System.out.print("Enter numer of scool lunches ordered this week");
        lunchesPerWeek = scan.nextInt();
        
    }
}
