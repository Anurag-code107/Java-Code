class Sum
{

Sum()
{
System.out.println(0);
}

Sum(int p, int q)
{
System.out.println(p+q);
}

Sum(int p, int q, int r)
{
System.out.println(p+q+r);
}

}

class Cnst
{

public static void main(String []args)
{
Sum d1=new Sum();
Sum d2=new Sum(2,3);   
Sum d3=new Sum(2,4,6);
}

}