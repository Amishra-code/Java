/*2. Write a program in java to print area and volume. Create a class called Area 
and create a constructor for calculating the area of rectangle, circle, triangle, 
square using method overloading. Create a class called Volume and create a 
constructor for calculating the volume of a sphere, cylinder, cube and a cone.*/

package Task2;

import java.util.*;

class Area
{
	private int length, breadth, areal;
	private float radius, arear;
	private double base, height, areat;
	
	Area(int l, int b)
	{
		length=l;
		breadth=b;
		areal=l*b;
		System.out.println("Area of rectangle is : " + areal);	
	}
	
	Area(float r)
	{
	    radius=r;
	    arear=(22/7)*(radius)*(radius);
	    System.out.println("Area of circle is : " + arear);
	}
	
	Area(double ba, double h)
	{
		base=ba;
		height=h;
		areat=0.5*base*height;
		System.out.println("Area of triangle is : " + areat);
	}
}


class Volume
{
	private int radius_s, volume_s;
	private float radius_c, height_c, volume_c;
	private double side, volume_cu;
	private double radius_co, height_co, volume_co;
	
	Volume(int r)
	{
		radius_s=r;
		volume_s=(4/3)*(22/7)*radius_s*radius_s*radius_s;
		System.out.println("Volume of sphere is : " + volume_s);	
	}
	
	Volume(float r, float h)
	{
	    radius_c=r;
	    height_c=h;
	    volume_c=(22/7)*(radius_c)*(radius_c)*height_c;
	    System.out.println("Volume of cylinder is : " + volume_c);
	}
	
	Volume(double s)
	{
		side=s;
		volume_cu=side*side*side;
		System.out.println("Volume of cube is : " + volume_cu);
	}
	
	Volume(double r, double h)
	{
		radius_co=r;
		height_co=h;
		volume_co=((22/7)*radius_co*radius_co*height_co)/3;
		System.out.println("Volume of cone is : " + volume_co);
	}
}

public class b
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("MENU : ");
		System.out.println("1. Area of reactangle");
		System.out.println("2. Area of circle");
		System.out.println("3. Area of triangle");
		System.out.println("4. Volume of sphere");
		System.out.println("5. Volume of cylinder");
		System.out.println("6. Volume of cube");
		System.out.println("7. Volume of cone");
		System.out.print("Enter your choice : ");
		int choice = input.nextInt();
		
		switch(choice)
		{
		    case 1 : {
		    	System.out.println("Enter length of rectangle : ");
		    	int length = input.nextInt();
		    	System.out.print("Enter breadth of rectangle : ");
		    	int breadth =  input.nextInt();
		    	Area object = new Area(length, breadth);
		    }break;
		    
		    case 2 : {
		    	System.out.println("Enter radius of circle : ");
		    	float radius = input.nextFloat();
		    	Area object = new Area(radius);
		    }break;
		    
		    case 3 : {
		    	System.out.println("Enter base of triangle : ");
		    	double base = input.nextDouble();
		    	System.out.print("Enter heught of triangle : ");
		    	double height = input.nextDouble();
		    	Area object = new Area(base, height);
		    }break;
		    
		    case 4 : {
		    	System.out.println("Enter radius of sphere : ");
		    	int radius = input.nextInt();
		    	Volume object = new Volume(radius);
		    }
		    
		    case 5 : {
		    	System.out.println("Enter radius of cylinder : ");
		        float radius = input.nextFloat();
		        System.out.println("Enter height of cylinder : ");
		        float height = input.nextFloat();
		    	Volume object = new Volume(radius, height);
		    }break;
		    
		    case 6 : {
		    	System.out.println("Enter side of cube : ");
		    	double side = input.nextDouble();
		    	Volume object = new Volume(side);
		    }break;
		    
		    case 7 : {
		    	System.out.println("Enter radius of cone : ");
		    	Double radius = input.nextDouble();
		    	System.out.print("Enter height of cone : ");
		    	Double height = input.nextDouble();
		    	Volume object = new Volume(radius, height);
		    }break;
		    
		   default : {System.out.println("Invalid Input");
		    }break;
		   
		}
    }
}