import java.util.Scanner;
public class practice0 {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the dimension of array: ");
        int n = input.nextInt();
        int[][] arr0 = new int[n][n];
        int[][] arr1 = new int[n][n];
        for(int i=0;i<n;i++)
        {
            for (int j=0;j<n;j++)
            {
                System.out.print("Enter ["+i+"]["+j+"] element: ");
                arr0[i][j] = input.nextInt();
            }
        }
        System.out.println("Now for another matrix");
        for(int i=0;i<n;i++)
        {
            for (int j=0;j<n;j++)
            {
                System.out.print("Enter ["+i+"]["+j+"] element: ");
                arr1[i][j] = input.nextInt();
            }
        }
        for(int i=0;i<n;i++)
        {
            for (int j=0;j<n;j++)
            {
                System.out.print(arr0[i][j]*arr1[i][j]+"\t");
            }
            System.out.println("");
        }
    }
}
