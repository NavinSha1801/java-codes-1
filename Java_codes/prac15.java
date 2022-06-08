import java.util.Scanner;
class volume
{
    volume(float length,float breadth,float height)
    {
        float rect = length*breadth*height;
        System.out.println(rect);
    }
    volume(float length)
    {
        float cube = length*length*length;
        System.out.println(cube);
    }
}
public class prac15
{
    public static void main(String args[])
    {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter the length for Rectangle: ");
        float a = s1.nextInt();
        System.out.print("Enter the breath for Rectangle: ");
        float b = s1.nextInt();
        System.out.print("Enter the height for Rectangle: ");
        float c = s1.nextInt();
        volume v1 = new volume(a,b,c);
        System.out.print("\nEnter the length for cube: ");
        float d = s1.nextInt();
        volume v2 = new volume(d);
    }
}