import java.util.*;
public class CapitalLetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        StringBuilder capitalized = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (Character.isUpperCase(c)) {
                capitalized.append(c);
            }
        }

        System.out.println("Capital letters in the string: " + capitalized.toString());
    }
}