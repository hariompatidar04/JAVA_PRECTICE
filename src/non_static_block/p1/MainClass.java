package non_static_block;

public class MainClass
{
    public static void main(String[] args)
    {
        //constructor initialization
        AttributeInitialization p1=new AttributeInitialization(22);
        System.out.println("X: "+p1.x);

        System.out.println("Name(Before initialization): "+p1.name);
        //Object Initialization
        p1.name="Vinay";
        System.out.println("Name(After Initialization): "+p1.name);

        //age
        System.out.println("Age: "+p1.age);

        //method initialization
        System.out.println("Salary(Before initialization): "+p1.salary);
        p1.setSalary(20000.0);
        System.out.println("Salary(After initialization): "+p1.salary);
    }
}
