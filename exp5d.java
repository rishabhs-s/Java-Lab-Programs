/*Q4. Write a program to create an interface having two methods division and modules. Create a class, which overrides these methods.*/
interface calculate 
{
int division(int x, int y );
int modulus(int a,int b);
}
class Exp5d implements calculate
{
public int division(int x,int y)
    {
return(x/y);
    }
public int modulus(int a, int b)
    {
return(a%b);
    }
public static void main(String[]args)
    {
        Exp5d t1=new Exp5d();
System.out.println(t1.division(27,2));
System.out.println(t1.modulus(27,2));
    }
}
