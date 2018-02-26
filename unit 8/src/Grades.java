//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.lang.System;
import java.lang.Math;
import java.util.Scanner;

public class Grades
{
	//instance variables
	private double[] grades;
	

	//constructor
	public Grades()
	{
		setGrades(grades);
	}
	
	public Grades(double[] nums)
	{
		setGrades(nums);

	}

	//set method
	public void setGrades(double[] nums)
	{
		grades = nums;
	}

	public double getSum()
	{
		double sum=0.0;
		for (int i = 0; i< grades.length; i++)
		{
			sum+=grades[i];
		}
		return sum;
	}

	public double getAverage()
	{
		double average=0.0;
		average = getSum()/grades.length;
		return average;
	}


	//toString method
	public String toString()
	{
		String output = "";
		for (int i = 1; i <= grades.length; i++)
		{
			output += "grade " + i + " :: " + grades[i-1] + "\n";
		}
		output += "average = " + getAverage() + "\n";
		
		return output;
	}



}