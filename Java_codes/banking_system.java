import java.util.Scanner;
public class banking_system
{
    public static void main(String args[])
    {
        String[] names = {"Naivn"};
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        int j = names.length;
        System.out.println(j);
        for(int i=0;i<j;i++)
        {
            if (name==names[i])
            {
                names[j]=name;
            }
        }
        System.out.println(names[3]);
    }
}