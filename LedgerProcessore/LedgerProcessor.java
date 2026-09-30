
/**
 * Shourya B
 * 9/30/2026
 */
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;
import java.text.NumberFormat;

public class LedgerProcessor
{
    // adding throws allows Java to handle an error
    public static void main(String[] args) throws FileNotFoundException
    {
        //connect scanner to external file
        //the file must be in the same folder as the project
        
        File dataFile = new File("transactions.txt");
        Scanner fileScan = new Scanner(dataFile);
        
        NumberFormat money = NumberFormat.getCurrencyInstance();
        
        //counter and accumulator variable
        
        int count = 0;
        
        double totalSales = 0.0;
        
        System.out.println("===Daily Transaction Ledger===");
        
        //the loop will run while there is another line in the file
        while (fileScan.hasNextLine()) {
            double line = fileScan.nextDouble();
            double price = line;
            
            
            //update counter and accumulator
            count++;
            totalSales += price;
            
            System.out.println("Transaction #"+count+": "+money.format(price));
            
            
        }
        
        //alays close the file strems whehfi ine2qiofw\
        
        fileScan.close();
        
        double averageSales = totalSales / count;
        System.out.println("Total Items Sold: " + count);
        System.out.println("Total Revenue: " + money.format(totalSales));
        System.out.println("Average transaction: " + money.format(averageSales));
        
        
        
        
        
        
    }
}
