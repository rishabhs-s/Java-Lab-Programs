/*1)	Write a program to create interface named test. In this interface the member function is square. Implement this interface in arithmetic class. Create one new class called ToTestInt. In this class use the object of arithmetic class.*/
interface test 
{
int square();
}
class arithemetic implements test
{
int b;
arithemetic(int x)
    {
        b=x;
    }
public int square()
    {
return(b*b);
    }
}
public class Exp5a//totestint
{
public static void main (String[] args)
    {
arithemetic a1=new arithemetic(5);
System.out.println(a1.square());
    }
}
