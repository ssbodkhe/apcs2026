
/**
 * Write a description of class TextInspector here.
 *
 * Shourya Bodkhe
 * 10/5/2026
 */
import java.util.Scanner;
public class TextInspector
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("=== Text Inspector ===");
        System.out.print("Please enter a word/phrase: ");
        
        //Determine the length of the word/phrtase
        
        String text = scan.nextLine();
        
        System.out.println("Total length: " +text.length());
        
        
        //Count the vowels in the word/phrase
        int count = 0;
        String vowels = "aeiou";
        
        for (int i = 0; i < text.length(); i++) {
            //extract a single char using substring
            String ch = text.substring(i, i+1);
            
            //the IndexOf method checks if a sreinf is within another strinf 
            if (vowels.indexOf(ch.toLowerCase()) != -1) {
                count++;
            }
        }
        
        
        System.out.println("Vowel count: " +count);
        
        //search our word/phrase for a given word/phrase
        System.out.print("Please enter a search term: ");
        
        String searchTerm = scan.nextLine();
        
        
        int foundIndex = text.indexOf(searchTerm);
        
        if (foundIndex != -1) {
            //exctract form foundindex to end of string
            String remainingText = text.substring(foundIndex);
            System.out.println("Substring from match to end: "+remainingText);
        }
        
        
        System.out.print("Please enter a second word/phrase to compare: ");
        String text2 = scan.nextLine();
        
        //test if strings are equal
        if (text.equals(text2)) {
            System.out.println("The two phrases equal");
        }
        else {
            //test alphabetical ordering using compareTo
            int cmp = text.compareTo(text2);
            
            if (cmp < 0) {
                System.out.println(text +" comes before" + text2);
            }
            else if (cmp > 0) {
                System.out.println(text +" comes after" + text2);
            }
        }
        
    }
}
