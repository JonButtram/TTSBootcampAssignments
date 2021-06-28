package com.tts.Assignments;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.HashMap;

public class LoopMap {
    public static void main(String[] args){

        ArrayList<Integer> numberList = new ArrayList<>();

        int arraySize = 3;

        for (int i = 1; i <= arraySize; i++ ) {
            int numberInput = inputValidationInt("Insert a number. Press Enter (Input " + i + ")\n");
            numberList.add(numberInput);
            System.out.println(numberList);
        }


        //FUNCTION CALLS
        sum(numberList, arraySize);
        product(numberList, arraySize);
        maximum(numberList, arraySize);
        minimum(numberList, arraySize);

        //CREATE HASHMAP
        HashMap<String, String> carMakeModel = new HashMap<>();

        //ADD KEYS AND VALUES
        carMakeModel.put("Civic","Honda");
        carMakeModel.put("Beetle","Volkswagen");
        carMakeModel.put("Camry", "Toyota");

        //ASK FOR WHAT CAR THEY ARE LOOKING FOR
        String modelInput = inputValidationString("What model car are you looking for?");

        for (String i : carMakeModel.keySet()) {
            if (i.equals(modelInput)){
                System.out.println("Oh, you're looking for a " + i + "? Our "
                + carMakeModel.get(i) + " section is over here!\n");
            }
        }

    }

//  RETURNS SUM
    static void sum(ArrayList<Integer> numList, int arraySize) {
        int sumTotal = 0;

        for (int i = 0; i <= arraySize - 1; i++ ) {
            int temp = numList.get(i);
            sumTotal += temp;
        }
        System.out.println("Sum of list parameters is " + sumTotal);

    }

//    RETURNS PRODUCT
    static void product(ArrayList<Integer> numList, int arraySize) {
        int prodTotal = 1;

        for (int i = 0; i <= arraySize - 1; i++ ) {
            int temp = numList.get(i);
            prodTotal *= temp;
        }
        System.out.println("Product of list parameters is " + prodTotal);

    }

//    RETURNS MAX
    static void maximum(ArrayList<Integer> numList, int arraySize) {
        System.out.println("Maximum value of list parameters is " + Collections.max(numList));
    }

//    RETURNS MIN
    static void minimum(ArrayList<Integer> numList, int arraySize) {
        System.out.println("Minimum value of list parameters is " + Collections.min(numList));
    }

    //    VALIDATE INPUT IS INTEGER__________________________________________________________________________________
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

    //    VALIDATE INPUT IS STRING
    static String inputValidationString (String outputString) {
        Scanner scanner = new Scanner(System.in);

        String string ;
        do {
            System.out.print(outputString);

            while (scanner.hasNextInt()) {
                System.out.println("That's not a string!");
                scanner.next(); // this is important!
            }
            string = scanner.next();

        }while (string.isBlank() || string.isEmpty());
        return string;
    }
}
