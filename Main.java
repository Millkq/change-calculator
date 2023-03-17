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
		int dollars = 0;
		
		double smallChange = (payed-price);
		dollars = (int)smallChange;
		smallChange = smallChange - dollars;
		if(smallChange >= 0.25) {
			quaters = (int) (smallChange/0.25);
			smallChange = smallChange - (quaters*0.25);
			System.out.println((quaters*0.25));
		}
		if(smallChange >= 0.10) {
			dimes = (int) (smallChange/0.10);
			smallChange = (smallChange - ((dimes)*0.10));
			System.out.println((dimes*0.10));
		}
		if(smallChange >= 0.05) {
			nickels = (int) (smallChange/0.05);
			smallChange = (smallChange - (nickels*0.05));
			System.out.println((nickels*0.05));
		}
		if(smallChange >= 0.01) {
			pennies = (int)(smallChange*100);
		}
		
		
		System.out.println("Your bought item of price: " + price);
		System.out.println("You paid: " + payed);
		System.out.println("Your change is: \n" + dollars + " Dollars\n" +
		quaters + " Quaters\n" + dimes +" Dimes\n" + nickels + " nickels\n"+pennies+
				" pennies"); 
	}
}
