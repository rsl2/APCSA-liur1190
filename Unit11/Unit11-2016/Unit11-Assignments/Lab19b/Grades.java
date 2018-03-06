//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class Grades
{
	private double[] grades;
	
	public Grades()
	{
		setGrades("");
	}
	
	public Grades(String gradeList)
	{
		setGrades(gradeList);		
	}
	
	public void setGrades(String gradeList)
	{




	}
	
	public void setGrade(int spot, double grade)
	{



	}
	
	public double getSum()
	{
		double sum=0.0;




		return sum;
	}
	
	public double getLowGrade()
	{
		double low = Double.MAX_VALUE;





		return low;
	}
	
	public double getHighGrade()
	{
		double high = Double.MIN_VALUE;





		return high;
	}
	
	public int getNumGrades()
	{
		return grades.length;
	}
	
	public String toString()
	{
		String output="";





		return output;
	}	
}