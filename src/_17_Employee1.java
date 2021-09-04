import java.util.Scanner;

//Q3) Write a program by creating an 'Employee' class having the following methods and print the final salary.
//
//1 - 'getInfo()' which takes the salary, number of hours of work per day of the employee as parameter
//2 - 'AddSal()' which adds $10 to the salary of the employee if it is less than $500.
//3 - 'AddWork()' which adds $5 to the salary of the employee if the number of hours of work per day is more than 6 hours.
public class _17_Employee1 {
    public int salary;
    public int hours;
    public void getInfo()
    {
        System.out.println("Salary : " + salary+"\n" + "Hours : "+hours);
    }
    public void AddSal()
    {
        if(salary<500)
        {
            salary+=10;
        }
    }
    public void AddWork()
    {
        if(hours>6)
        {
            salary+=5;
        }
    }

}
class Employee1
{
    public static void main(String[] args) {
        _17_Employee1 obj = new _17_Employee1();
        Scanner obj1 = new Scanner(System.in);
        obj.salary = obj1.nextInt();
        obj.hours = obj1.nextInt();
        obj.getInfo();
        obj.AddSal();
        obj.AddWork();
        System.out.println("Final Salary : "+obj.salary);
    }
}
