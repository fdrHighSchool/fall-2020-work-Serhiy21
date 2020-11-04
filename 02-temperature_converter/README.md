# Fahrenheit/Celsius Converter
import java.util.Scanner ;

public class TemperatureConvertor {
   public static void main( String args[]) {
      Scanner scan= new Scanner(System.in);
      
      System.out.println("Congratulations my dear user, I hope this program will be useful for you.");
      System.out.println("To calculate the temperature from Celsius to Fahrenheit press 1");
      System.out.println("To calculate the temperature from Fahrenheit to Celsius press 2");
      int choice = scan.nextInt();
      
      double temperature = 0.0;
      double converted = 0.0;
         
      if(choice==1) {
           System.out.println("Celsius temperature : ");
           temperature = scan.nextDouble();
           converted = 9/5.0*temperature+32;
           System.out.println("Temperature in Fahrenheit= " + converted);
      }
      
      else if(choice == 2 ) {
         System.out.println("Fahrenheit temperature :");
         temperature = scan.nextDouble();
         converted = 5/9.0*(temperature-32);
         System.out.println("Temperature in Celsius = " + converted );
      }
      else
         System.out.println("I think you entered something incorrectly, please follow the instructions , and try again .");
      
   }
}

