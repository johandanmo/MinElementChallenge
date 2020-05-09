/*==========================================
Title:  Udemy Minimum Element Challenge
Author: Johan Danmo
Date:   9 Mar 2020
==========================================*/

package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Please enter the amount of numbers you wish to select: ");
        int numberOfIntegers = scanner.nextInt();
        scanner.nextLine();

        int[] arrayOfIntegers = readIntegers(numberOfIntegers);
        int minValue = findMin(arrayOfIntegers);
        System.out.println("The minimum value is " + minValue + ".");
    }

    public static int findMin(int[] arrayOfIntegers){
        int minValue = Integer.MAX_VALUE;
        for (int i = 0; i < arrayOfIntegers.length; i++){
            if (arrayOfIntegers[i] < minValue){
                minValue = arrayOfIntegers[i];
            }
        }
        return minValue;
    }

    public static int[] readIntegers(int numberOfIntegers){
        int[] arrayOfIntegers = new int[numberOfIntegers];
        System.out.println("Please enter " + numberOfIntegers + " values.");
        for (int i = 0; i < numberOfIntegers; i++){
            System.out.print("Value #" + (i+1) + ": ");
            arrayOfIntegers[i] = scanner.nextInt();
            scanner.nextLine();
        }
        return arrayOfIntegers;
    }
}
