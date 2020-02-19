package com.mycompany.intrest;

import java.io.PrintStream;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class SimpleIntrest implements Intrest
{
	private int principle;
	private float rate;
	private int time;
	
	public SimpleIntrest()
	{
		Scanner scan = new Scanner(System.in);
		PrintStream print = new PrintStream(System.out);
		print.print("Enter the principle amount:");
		principle = scan.nextInt();
		print.print("Enter the rate of intrest:");
		rate = scan.nextFloat();
		print.print("Enter the term of loan/deposit in years:");
		time = scan.nextInt();
		
		print.print("The calculated simple intrest is:"+calculateIntrest());
	}

	@Override
	public double calculateIntrest() 
	{
		double intrest = (principle*rate*time)/100;
		DecimalFormat f = new DecimalFormat("##.00");
		f.setRoundingMode(RoundingMode.DOWN);
		String s = f.format(intrest);
		return Double.parseDouble(s);
	}
	
	
}
