interface ParentInterface {
    int x=6;
    int z=10;
static void f2()
{
System.out.println(z);
}

interface ChildInterface extends ParentInterface{
    int y=5;
}
}

class Test implements ChildInterface,ParentInterface {
public void f1()
{
System.out.println(x);
}
}

public class Test4
{
public static void main(String []args)
{
Test t1=new Test();
t1.f1();
System.out.println(ChildInterface.x);
System.out.println(ChildInterface.z);
ChildInterface.f2();
}
}