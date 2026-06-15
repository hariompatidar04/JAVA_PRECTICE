package non_static_block.p2;

public class MainClass
{
    public static void main(String[] args)
    {
        AttributeInitializationUsingNonStaticBlock a1=new AttributeInitializationUsingNonStaticBlock();
        a1.name="Man";
        System.out.println("Name: "+a1.name);
    }
}
