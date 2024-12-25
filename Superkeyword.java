//Super Keyword : used to refer to the superclass (parent class) of the current object. It can be used to access superclass methods, constructors, and variables 

class Example
{
int x;
int y;
void setValue(int x, int y)
{
this.x=x;
this.y=y;
}
void displayValue()
{
System.out.println(x +","+ y);

}
}

class Example2 extends Example
{
int x;
int y;
void setValue(int x, int y)
{
super.x=x;
super.y=y;
}
void displayValue()
{
System.out.println(super.x +","+ super.y);

}
}

class Superkeyword
{

public static void main(String []args)
{
Example e1=new Example();
e1.setValue(10,20);
e1.displayValue(); // 10,20

Example e2=new Example();
e2.setValue(30,40);
e2.displayValue(); // 30,40
e1.displayValue(); // 10,20

Example2 e3=new Example2();
e3.setValue(1,2);
e3.displayValue(); // 1,2 for parent members x,y
e1.displayValue(); // 10,20

//System.out.println( super.x +","+ super.y);

}
}