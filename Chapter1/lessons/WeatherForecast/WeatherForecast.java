
/**
 * Write a description of class WeatherForecast here.
 *
 *Shourya B
 * 10/2/2026
 */
public class WeatherForecast
{
    //define an enum
    public enum WeatherType {
        Sunny,
        Cloudy,
        Rainy,
        Foggy,
        Windy,
        Snowy
    }
    public static void main(String[] args) {
        //creatinga coiudnter
        int rainyDays = 0;
        
        //array of all possible enum constants (values)
        WeatherType[] options = WeatherType.values();
        
        
        //loop header parts
        //initializer, condition, mutator
        for(int day = 1; day <= 7; day++) {
            //Pick a random index from 0 to length(enum)
            int rndIndex = (int) (Math.random() * options.length);
            WeatherType today = options[rndIndex];
            
            System.out.println("Day "+day+": "+today);
            
            //enums are compared using == because they are ints
            if (today == WeatherType.Rainy) {
                rainyDays++;
            }
        }
        
        System.out.println("There are "+rainyDays+" days of rain in the forecast.");
        
        
        System.out.println("All Supported Weather Types:");
        
        //an enhanced for loop iterared direcly rho evenry ekemebt i rhgwetarhe.valuye
        for (WeatherType w: WeatherType.values()) {
            System.out.println("Category: "+w);
        }
    }
}
