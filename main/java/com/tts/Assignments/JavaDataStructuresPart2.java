package com.tts.Assignments;
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;


public class JavaDataStructuresPart2 {

    public static void main(String[] args) {
        ArrayList<Integer> numberList = new ArrayList<>();

        //FUNCTION CALLS
        int arraySize = 5;

        for (int i = 1; i <= arraySize; i++) {
            int numberInput = 2 * i / 3;
            numberList.add(numberInput);

        }
        //FUNCTION CALLS
        sum(numberList, arraySize);

        //copied code from test problem
//        double[ ] exampleArray = {1,5,6,5,4,1};
//
//        double maximum = exampleArray[0];
//
//        int index = 0;
//
//        for (int i = 1; i<exampleArray.length>; i++) {
//            if (exampleArray[i] > maximum) {
//
//                maximum = exampleArray[i];
//
//                index = i;
//
//            }
//        }
//        size and power array

        int power = inputValidationInt("Input a power\n");
        int size = inputValidationInt("Input a size\n");



        toPower(size, power);
//
 }


    static void sum(ArrayList<Integer> numList, int arraySize) {
        int sumTotal = 0;

        for (int i = 0; i <= arraySize - 1; i++) {
            int temp = numList.get(i);
            sumTotal += temp;
        }
        System.out.println("Sum of list parameters is " + sumTotal);

    }

    static void toPower(int size, int power) {
        ArrayList<Integer> returnArray = new ArrayList<>();
        System.out.println(returnArray);

        for (int i = 0; i <= size-1; i++) {
            int calc = (int) Math.pow(i, power);
            returnArray.add(calc);
        }

        System.out.println(returnArray);

    }
    static int inputValidationInt (String outputString) {
        Scanner scanner = new Scanner(System.in);

        int number;
        do {
            System.out.print(outputString);

            while (!scanner.hasNextInt()) {
                System.out.println("That's not a number! Type an integer value");
                scanner.next(); // this is important!
            }
            number = scanner.nextInt();
        } while (number <= 0);
        return number;
    }

}
