package non_static_block.p4;

public class CountObject {
    static int countNoOfObject;

    {
        countNoOfObject++;
    }

    public int getCountNoOfObject()
    {
        return countNoOfObject;
    }
}
