import java.util.Scanner;
class name
{
    public static void rollno(String name,int roll_no)
    {
        System.out.print("Hello I am "+name);
    }
}
class no extends name{
    public static void rollno(String name,int roll_no)
    {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter your First_name: ");
        String name1 = s1.nextLine();
        name n1 = new name();
        n1.rollno(name1,10);
        System.out.print(" and my roll number is "+roll_no);
    }
}
public class dynamic_practice {
    public static void main(String args[])
    {
        no no1 = new no();
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter your roll_no: ");
        int name1 = s1.nextInt();
        no1.rollno("navin",name1);
    }
}
