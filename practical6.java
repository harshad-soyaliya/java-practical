import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value:-");
        int a= sc.nextInt();
        int i; int count=0;
        for(i=1;i<=a;i++){
            if(a%i==0){
                count++;
            }
        }
            if(count==2){
                System.out.println("prime no");
            }
            else{
                System.out.println("not prime");
}
}
}