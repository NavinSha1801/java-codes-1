import java.util.Scanner;
public class exception {
    public static void main(String args[])
    {
        try
        {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the number: ");
            int a = input.nextInt();
            System.out.println(a);
        }
        catch (Exception e)
       {
           System.out.println("Input Mismatch Exception");
       }
    }
}
