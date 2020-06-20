/*Q2. Write a program to create interface A, in this interface we have two method meth1 and meth2. Implements this interface in another class named MyClass.interface A*/
{
void  meth1();
void meth2();
}
class Exp5b implements A
{
public void meth1()
    {
System.out.println("implementing method1 of the interface A");
    }
public void meth2()
    {
System.out.println("implementing method2 of the interface A");
    }
public static void main(String [] args)
    {
Exp5b obj=new Exp5b();
obj.meth1();
    }
}
