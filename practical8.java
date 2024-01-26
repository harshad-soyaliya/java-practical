import java.util.Scanner;

public class practical8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] subjectmark = new int[6];
        System.out.println("enter marks for 6 subject : ");
        for (int i = 0; i < 6; i++) {
            System.out.println("subject" + (i + 1) + ":");
            subjectmark[i] = sc.nextInt();
        }
        int totalmark = 0;
        for (int marks : subjectmark) {
            totalmark += marks;
        }
        double percentage = (double) totalmark / (6 * 100) * 100;
        System.out.println("total marks : " + totalmark);
        System.out.println("percentage : " + percentage + "%");
    }
}