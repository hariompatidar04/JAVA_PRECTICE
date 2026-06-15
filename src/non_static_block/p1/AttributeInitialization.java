package non_static_block.p1;

public class AttributeInitialization
{
    //direct initialization
    int x=20;

    //Object Reference
    String name;

    //using Constructor
    int age;
    public AttributeInitialization(int age)
    {
        this.age=age;
    }

    //method initialization
    double salary;

    public void setSalary(double salary) {
        this.salary = salary;
    }



}
