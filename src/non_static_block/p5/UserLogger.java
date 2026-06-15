package non_static_block.p5;

public class UserLogger
{
    static {
        System.out.println("----Application Started----");
    }
    {
        System.out.println("-----New User Created-----");
    }
    public UserLogger()
    {
        System.out.println("--------User Initialized-------");
    }
}
