import java.util.Scanner;
class Example
{
int division(int p, int q)
{
int div=0;
try{	
div = p/q;
}
catch(ArithmeticException e1)
{
	System.out.println(e1.getMessage());
}
return div;
}
}
class ExceptionH1
{

public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter 1st no : " );
int n1=sc.nextInt();
System.out.println("Enter 2nd no : " );
int n2=sc.nextInt();

Example ex=new Example();
System.out.println( "Result : " + ex.division(n1,n2));
}
}