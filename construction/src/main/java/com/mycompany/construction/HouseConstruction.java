package com.mycompany.construction;

import java.io.PrintStream;
import java.util.Scanner;

public class HouseConstruction 
{
	private int house;
	private int standard;
	private String automated;
	public HouseConstruction()
	{
		Scanner scan = new Scanner(System.in);
		PrintStream print = new PrintStream(System.out);
		print.print("Enter the area of the house in square feet:");
		house = scan.nextInt();
		print.print("1.Use standard materials\n2.Use above standard materials\n3.Use high standard materials\nEnter the standard you need for your house:");
		standard = scan.nextInt();
		print.print("Enter do you need your house automated (yes/no)");
		automated = scan.next();
		
		estimationCost();
	}
	
	public void estimationCost()
	{
		PrintStream print = new PrintStream(System.out);
		if(automated == "yes")
		{
			print.print(house*2500);
		}
		else if(standard == 3)
		{
			print.print(house*1800);
		}
		else if(standard == 2)
		{
			print.print(house*1500);
		}
		else
			print.print(house*1200);
	}
}
