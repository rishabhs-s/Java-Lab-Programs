/*Write a program for the following: 
 Read all elements from ArrayList by using Iterator. 
Create duplicate object of an ArrayList instance. 
Reverse ArrayList content
*/
import java.util.*;  
class Exp9e
{  
public static void main(String args[])
{  
ArrayList<Integer> list1=new ArrayList<Integer>();   
list1.add(20);
list1.add(40);  
list1.add(60);  
list1.add(80);  

  Iterator itr1=list1.iterator();  
while(itr1.hasNext())
  {  
System.out.println(itr1.next());
  }

System.out.println("\nCopied list:");

ArrayList list2 = new ArrayList(); 
  list2 = (ArrayList)list1.clone();

System.out.println(list2);

System.out.println("\nReversed list Elements:");
Collections.reverse(list1);
for(Integer i:list1)
   {
System.out.println(i);
   }
   }  
}  
