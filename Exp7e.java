/*
 Write a java program to throw an exception  for an employee details. 
•	If an employee name is a number, a name exception must be thrown.
•	If an employee age is greater than 50, an age exception must be thrown. 
•	Or else an object must be created for the entered employee details
*/
import java.io.*;
import java.util.*;

public class Exp7e
{
public static void main(String args[])
 {
   String name;
int age;

System.out.println("Enter emp name & age: ");
  Scanner in= new Scanner(System.in);

try
  {if(!(in.nextLine().matches("[a-zA-Z]+")))
    {throw new Exception();
    }

age=in.nextInt();
if(age>50)
   {
System.out.println("Age>50 exception");
throw new Exception();
   }

   Exp7 ex= new Exp7e();
System.out.println("Object created");
  }

catch(Exception e)
 {System.out.println("Exception");
  }
}
}
