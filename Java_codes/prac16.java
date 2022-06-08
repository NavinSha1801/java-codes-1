
 public class prac16
 {
     public static void main(String args[])
     {
         double a = factorial(100);
         System.out.println(a);
     }
     public static double factorial(int n)
     {
         if (n==1)
         {
             return 1; 
         }
         else
         {
             return(n*factorial(n-1));
         }
     }
 }