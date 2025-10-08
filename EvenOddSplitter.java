/*
Name: Jessica Kamienski
Date: 10-2-25
Description:  Prints the even numbers on one line and the odd numbers on another.
*/

import java.util.Scanner;
import java.util.Arrays;

public class EvenOddSplitter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 15 integers separated by spaces: ");

        int[] splitter = new int[15];
        for (int i = 0; i < 15; i++) {
            splitter[i] = input.nextInt();
        }

        System.out.println("Even numbers: " + Arrays.toString(getEvens(splitter)));
        System.out.println("Odd numbers: " + Arrays.toString(getOdds(splitter)));

        input.close();
    }

    public static int[] getEvens(int[] nums) {
        int[] tempEvens = new int[nums.length]; 
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                tempEvens[count] = nums[i];
                count++;
            }
        }

        int[] evens = new int[count];
        for (int i = 0; i < count; i++) {
            evens[i] = tempEvens[i];
        }

        return evens;
    }

    public static int[] getOdds(int[] nums) {
        int[] tempOdds = new int[nums.length]; 
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                tempOdds[count] = nums[i];
                count++;
            }
        }

        int[] odds = new int[count];
        for (int i = 0; i < count; i++) {
            odds[i] = tempOdds[i];
        }

        return odds;
    }
}
