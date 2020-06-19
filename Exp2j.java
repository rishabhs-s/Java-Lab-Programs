/*	Write a program to find the sum of all integers greater than 40 and less than 250 that are divisible by 5.*/
public class Exp2j{
public static void main(String args[])
{
int x;
int sum=0;
for (x=40;x<=250;x++)
{

if (x%5==0){
System.out.println(" "+ x);
sum = sum+x;
}
}
System.out.println(" sum is "+ sum);
}}

