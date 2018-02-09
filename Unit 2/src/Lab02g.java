//© A+ Computer Science  -  www.apluscompsci.com
//Name - Rachael Liu
//Date - 2/6/18
//Class - p.1
//Lab  - Lab02g

public class Lab02g
{
	public static void main( String[] args )
	{
		//add test cases
		Fahrenheit f1 = new Fahrenheit();
		f1.setFahrenheit(98.6);
		f1.getCelsius();
		f1.print();
		
		Fahrenheit f2 = new Fahrenheit();
		f2.setFahrenheit(52.30);
		f2.getCelsius();
		f2.print();
		
		Fahrenheit f3 = new Fahrenheit();
		f3.setFahrenheit(82.45);
		f3.getCelsius();
		f3.print();
		
		Fahrenheit f4 = new Fahrenheit();
		f4.setFahrenheit(75.00);
		f4.getCelsius();
		f4.print();
		
		Fahrenheit f5 = new Fahrenheit();
		f5.setFahrenheit(100.00);
		f5.getCelsius();
		f5.print();
	}
}