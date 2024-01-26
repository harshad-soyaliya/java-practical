import java.util.Scanner;
public class practical12 {

	public static void main(String[] args) {
	 Scanner sc = new Scanner (System.in);
	 System.out.println("Enter the String :");
	 String line = sc.nextLine();
	 sc.close();
	 line = line.toUpperCase();
	 int vowelcount = 0;
	 int constantcount = 0;
	 for(int i=0; i < line.length(); i++){
	     char ch = line.charAt(i);

	 if(Character.isLetter(ch)){
	     if(isVowels (ch)){
	         vowelcount++;
	     }
	     else{
	         constantcount++;
	     }
	   }
    	 
    }
    System.out.println("vowels count :" +vowelcount);
    System.out.println("Constant count :" + constantcount);
   }
 private static boolean isVowels(char ch){
    return ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' ||ch =='U';
}
}
