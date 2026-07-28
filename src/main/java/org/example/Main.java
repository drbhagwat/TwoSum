package org.example;

import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private int[] data;
    private int numberOfElements;
    private int target;

    public int getTarget() {
        return target;
    }

    public static void main() {
        Main main = new Main();
        main.read();
        main.print();
        System.out.println("The indices which add up to " + main.getTarget() + " are " + Arrays.toString(main.twoSum()));
    }

    public void read() {
        System.out.print("Enter the number of elements to be stored in an array : ");
        Scanner scanner = new Scanner(System.in);
        numberOfElements = scanner.nextInt();
        data = new int[numberOfElements];
        System.out.print("Read elements of the array one by one (each separated by a whitespace - blank/tab/new-line)): ");

        for (int i = 0; i < numberOfElements; i++) {
            data[i] = scanner.nextInt();
        }
        System.out.print("Enter the target : ");
        target = scanner.nextInt();
        scanner.close();
    }

    public void print() {
        System.out.print("The array is as follows: ");
        System.out.println(Arrays.toString(data));
    }

    public int[] twoSum() {
        int[] result = new int[2];

        for (int i = 0; i < numberOfElements; i++) {

            for (int j = i + 1; j < numberOfElements; j++) {
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
