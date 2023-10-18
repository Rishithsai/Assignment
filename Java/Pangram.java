import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Pangram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input: ");
        String input = sc.nextLine();
        if (isPangram(input)) {
            System.out.println("The input is pangram");
        } else {
            System.out.println("The input is not pangram");
        }
    }

    private static boolean isPangram(String input) {
        Set<Character> set = new HashSet<Character>();
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                set.add(Character.toLowerCase(c));
            }
        }

        return set.size() == 26;
    }

}