import java.util.*;
public class un {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int arr[][] = new int[a][b];
        int arr0[][] = new int[a][b];
        for (int i=0;i<a;i++)
        {
            for (int j=0;j<b;j++)
            {
                System.out.println("arr["+i+"]["+j+"]");
                arr[i][j] = input.nextInt();
            }
        }
        for (int i=0;i<a;i++)
        {
            for (int j=0;j<b;j++)
            {
                System.out.println("arr0["+i+"]["+j+"]");
                arr0[i][j] = input.nextInt();
            }
        }
        for (int i=0;i<a;i++)
        {
            for (int j=0;j<b;j++)
            {
                System.out.print(arr[i][j]*arr0[i][j]+"\t");
            }
            System.out.println("");
        }
    }
    
}
