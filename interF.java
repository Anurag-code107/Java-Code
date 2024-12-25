interface Demo
{
int x=5;
void f1();
}

class Box implements Demo
{
public void f1()
{
System.out.println(x);
}

}

class Interf 
{

public static void main(String []args)
{
Box b1=new Box();
Demo d1=new Box();
System.out.println(b1.x);
System.out.println(d1.x);
b1.f1();
d1.f1();
}

}