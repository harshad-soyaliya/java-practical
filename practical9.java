import java.util.Random;
public class practical9 {
public static void main(String[] args) {
String[] breaKfastchoise = {"Scrembled eggs" , "waffles" , "fruit" ,
"cereal" , "toast" , "yogurt"};
Random random = new Random();
int randomindex = random.nextInt(breaKfastchoise.length);
System.out.println("today breaKfast is = "+breaKfastchoise[randomindex]);
}
}

