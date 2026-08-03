package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private int[] data;
    private int target;
    private final Scanner scanner = new Scanner(System.in);

    public static void main(String [] args) {
        Main main = new Main();

        if (main.read()) {
            main.print();
            System.out.println("The two indices which add up to " + main.target + " are : " + Arrays.toString(main.twoSum()));
        }
        main.scanner.close();
    }

    public boolean read() {
        System.out.print("Enter the number of elements you want to store in an array : ");

        if (!scanner.hasNextInt()) {
            System.out.println("Please enter a valid integer.");
            return false;
        }
        final int numberOfElements = scanner.nextInt();

        if (numberOfElements <= 0) {
            System.out.println("Number of elements should be at least 1.");
            return false;
        }
        data = new int[numberOfElements];
        System.out.print("Enter the elements (each separated by a blank/tab/new-line): ");

        for (int i = 0; i < data.length; i++) {

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

    public void print() {
        System.out.println("The array is : " + Arrays.toString(data));
    }

    // Check every pair of elements
    public int[] twoSum() {

        for (int i = 0; i < data.length; i++) {

            for (int j = i + 1; j < data.length; j++) {

                if (data[i] + data[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {-1, -1};
    }
}
