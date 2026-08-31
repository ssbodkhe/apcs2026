
/**
 * Transform a string
 *
 * @Shourya B
 * @8/31/2026
 */
import java.util.Scanner;
public class TextTransformer
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        
        System.out.println("Welcome to Text Transformer");
        System.out.println("=====================");
        
        System.out.print("enter a motivational quote: ");
        String phrase = scan.nextLine();
        
        int phraseLength = phrase.length();
        System.out.println("Total Characters including spaces: " + phraseLength);
        
        //replace method reeturns a new version of the old string, 
        //and replaces first char with second char
        //original string is not modified
        String securePhrase = phrase.replace('e', '3');
        securePhrase = securePhrase.replace('a', '@');
        
        System.out.println("modded phrase: " + securePhrase);
        System.out.println("original: " + phrase);
        
        //get the first 5 chars of string
        //substring returnst tring from first (inclusive) to secknd index number (exclusive)
        String prefix = phrase.substring(0, 5);
        System.out.println("First five characters: " + prefix);
        
        // when substring withonly one param, inclusive from given index to the end of estring
        String remainder = phrase.substring(5);
        System.out.println("remaining chars: " + remainder);
    }
}
