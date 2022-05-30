/*2.Write a java program to implement abstract class and abstract method 
with following details:
Create a abstract Base Class Temperature
Data members:
double temperature;
Method members:
void setTempData(double)
abstact void changeTemp()
Sub Class Fahrenheit (subclass of Temperature)
Data members:
double ctemp;
method member:
Override abstract method changeTemp() to convert Fahrenheit 
temperature into degree Celsius by using formula C=5/9*(F-32) and 
display converted temperature
Sub Class Celsius (subclass of Temperature)
Data member:
double ftemp;
Method member:
Override abstract method changeTemp() to convert degree Celsius into 
Fahrenheit temperature by using formula F=9/5*c+32 and display 
converted temperatur
*/

package Task3;

import java.util.*;

abstract class Temperature
{
	protected double temp;
	
	void setTempData(double temp)
	{
		this.temp = temp;
	}
	
	abstract void changeTemp(double temp);
}

class Fahreinheit extends Temperature
{
	double ctemp;
	
	void changeTemp(double temp)
	{
		setTempData(temp);
		ctemp = (5/9.0)*(temp-32);
		System.out.println("Temperature in celsius : " + ctemp);
	}
	
}

class Celsius extends Temperature 
{
	double ftemp;
	
	void changeTemp(double temp)
	{
		setTempData(temp);
		ftemp = ((5/9.0)*temp)+32;
		System.out.println("Temperature in fahreinheit : " + ftemp);
	}
}


public class b 
{
    public static void main(String[] args)
    {
    	Scanner input = new Scanner(System.in);
    	
    	System.out.println("Enter temperature in Fahreinheit for converting it to Celsius : ");
    	double temp = input.nextDouble();
    	Fahreinheit object = new Fahreinheit();
    	object.changeTemp(temp);
    	
    	System.out.println("Enter temperature in Celsius for converting it to Fahereinheit : ");
    	temp = input.nextDouble();
    	Celsius object1 = new Celsius();
    	object1.changeTemp(temp);
    	
    }
}
