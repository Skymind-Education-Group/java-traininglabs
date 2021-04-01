package global.skymind.solution.fundamental;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex11_ForLoop {

    public static void main(String[] args) {

        /*
        When we want to do something repetitively, there are a few ways to do that.
        One way is to use the for loop.
         */

        // Let's define an array (don't worry about array first)
        ArrayList<String> marvelRank = new ArrayList<>();

        // Add a few elements
        marvelRank.add("1. Steve Rogers");
        marvelRank.add("2. Tony Stark");
        marvelRank.add("3. Thor");
        marvelRank.add("4. Peter Parker");
        marvelRank.add("5. Natasha Romanoff");
        marvelRank.add("6. King T'Challa");
        marvelRank.add("7. Bruce Banner");
        marvelRank.add("8. Scott Lang");
        marvelRank.add("9. Peggy Carter");
        marvelRank.add("10. Matt Murdock");

        // How do we print the values in the array without writing it out one by one?
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer between 1 and 10:");
        int input = scanner.nextInt();

        // Write a condition which checks the input
        if (input > 10) {
            System.out.println("Incorrect input. Please input an integer between 1 and 10.");
        } else {
            for (int i = 0; i < input; i++) {
                System.out.println(marvelRank.get(i));
            }
        }

    }

}
