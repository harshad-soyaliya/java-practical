import java.util.Random;
public class practical10 {

public static void main(String[] args) {
char[] consonants = {'B' , 'C' , 'D' , 'F' , 'G' , 'H' , 'J' , 'K' , 'L' , 'M' , 'N' , 'P' , 'Q' , 'R' , 'S' , 'T' , 'V' , 'W' , 'X' , 'Y' , 'Z'};
Random random = new Random();
int sequencelength = 10;
StringBuilder randomsequence = new StringBuilder();
for(int i=0;i<sequencelength;i++)
{
   char randomconstant = consonants[random.nextInt(consonants.length)];
   randomsequence.append(randomconstant);
}
System.out.println("Random sequence without vowels : "+randomsequence.toString());
}
}

