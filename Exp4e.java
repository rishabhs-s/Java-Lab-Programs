/*5)	Design a class employee of an organization. An employee has a name, empid, and salary. Write the default constructor, a constructor with parameters (name, empid, and salary) and methods to return name and salary. Also write a method increaseSalary that raises the employee’s salary by a certain user specified percentage. Derive a subclass Manager from employee. Add an instance variable named department to the manager class. Supply a test program that uses theses classes and methods.   */

class employee
{
String name;
int empid;
int salary;
employee(String n,int e,int s)
{
name=n;
empid=e;
salary=s;
}
String getname()
{		
return(name);
}
int getsalary()
{
return(salary);
}
int increaseSalary(int r)
{
return(salary*r);
}
}
class Manager extends employee
{
String dep;
Manager(String n,int e, int s, String d)
{
super(n,e,s);
dep=d;
}

}
public class Exp4e
{
public static void main (String[] args)

{
Manager m=new Manager("Rishabh",100,4000,"Accounting");
System.out.println("Name="+m.getname());
System.out.println("Salary="+m.getsalary());
System.out.println("Increased salary="+m.increaseSalary(4));
}
}
