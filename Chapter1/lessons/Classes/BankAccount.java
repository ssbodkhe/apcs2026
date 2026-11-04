
/**
 * Write a description of class BankAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankAccount //Step 1: class header
{
    //Step 2: create class variables
    // Encapsulated Instance Data \\
    private String accountHolder;
    private double balance;
    private int transactionCount;
    
    //Constant definition
    private static final double MIN_BALANCE = 0.0;
    
    //Step 3: create class constructor(s)
    //Default constructure- takes no parameterse
    
    public BankAccount() {
        //"this" refers to the current instance of the class(object)
        this.accountHolder = "Unnamed";
        this.balance = 0.0;
        this.transactionCount = 0;
        
    }
    
    // Overloaded constructor (has parameters)
    public BankAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
        
        if (initialBalance < MIN_BALANCE) {
            initialBalance = MIN_BALANCE;
        }
        this.transactionCount = 0;
    }
    
    //Withdraw the given amount
    
    public boolean withdrawAmount(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            transactionCount++;
            return true;
        }
        return false;
    }
    
}
