package project_eletricitybill;

import java.util.Scanner;

public class ElectricityBill 
{
	double FixedCost = 0;
	double TotalCost = 0;
public double EBCalc(int units)
	{
	if((units>0)&&(units<=100))
	{
		TotalCost = 0;
	}
	else if((units>100)&&(units<=200))
	{
		FixedCost = 20;
		TotalCost = (100*0)+((units-100)*1.50)+FixedCost;
	}
	else if((units>200)&&(units<=500))
	{
		FixedCost = 30;
		TotalCost = (100*0)+(100*2)+((units-200)*3)+FixedCost;
	}
	else if(units>500) 
	{
		FixedCost = 50;
		TotalCost = (100*0)+(100*3.5)+(300*4.6)+((units-500)*6.6)+FixedCost;
	}
	return TotalCost;
	}
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a unit consumed : ");
	int UnitConsumed = sc.nextInt();
	ElectricityBill eb = new ElectricityBill();
	System.out.println("The EB Bill amount is : "+eb.EBCalc(UnitConsumed));
	}
}
