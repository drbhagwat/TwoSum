package org.example;

import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private int[] data;
    private int numberOfElements;
    private int target;

    public static void main() {

        Main main = new Main();
        main.read();
        main.print();
        System.out.println(Arrays.toString(main.twoSum(main.getData(), main.getTarget())));
    }

    private int[] getData() {
        return data;
    }

    private int getTarget() {
        return target;
    }

    public Main() {
    }

    public void read() {
        System.out.print("Enter the number of elements to be stored in an array : ");
        Scanner scanner = new Scanner(System.in);
        numberOfElements = scanner.nextInt();
        data = new int[numberOfElements];

        System.out.print("Now, read the elements one by one (each separated by a whitespace (space, tab, or newline)): ");

        for (int i = 0; i < data.length; i++) {
            data[i] = scanner.nextInt();
        }
        System.out.print("Enter the target : ");
        target = scanner.nextInt();
        scanner.close();
    }

    public void print() {
        for (int i = 0; i < numberOfElements; i++) {
            System.out.println(data[i] + "\t");
        }
        System.out.println("\n");
    }

    public int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        int[] result = new int[2];

        for (int i = 0; i < length; i++) {

            for (int j = i + 1; j < length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }

        }
        return result;
    }
}
