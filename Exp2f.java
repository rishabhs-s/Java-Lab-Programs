/*Q	Write a program to accept 10 student’s marks in an array, arrange it into ascending order, convert into the following grades and print marks and grades in the tabular form. 
Between 40 and 50 : PASS 
Between 51 and 75 : MERIT 
and above : DISTINCTION */
import java.util.*;
import java.lang.*;
public class Exp2f{
public static void main(String args[])
{ 
Scanner s=new Scanner(System.in);
int marks[]=new int[10];
String grade;
System.out.println("Enter marks of 10 Students");
for(int i=0;i<10;i++)
{
marks[i]=s.nextInt();
}
System.out.println("Sorted Array in ascending order-");
Arrays.sort(marks);
System.out.println("Marks   Grade");
for(int i=0;i<10;i++)
{
if(marks[i]<50)
{
System.out.println(+(marks[i])+ "     FAIL");
}
else if(marks[i]<=50 && marks[i]>70)
{
System.out.println(+(marks[i])+ "     PASS");
}
else if(marks[i]>=70)
{
System.out.println(+(marks[i])+ "     DISTINCTION");
}
}


}
}
