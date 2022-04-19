//Java program by Enock K. Matundura.       Apr 2022
import java.io.*;
import java.util.Scanner;
public class autoChange
{
	public static void main(String [] args)
	{
		Scanner keyboard = new Scanner(System.in);
		Double price, payed;
		System.out.println("What is the price of the item: ");
		price = keyboard.nextDouble();
		System.out.println("How much do you have: ");
		payed = keyboard.nextDouble();
		change(price, payed);
	}
	public static void change(Double price, Double payed)
	{
		int dimes = 0, 
			nickels = 0, 
			quaters = 0,
			pennies = 0;
		int Dollars = 0;
		
		double SmallChange = (payed-price);
		
		while (SmallChange > 0) {
		if (SmallChange >= 1) 
			Dollars = (int)(SmallChange/1);
		SmallChange = (SmallChange-Dollars);
		if (SmallChange >= 0.25 && SmallChange < 1) 
			quaters = (int) (SmallChange/0.25);
		SmallChange = (SmallChange-(quaters*0.25));
		if (SmallChange >= 0.10)
			dimes = (int)(SmallChange/0.10);
		SmallChange = (SmallChange-(dimes*0.10));
		if (SmallChange >= 0.05 && SmallChange < 0.10) 
		    nickels = (int) (SmallChange/0.05);
		SmallChange = (SmallChange-(nickels*0.05));
		if (SmallChange >= 0.01 && SmallChange < 0.05) 
		    pennies = (int)Math.round((SmallChange/0.01));
		break;
		}
		System.out.println("Your bought item of price: " + price);
		System.out.println("You paid: " + payed);
		System.out.println("Your change is: \n" + Dollars + " Dollars\n" +
		quaters + " Quaters\n" + dimes +" Dimes\n" + nickels + " nickels\n"+pennies+
				" pennies"); 
	}
}
