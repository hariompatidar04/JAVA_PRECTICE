package non_static_block.p4;

public class MainClass {
    static void main(String[] args)
    {

        CountObject c1=new CountObject();
        CountObject c2=new CountObject();
        CountObject c3=new CountObject();
        CountObject c4=new CountObject();
        CountObject c5=new CountObject();

        System.out.println(" NO of Object Created: "+c1.getCountNoOfObject());
    }
}
