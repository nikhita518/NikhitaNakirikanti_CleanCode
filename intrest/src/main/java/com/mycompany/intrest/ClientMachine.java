package com.mycompany.intrest;

import java.io.PrintStream;
import java.util.Scanner;

public class ClientMachine 
{
	private int principle;
	private float rate;
	private int time;
	public ClientMachine()
	{
		Scanner scan = new Scanner(System.in);
		PrintStream print = new PrintStream(System.out);
		print.print("1.Simple Intrest\n2.Compound Intrest\nChoose the intrest you need to calculate");
		int choice = scan.nextInt();
		if (choice==1)
		{
			inputMethod();
			SimpleIntrest simpleintrest = new SimpleIntrest();
			print.print(simpleintrest.calculateIntrest(principle,rate,time));
		}
		if(choice==2)
		{
			inputMethod();
			CompoundIntrest compoundintrest = new CompoundIntrest();
			print.print(compoundintrest.calculateIntrest(principle,rate,time));
		}
		
		
		
	}
	public void inputMethod()
	{
		Scanner scan = new Scanner(System.in);
		PrintStream print = new PrintStream(System.out);
		print.print("Enter the principle amount:");
		principle = scan.nextInt();
		print.print("Enter the rate of intrest:");
		rate = scan.nextFloat();
		print.print("Enter the term of loan/deposit in years:");
		time = scan.nextInt();
	}
    public static void main( String[] args )
    {
        new ClientMachine();
    }
}
