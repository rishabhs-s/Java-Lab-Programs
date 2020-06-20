/*Q3. Write a program in java to show the usefulness of interfaces as a place to keep constant value of the program
*/
interface area
{
static final float pi=3.142f;
float compute(float x,float y);
}
class rectangle implements area
{
public float compute(float x,float y)
    {   
return(x*y);

    }
}
class circle implements area
{
public float compute(float x,float y)
    {   
return(pi*x*x);}
    }
class Exp5c
{
public static void main(String args[])
    {
rectangle rect=new rectangle();
circle cr=new circle();
System.out.println("Area of the rectangle= "+rect.compute(10,20));
System.out.println("Area of the circle= "+cr.compute(10,0));
    }
}
