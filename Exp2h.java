/*WRITE A JAVA PROGRAM TO ACCEPT 10 NUMBERS IN AN ARRAY AND COMPUTE THE SQUARE OF EACH NUMBER. PRINT THE SUM OF THESE NUMBERS.*/
import java.util.*;
public class Exp2h
{
public static void main(String args[])
{
Scanner s = new Scanner(System.in);
int a[] = new int[11];
int sq[] = new int[11];
int t=0;
System.out.println("Enter 10 values ");
for (int i=1 ;i<=10 ; i++)
{
a[i]= s.nextInt();
}
System.out.println("Square of the Numbers");
for (int k=1 ; k<=10 ; k++)
{
sq[k]= a[k]*a[k];
System.out.println("Square of number " + k);
System.out.println(sq[k]);
t=t+sq[k];
}
System.out.println("Sum is: " + t);
}}

