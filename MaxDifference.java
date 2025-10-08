/*
Name: Jessica
Date: Kamienski
Description:  returns the difference between the largest and smallest numbers.
*/

import java.util.Scanner;
import java.util.Arrays;

public class Maths {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers separated by spaces: ");
        nums[i] = input.nextInt();
    }
    public class MaxDifference {
        int nums = new int[nums.length];
        for (int i = 0; i < nums; i++) {
            if (nums[i] > max) {
                int max = nums[i];
            }
            for (int j = i + 1; j < nums; j++) {
                if (min > nums[j]) {
                    int min = nums[j];
                }
            }
        }
        int diff = max - min;
        System.out.println("Largest number: " + max);
        System.out.println("Smallest number: " + min);
        System.out.println("Difference: " + diff);
    }

}
