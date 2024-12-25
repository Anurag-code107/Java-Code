abstract class Demo1
{
int x;
int y;
abstract void f1();
Demo1()
{
System.out.println("Parent's Constructor is executed");
}

}

class Demo2 extends Demo1
{
int z;
void f1()
{
System.out.println("Function 1 is override.");
}
Demo2()
{
System.out.println("Child's Constructor is executed");
}
}

class AbstractClass
{

public static void main(String []args)
{
Demo2 d2=new Demo2();
d2.f1();
}

}