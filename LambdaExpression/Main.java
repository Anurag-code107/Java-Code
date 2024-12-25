package work;

public class Main {
    public static void main(String[] args) {
        System.out.println("My System Starts..");

        //create separate class and implements this interface.
        MyInter m1=new MyInterImpl();
        m1.sayHello();

        //Anonymous Class for implementing Interface
        MyInter m2=new MyInter() {
            @Override
            public void sayHello() {
                System.out.println("Hi from first anonymous clas");
            }
        };
        m2.sayHello();

        //Lambda Expression or using our Interface with the help of lambda.
        MyInter m3=()-> System.out.println("Hi form first lambda expression");
        m3.sayHello();

        SumInter s1=(a, b)->a+b;
        System.out.println(s1.sum(2,3));

        StringLengthInter sl=(str)->str.length();
        System.out.println(sl.strLength("Anurag Negi"));
    }
}

