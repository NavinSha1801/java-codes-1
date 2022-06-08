import java.util.Scanner;
public class cet {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        try{
        System.out.print("Enter the 1st number: ");
        int a1 = input.nextInt();
        System.out.print("Enter the 2nd number: ");
        int a2 = input.nextInt();
        double c = a1/a2;
        System.out.print(c);
        }
        catch(ArithmeticException e)
        {
            System.out.print("Can't devide by Zero");
        }
        catch(Exception e)
        {
            System.out.println("Input Mismatch Enter only numeric value");
        }
    }
}
