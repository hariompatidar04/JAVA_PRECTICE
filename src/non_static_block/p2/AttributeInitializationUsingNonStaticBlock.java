package non_static_block.p2;

public class AttributeInitializationUsingNonStaticBlock
{
    int id=20;  //explicit initialization

    //only declaration
    String name;
    int age;

    {
        System.out.println("- - -- - - - -- -- - ---- - - - -- ");

        System.out.println("ID: "+id);

        //jvm will initialize it before instance initialization block
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);

        System.out.println("- - -- - - - -- -- - ---- - - - -- ");
        //initialize using instance initialization block
        this.id=101;
        this.name="Raj";
        this.age=20;

        System.out.println("ID: "+id);
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);

        System.out.println("- - -- - - - -- -- - ---- - - - -- ");

    }

}
