package com.mycompany.construction;

public class HouseConstruction 
{
	
	public int estimationCost(int house, int standard, String automated)
	{
		if(automated.equals("y") && standard == 3)
		{
			return house*2500;
		}
		else if(standard == 3)
		{
			return house*1800;
		}
		else if(standard == 2)
		{
			return house*1500;
		}
		else
			return house*1200;
	}
}
