import java.util.Scanner;
public class practical3a 
{
   public static void main (String [] arg)
   {
    Scanner sc = new Scanner (System.in);
    System.out.println("enetr number for A : ");
    int a = sc.nextInt();
    System.out.println("enetr number for B : ");
    int b = sc.nextInt();
    System.out.println("\n*****Befor Swap number*****");
    System.out.println("value of A = " +a);
    System.out.println("value of B = " +b);
    System.out.println("\n*****After Swap number*****");
     
    // help of temprally variable

    int c = a;
    a=b;
    b=c;

    System.out.println("value of A = " +a);
    System.out.println("value of B = " +b);
   }

    
}
