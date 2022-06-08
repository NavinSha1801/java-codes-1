abstract class parent
{
    abstract void message();
}
class a extends parent
{
    void message()
    {
        System.out.println("THis is 1st subclass");
    }
}
public class abs
{
    public static void main(String args[])
    {
        a a1 = new a();
        a1.message();
    }   
}
