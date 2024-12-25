//This Keyword - Remove name conflict

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

class Thiskeyword
{

public static void main(String []args)
{
Example e1=new Example();
e1.setValue(10,20);
e1.displayValue();

Example e2=new Example();
e2.setValue(30,40);
e2.displayValue();
e1.displayValue();

}

}