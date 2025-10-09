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
        String line = input.nextLine();
        String[] parts = line.split(" ");
        int[] nums = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
    nums[i] = Integer.parseInt(parts[i]);
}
        int result = maxDifference(nums);
        System.out.println("Maximim difference: " + result);
    }
    public static int maxDifference(int[] nums) {
        
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
            for (int j = i + 1; j < nums.length; j++) {
                if (min > nums[j]) {
                    min = nums[j];
                }
            }
        }
        return max - min;
    }
 
}
