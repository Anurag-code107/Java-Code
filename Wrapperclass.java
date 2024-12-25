class Wrapperclass
{

public static void main(String []args)
{
int n1=Integer.parseInt("123");
Integer n2=Integer.valueOf("101010");
int n3=n2.intValue();
System.out.println(n1);
System.out.println(n3);

Double d1=Double.valueOf("987");
double d2=d1.doubleValue();
System.out.println(d2);
}

}