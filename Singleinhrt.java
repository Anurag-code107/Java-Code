//Single Inheritence

class Nokia1
{
int x;
int y;
void fun1()
{
System.out.println("Function 1 is executed");
}
Nokia1()
{
System.out.println("Constructor 1 is executed");
}
} 

class Nokia2 extends Nokia1
{
int p;
int q;
void fun2()
{
System.out.println("Function 2 is executed");
}
Nokia2()
{
System.out.println("Constructor 2 is executed");
}
}

class Singleinhrt
{
public static void main(String []args)
{
Nokia2 n2=new Nokia2();
}
}