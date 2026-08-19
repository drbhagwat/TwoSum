package org.example;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Given an integer array and a target, this program finds two indices whose
 * corresponding values add up to the target.
 *
 * @author Dinesh Bhagwat
 * @version 1.0
 */
public class Main {
    /**
     * the integer array entered by the user.
     */
    private int[] data;

    /**
     * the target integer entered by the user.
     */
    private int target;

    /**
     * Entry point of the application.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        Main main = new Main();

        try (Scanner scanner = new Scanner(System.in)) {
            if (main.read(scanner)) {
                main.print();
                System.out.println(
                        "The two indices which add up to "
                                + main.target
                                + " are: "
                                + Arrays.toString(main.twoSum())
                );
            }
        }
    }


    /**
     * Reads the array size and its elements from standard input.
     *
     * @param scanner scanner used to read input
     * @return {@code true} if the input was read successfully;
     * {@code false} if invalid input was encountered
     */
    public boolean read(Scanner scanner) {
        System.out.print("How many elements you want to store in an array : ");

        if (!scanner.hasNextInt()) {
            System.out.println("Please enter a valid integer.");
            return false;
        }
        final int numberOfElements = scanner.nextInt();

        if (numberOfElements <= 1) {
            System.out.println("Number of elements should be at least 2.");
            return false;
        }
        data = new int[numberOfElements];
        System.out.print("Enter the elements (each separated by a blank/tab/new-line): ");

        for (int i = 0; i < numberOfElements; i++) {

            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter integers only.");
                return false;
            }
            data[i] = scanner.nextInt();
        }
        System.out.print("Enter the target : ");

        if (!scanner.hasNextInt()) {
            System.out.println("Please enter a valid integer.");
            return false;
        }
        target = scanner.nextInt();
        return true;
    }

    /**
     * Prints the contents of the array.
     */
    public void print() {
        System.out.println("The array is : " + Arrays.toString(data));
    }


    /**
     * Finds two indices whose corresponding values add up to the target.
     *
     * @return an array containing the two indices, or {@code {-1, -1}} if no pair exists
     */
    public int[] twoSum() {
        int [] result= {-1, -1};

        // Check every pair of elements
        for (int i = 0; i < data.length - 1; i++) {

            for (int j = i + 1; j < data.length; j++) {

                if (data[i] + data[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }
}
