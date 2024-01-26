import java.util.Scanner;
public class practical5 {
    public static void main (String [] args)
{
    Scanner sc = new Scanner(System.in);
    System.out.println("enetr amout : ");
    double rupees =sc.nextDouble();
    Double convert = 60.0;
    Double doller  = rupees/convert;
    System.out.println("rupees in doller = "+doller);
   
}

   
}
