// example of scanner class
/* import java.util.Scanner;

class student
{
    int id;
    String name;
    
    student()
    {
    Scanner sc = new Scanner(System.in);
    Scanner sc1 = new Scanner(System.in);


    System.out.print("enter id :- ");
    id = sc.nextInt();

    System.out.println("enter name :- ");
    name = sc1.nextLine();
    }

    public static void main(String arg[])
    {
        student s1 = new student();
        System.out.println("id = " + s1.id);
        System.out.println("name = " + s1.name);
    }
}
 */
//example of default,perameterized constructor

import java.util.Scanner;

class student
{
    int roll;
    String name,email;

    student() // default constructor
    {
        System.out.println("<--- this is default constructor --->");
        System.out.println("roll is = " + roll);
        System.out.println("name is = " + name);
        System.out.println("email is = " + email);


    }

    student(int roll,String name,String email) // perameterized constructor
    {
        System.out.println("<--- this is parameterized constructor --->");
        System.out.println("roll is = " + roll);
        System.out.println("name is = " + name);
        System.out.println("email is = " + email);
    }

    public static void main(String arg[])
    {
        student s1 = new student();
        System.out.println(" ");
        student s2 = new student(42, "bhargav", "bhargav3@gmail.com");
    }
}