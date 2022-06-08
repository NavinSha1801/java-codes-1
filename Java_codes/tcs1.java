import java.util.Scanner;
public class tcs1
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of Boxes: ");
        int i0 = input.nextInt();
        System.out.print("Enter the position where the weighted box should kept: ");
        int i1 = input.nextInt();
        int weight[] = new int[i0];
        for(int i=0;i<i0;i++)
        {
            System.out.print("Enter the weight of box number "+i);
            weight[i] = input.nextInt();
        }
        for(int i=0;i<i0;i++)
        {
            if(weight[i0-1]>weight[i0])
            {
                
            }
        }
    }
}