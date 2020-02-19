package com.mycompany.intrest;

import java.io.PrintStream;
import java.util.Scanner;

public class Choose 
{
	public Choose()
	{
		Scanner scan = new Scanner(System.in);
		PrintStream print = new PrintStream(System.out);
		print.print("1.Simple Intrest\n2.Compound Intrest\nChoose the intrest you need to calculate");
		int choice = scan.nextInt();
		if (choice==1)
		{
			SimpleIntrest simpleintrest = new SimpleIntrest();
		}
		if(choice==2)
		{
			CompoundIntrest compoundintrest = new CompoundIntrest();
		}
	}

}
