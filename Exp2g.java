/*WRITE A PROGRAM TO ACCEPT THREE DIGITS (I.E. 0 - 9) AND PRINT ALL ITS POSSIBLE COMBINATIONS.  
(FOR EXAMPLE IF THE THREE DIGITS ARE 1, 2, 3 THAN ALL POSSIBLE COMBINATIONS ARE : 123, 132, 
213, 231, 312, 321.)*/

import java.util.*;
public class Exp2g{
public static void main(String args[])
{
Scanner pc = new Scanner(System.in);
int a[] = new  int[3] ;
System.out.println("Enter 3 numbers");
for (int i=0; i<3; i++)
a[i] = pc.nextInt();

for (int x = 0; x < 3; x++)
{
for (int y = 0; y < 3; y++) 
{
for (int z = 0; z < 3; z++) 
{
if (x != y && y != z && z != x) 
{
System.out.println(a[x] + "" + a[y] + ""+ a[z]);
}
}
}
}
}
}
