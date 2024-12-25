
class Area
{

static void fun1()
{
System.out.println("Area 1");
}
static void fun2()
{
System.out.println("Area 2");
}

}

class Example
{

static void fun1()
{
System.out.println("its function 1");
}
static void fun2()
{
System.out.println("its function 2");
}
public static void main(String []args)
{
System.out.println("Hello,its Main Function");
fun1();
fun2();
Area.fun1();
Area.fun2();
}

}