import java.util.Scanner;
public class Even {
   public static void main(String[] args) {
      Scanner t = new Scanner(System.in);
      System.out.print("Enter a number: ");
        int number = t.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " is an even number.");
        } else {
            System.out.println(number + " is an odd number.");
        }
   } 
}
