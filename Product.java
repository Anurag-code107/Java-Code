import java.util.* ;
class Product
{

float prod( float p, float q)
{
return (p*q); 
}

public static void main(String args[])
{
Product pr=new Product();
Scanner sc=new Scanner(System.in);

System.out.println("Enter First no : ");
float n1=sc.nextFloat();
System.out.println("Enter First no : ");
float n2=sc.nextFloat();
System.out.println(pr.prod(n1,n2));

}
}