
/* Write a program to print the area of a rectangle by creating a class named 'Area' having two methods. First method named as 'setDim' takes length and breadth of rectangle as parameters and the second method named as 'getArea' returns the area of the rectangle.
 */
package area_rectangle;

public class Areas {
	
	private Double length,breath;

	
	public void setDim(Double length,Double breath)
	{
		this.length = length;
		this.breath = breath;
	}
	
	public double getArea()
	{
		return length*breath;
	}
	
	public static void main(String[] args) {
		
		Areas ar = new Areas();
		ar.setDim(3.0, 2.0);
		
		Double area = ar.getArea();
		System.out.println("Area of rectangle = " + area);

	}

}



/* Try to add default constructor in the program
*/

package default_constructor;

public class D_construct {
	
	int id;
	String name;
	
	D_construct()
	{
		
		System.out.println("this is default constructor.");
		System.out.println("id is = " + id);
		System.out.println("name is = " + name);
		
	}
	
	/*D_construct(int id,String name)
	{
		this.id = id;
		this.name = name;
		System.out.println("this is perameterized constructor.");
		System.out.println("id = " + id);
		System.out.println("name is = " + name);

	}*/

	public static void main(String[] args) {
		
		D_construct ds = new D_construct();
		

	}

}


// difference between buffer reader and scanner class.




//  Write a program to print the names of students by creating a Student class. If no name is passed while creating an object of Student class, then the name should be "Unknown", otherwise the name should be equal to the String value passed while creating object of Student class.

import java.util.Scanner;

class student 
{
    String name,unknown;

    public student(String unknown)
    {
        name = unknown;

    }

    public student()
    {
        name = "unknown";
    }

    public static void main(String arg[])
    {
        student s = new student();
       // s.name = "";

        if(s.name == null)
        {
            System.out.println("name is " + s.unknown);
        }

        else
        {
        System.out.println("name is = " + s.name);
        }
    }
}

//Create a class named 'Rectangle' with two data members 'length' and 'breadth' and two methods to print the area and perimeter of the rectangle respectively. Its constructor having parameters for length and breadth is used to initialize length and breadth of the rectangle. Let class 'Square' inherit the 'Rectangle' class with its constructor having a parameter for its side (suppose s) calling the constructor of its parent class as 'super(s,s)'. Print the area and perimeter of a rectangle and a square.

class Rectangle
{
    private double length,breath;

    Rectangle(double length,double breath)
    {
        this.length = length;
        this.breath = breath;
    }

    public void area()
    {
        double ars = length*breath;
        System.out.println("area of rectangle = " + ars);
    }

    public void perimeter()
    {
        double per = 2 * (length + breath);
        System.out.println("perimeter = " + per);
    }

}

class Square extends Rectangle
{

    Square(double side)
    {
       super(side,side);


    }

}

public class demo1
{
    public static void main(String arg[])
    {
        Rectangle rec = new Rectangle(4.0,5.0);
        rec.area();
        rec.perimeter();


        Square sq = new Square(4.5);
        sq.area();
        sq.perimeter();
        
    }
}


/* Create a class named 'Member' having the following members:
        Data members
        1 - Name,2 - Age,3- Phone number,4 - Address,5 - Salary

        It also has a method named 'printSalary' which prints the salary of the members.
       Two classes 'Employee' and 'Manager' inherits the 'Member' class. The 'Employee' and 'Manager' classes have data members 'specialization' and 'department' respectively.
         Now, assign name, age, phone number, address and salary to an employee and a manager by making an object of both of these.
*/


package multiple_inheritance;

class Members
{
    int age;
    String name,phone,address;
    double salary;

    public void printSalary()
    {
        System.out.println("salary = " + salary);
    }
}

class Employee extends Members
{
    String specilization;

    Employee(int age,String name,String phone,String address,double salary,String specilization)
    {
        this.age = age;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.salary = salary;
        this.specilization = specilization;

    }

    public void employee()
    {
        System.out.println("<---- Employee details ---->");
        System.out.println("age : " + age);
        System.out.println("name : " + name);
        System.out.println("address : " + address);
        System.out.println("phone : " + phone);
        System.out.println("specilization : " + specilization);
        printSalary();


    }
}

class Manager extends Members
{
    String department;

    Manager(int age,String name,String address,String phone,double salary,String department)
    {
        this.age = age;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.salary = salary;
        this.department = department;
    }

    public void manager()
    {
        System.out.println("<---- manager details ---->");
        System.out.println("age : " + age);
        System.out.println("name : " + name);
        System.out.println("address : " + address);
        System.out.println("phone : " + phone);
        System.out.println("department : " + department);
       printSalary();

    }
}


public class Member
{
    public static void main(String arg[])
    {
        Employee emp = new Employee(22,"bhargav","jangvad","8976534290",450000.0,"student");
        emp.employee();

        Manager mn = new Manager(23, "raj", "jasdan", "7690845343", 46000.0, "product");
        mn.manager();
    }
}