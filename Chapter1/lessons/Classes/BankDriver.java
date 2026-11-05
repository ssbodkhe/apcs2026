
/**
 * Write a description of class BankDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankDriver
{
    public static void main(String[] args) {
        //create bankaccount objects using constructors
        BankAccount acc1 = new BankAccount("Shourya Bodkhe", 4.56);
        BankAccount acc2 = new BankAccount(); // default constrvtor
        
        //acc1.getBalance = 5000.0;
        if (acc1.withdraw(0.22) == true) {
            System.out.print("Succesfully withdrawed. You have "+acc1.getBalance()+" in the account\n");
        }
        else {
            System.out.print("Insufficient funds\n");
        }
        //a method that returns a boolean can be used direcly in a condition
        if (acc2.withdraw(6000)) {
            System.out.print("Succesfully withdrawed\n");
        }
        else {
            System.out.print("Insufficient funds\n");
        }
        
        acc1.applyInterest(4.0, 12); //a 4% annual rate
        System.out.print(acc1);
    }
    
}
