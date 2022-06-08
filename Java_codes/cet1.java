import java.util.Scanner;
public class cet1
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Annual Income: ");
        int c=1;
        int a = input.nextInt();
        if(a<250000)
        {
            System.out.print("Applicable Tax is Nil and your amount is: 0");
        }
        else if(a>=250000&&a<750000)
        {
            c = (a*5)/100;
            System.out.println("Applicable Tax is 5% and your tax amount is "+c);
        }
        else if(a>=750000&& a<1000000)
        {
            c = (a*10)/100;
            System.out.println("Applicable Tax is 10% and your tax amount is "+c);
        }
        else if(a>=1000000&&a<1250000)
        {
            c = (a*15)/100;
            System.out.println("Applicable Tax is 15% and your tax amount is "+c);
        }
        else if(a>=1250000&&a<1500000)
        {
            c = (a*25)/100;
            System.out.println("Applicable Tax is 25% and your tax amount is "+c);
        }
        else{
            c = (a*30)/100;
            System.out.println("Applicable Tax is 30% and your tax amount is "+c);
        }
    }
}