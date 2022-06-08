import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
public class practice1 {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the score: ");
        int marks = input.nextInt();
        if(marks<=30)
        {
            System.out.println("Fail");
        }
        else if(marks>30&&marks<=60)
        {
            System.out.println("Second Class");
        }
        else if(marks>60&&marks<=80)
        {
            System.out.println("First Class");
        }
        else if(marks>80&&marks<=100)
        {
            System.out.println("Distinction");
        }
        else{
            System.out.println("Wrong Input");
        }
    }
}
