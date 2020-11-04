# Restaurant Bill Splitter
import java.util.Scanner;


public class RestaurantBill1 
{
	public static void main(String[] args) 
	{
		double mealCharge;
		final double tax = 0.0865; 
		double taxAmount;
		double totalWithTax;
		final double tip = 0.34; 
		double tipAmount; 
		double totalBill;
		
		Scanner keyboard = new Scanner(System.in);
				
		
		System.out.print("Print the amount of your order in dollars.");
		mealCharge = keyboard.nextDouble();
		
		keyboard.nextLine();
				
		
		taxAmount = mealCharge * tax;
		totalWithTax = mealCharge + taxAmount;
		tipAmount = totalWithTax * tip;
		totalBill = totalWithTax + tipAmount;
		
		
		System.out.println("Your meal charge amount is $" + mealCharge + ".");
		System.out.println("Your tax amount is $" + taxAmount + ".");
		System.out.println("Your tip amount is $" + tipAmount + ".");
		System.out.println("-----------------------------------");
		System.out.println("Your total bill amount is $" + totalBill + ".");
				
		
		System.exit(0);
	}
}

