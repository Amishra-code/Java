/*1.Write a java program to calculate the area of a rectangle, a square and 
a circle. Create an abstract class 'Shape' with three abstract methods 
namely rectangleArea() taking two parameters, squareArea() and 
circleArea() taking one parameter each. 
Now create another class ‘Area’ containing all the three methods 
rectangleArea(),squareArea() and circleArea() for printing the area of 
rectangle, square and circle respectively. Create an object of class Area 
and call all the three methods.*/

package Task3;

import java.util.*;

abstract class Shape
{
	protected int length, breadth, side;
	protected float radius;
	abstract void RectangleArea(int l, int b);
	abstract void SquareArea(int s);
	abstract void CircleArea(float r);
}

class Area extends Shape
{
	void RectangleArea(int l, int b)
	{
		length = l;
		breadth = b;
		System.out.println("Area of rectangle is : " + (l*b));
	}
	
	void SquareArea(int s)
	{
		side = s;
		System.out.println("Area of square : " + (side*side));
	}
	
	void CircleArea(float r)
	{
		radius=r;
		System.out.println("Area of circle  : " + (3.14 * radius * radius));
	}
}

public class a 
{
    public static void main(String[] args)
    {
    	Scanner input = new Scanner(System.in);
		System.out.println("MENU : ");
		System.out.println("1. Area of reactangle");
		System.out.println("2. Area of square");
		System.out.println("3. Area of circle");
		
		System.out.print("Enter your choice : ");
		int choice = input.nextInt();
		
		switch(choice)
		{
		    case 1 : {
		    	System.out.println("Enter length of rectangle : ");
		    	int length = input.nextInt();
		    	System.out.print("Enter breadth of rectangle : ");
		    	int breadth =  input.nextInt();
		    	Area object = new Area();
		    	object.RectangleArea(length, breadth);
		    }break;
		    
		    case 2 : {
		    	System.out.println("Enter side of square : ");
		    	int side = input.nextInt();
		    	Area object = new Area();
		    	object.SquareArea(side);
		    }break;
		    
		    case 3 : {
		    	System.out.println("Enter radius of circle : ");
		    	float radius = input.nextFloat();
		    	Area object = new Area();
		    	object.CircleArea(radius);
		    }break;
		    
		    default : {
		    	System.out.println("Invalid Input.");
		    }break;
		
       }
   }
    
}
