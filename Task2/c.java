/*3. Write a java program to create a class Employee with following members
• employeeName
• employeeId
• basicsalary
• displayInfo () method which will display details of Employee
Create SalaryCalculator class as child class of Employee with following 
members
• hra
• da
• pf
• grossSalary
• grossCal () method that will calculate gross salary of an employee
• showSalarySlip() method that will display salary slip of an employee*/

package Task2;

import java.util.*;

class Employee
{
	private String name, Emp_ID;
	protected double Basic_Salary;
	
	Employee()
	{}
	
	Employee(String name, String Emp_ID, double Basic_Salary)
	{
		this.name = name;
		this.Emp_ID = Emp_ID;
		this.Basic_Salary = Basic_Salary;
	}
	
	
	public void displayInfo()
	{
		System.out.println("Name of the employee is : " + name);
		System.out.println("Employee id : " + Emp_ID);
		System.out.println("Basic Salary : " + Basic_Salary);
	}
	
}

class SalaryCalculator extends Employee
{
	private double hra, da, pf, Gross_Salary;
	
	SalaryCalculator(String name, String Emp_ID, double Basic_Salary)
	{
	    super(name, Emp_ID, Basic_Salary);
	}
	
	void GrossCal()
	{
		hra = (0.3)*Basic_Salary;
		da = (0.1)*Basic_Salary;
		pf = (0.02)*Basic_Salary;
		Gross_Salary = Basic_Salary-(hra+da+pf);
	}
	
	public void ShowSalarySlip()
	{
		GrossCal();
		
		System.out.println("HRA : " + hra);
		System.out.println("DA : " + da);
		System.out.println("PF :" + pf);
		System.out.println("Gross Salary : " + Gross_Salary);
	}
}


public class c 
{
    public static void main(String[] args)
    {
    	Scanner input = new Scanner(System.in);
    	System.out.print("Enter name : ");
    	String name = input.nextLine();
    	System.out.print("Enter employee id : ");
    	String Emp_ID = input.nextLine();
    	System.out.print("Enter Basic Salary : ");
    	double Basic_Salary = input.nextDouble();
    	
    	SalaryCalculator object = new SalaryCalculator(name, Emp_ID, Basic_Salary);
    	object.displayInfo();
    	object.ShowSalarySlip();

    } 
}
