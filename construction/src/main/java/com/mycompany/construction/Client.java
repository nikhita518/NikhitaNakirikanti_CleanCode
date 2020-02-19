package com.mycompany.construction;

import java.io.PrintStream;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Client 
{
	private int house;
	private int standard;
	private String automated;
	
	public Client()
	{
		Scanner scan = new Scanner(System.in);
		PrintStream print = new PrintStream(System.out);
		print.print("Enter the area of the house in square feet:");
		house = scan.nextInt();
		print.print("1.Use standard materials\n2.Use above standard materials\n3.Use high standard materials\nEnter the standard you need for your house:");
		standard = scan.nextInt();
		print.print("Enter do you need your house automated (y/n)");
		automated = scan.next();
		
		print.print(new HouseConstruction().estimationCost(house,standard,automated));
	}
    public static void main( String[] args )
    {
        new Client();
    }
}
