import java.io.*;

class Employee
{
     String name ="saurab",city ="chennai";
     int age =23;
     void show_employee_details()
     {
             System.out.println("the name is" + name);
             System.out.println("the city is" + city);
             System.out.println("the age is" + age);
     }
}
class Main
{
public static void main(String args[])
{
   Employee e =new Employee();
   e.show_employee_details();
}
}

