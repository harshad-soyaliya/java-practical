import java.util.Scanner;
public class practical3b
{
    public static void main (String [] arg)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enetr number for A :");
        int a = sc.nextInt ();
        System.out.println("Enetr number for B : ");
        int b = sc.nextInt ();
        System.out.println("\n*****Befor Swapin number*****");
        System.out.println("value of A = " +a);
        System.out.println("value of B = " +b);


        // without temporally variable 

        System.out.println("\n*****After Swapin number*****");
        a=a+b;
        b=a-b;
        a=a-b;

         System.out.println("value of A = " +a);
        System.out.println("value of B = " +b);


    }
    
}
