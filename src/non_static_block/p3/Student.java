package non_static_block.p3;

public class Student
{

    String name;

    //-------------EXECUTION FLOW --------------------

    //if you have more then one instance block
    //blocks will execute Sequentially
    //in Top to Down Manner

    {
        System.out.println("instance initialization block-1");
        System.out.println("Name: "+name);//getting default value by jvm
        this.name="Vinay";//initialize name inside instance block-1
        System.out.println("Name: "+name);
    }

    {
        System.out.println("instance initialization block-2");
        System.out.println("Name: "+name);
        this.name="Rajesh";
        System.out.println("Name: "+name);
    }
    public Student()
    {
        super();
        //-----instance blocks Execution----
        System.out.println("Constructor Running----");
        System.out.println("Name: "+name);
        this.name="Shrey";
        System.out.println("Name: "+name);

        //that block executes according to normal constructor statement
        {
            System.out.println("Ended");
        }
    }

    static void main(String[] args)
    {
        Student s1=new Student();
    }

}
