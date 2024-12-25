class Area
{
int x; //Non static variable, Instance member variable, Object Member variable
int y;
static int z=10;
}

class Basicsjava
{

public static void main(String []args)
{
Area a1=new Area();
a1.y=5;
System.out.println("Hello");
System.out.println(a1.x);
System.out.println(a1.y);
System.out.println(Area.z);

}
  
}