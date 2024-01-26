/**
 * practical4
 */
import java.util.Scanner;
public class practical4
{
    public static void main (String [] arg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n*****OPERATORS*****\n");
        System.out.println("1. logical operator \n 2. Bitwise operator \n 3. conditional operator \n 4. relational operator \n 4. increment \n ");
        System.out.println("enter your choise : ");
        int choise = sc.nextInt();
        switch (choise) {
            case 1: System.out.println("\n*****LOGICAL OPERATOR*****\n");
                    System.out.println("enter number for A :");
                    int a = sc.nextInt();
                    System.out.println("enetr number for B : ");
                    int b = sc.nextInt();
                    if (a>10 && b<50) 
                    {
                        System.out.println("\n*****this is logical and *****\n");

                    }
                    else if ( a<20 || a==b)
                
                break;
            case 2 : System.out.println("\n*****BITWISE OPERATOR*****\n");
                     System.out.println("enter number for A :");
                     int a = sc.nextInt();
                     System.out.println("enter number for B :");
        
            default:
                break;
        }






    }
}
