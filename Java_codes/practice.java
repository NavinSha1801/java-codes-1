import java.util.Scanner;
public class practice 
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int[] arr0 = new int[5];
        
        for (int i=0;i<5;i++)
        {
            System.out.print("Enter "+(i+1)+" Element: ");
           arr0[i] = input.nextInt();
        }
        int a=0;
        for (int i=0;i<5;i++)
        {
            a = a+arr0[i];
        }
        a = a/5;
        System.out.print(a);
    }
}