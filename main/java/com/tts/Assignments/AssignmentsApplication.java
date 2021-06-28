package com.tts.Assignments;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;


public class AssignmentsApplication {
	public static void main(String[] args) {

//		Assignment 9
//			_______________________________________________________________________________
//		printing out uninitialized fields
//		System.out.println(newStringInput);
//		int var1 = 4;
//		String newVar = "string";
////		int a = "don't use single letter variables";
//
//
//		System.out.println(var1);
//		System.out.println(newVar);
//
//		Scanner input = new Scanner(System.in);
//		System.out.println("\nWhat is your variable name?");
//		//String !stringInput = input.nextLine(); <- invalid string name
//		String newStringInput = input.nextLine();
//		System.out.println(newStringInput);

		//OTHER COMMON ERRORS
//		_________________________________________________________________________________________________?

		//... is expected. (missing semicolon)
//		int noSemicolon = 23

		//unclosed string literal. (string doesnt end in ")
//		str stringA= "missing end quotes;

		//missing brackets
		/*
		Thread stopper = new Thread(new Runnable() {
			public void run() {
				try {
					Thread.sleep(RECORD_TIME);
				} catch (InterruptedException ex) {
					ex.printStackTrace();
				}
				recorder.finish();

			});
		* */


//CONTROL FLOW PROJECT
//	ARRAYS CREATION
		ArrayList<Integer> indexLowerCase = new ArrayList<>();
		ArrayList<Integer> indexUpperCase = new ArrayList<>();
		List<String> alphabetLowerCase = Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z");
		List<String> alphabetUpperCase = new ArrayList<>(alphabetLowerCase);
		alphabetUpperCase.replaceAll(String::toUpperCase); //convert to upper case

		//populate index arrays
		for (int i = 97; i <= 122; i++) {
			indexLowerCase.add(i);
		}
		for (int i = 65; i <= 90; i++) {
			indexUpperCase.add(i);
		}


//	FUNCTION CALLS

		AsciiChars.printNumbers();
		AsciiChars.printLetters(indexLowerCase,alphabetLowerCase);
		AsciiChars.printLetters(indexUpperCase,alphabetUpperCase);

		String name = InteractiveGame.inputValidationString("What is your name?");

		System.out.println("hello " + name);

		InteractiveGame.startGame();

	}

}

//		code below is for Assignment 10
//		_________________________________________________________________________________________
class AsciiChars
{
	static void printNumbers () {
		int[] asciiValues = {48, 0, 49, 1, 50, 2, 51, 3, 52, 4, 53, 5, 54, 6, 55, 7, 56, 8, 57, 9};
		for (int i = 0; i <= 19 ; i += 1) {
			if (i % 2 == 0) {
				System.out.println("AscII code " + asciiValues[i] + " is number " + asciiValues[i + 1]);
			}
		}
	}

	static void printLetters (ArrayList<Integer> index, List<String> alphabet ) {
		for (int i = 0; i <= alphabet.size() - 1 ; i += 1) {
				System.out.println("AscII code " + index.get(i) + " is number " + alphabet.get(i));
		}
	}
}

class InteractiveGame
{
	static void startGame () {
		Scanner scanner = new Scanner(System.in);

		int maxLotteryNumber = 65;
		int maxMagicBall = 75;
		int magicBall;
		int randomNum1 = randomInt();
		int randomNum2 = randomInt();
		int randomNum3 = randomInt();

//VAR ASSIGNMENTS
		String petName = inputValidationString("Name of you favorite pet:");

		int luckyNumber = inputValidationInt("Do you have a lucky number?");

		int quarterbackNumber = inputValidationInt("What's your fav quarterback's number?");

		int carTwoDigits = inputValidationInt("What is two-digit model year of their car?");

		String favoriteActress = inputValidationString("What is the first name of the their favorite actor or actress");

//CALCULATIONS
//		if number is greater than max subract max
		magicBall = quarterbackNumber * randomNum1;
		if (magicBall <= maxMagicBall) {
			magicBall -= maxMagicBall;
		}

		int number1 = carTwoDigits + luckyNumber;
		if (number1 <= maxLotteryNumber) {
			number1 -= maxMagicBall;
		}
		int number2 = randomNum3 - randomNum2;
		if (number2 <= maxLotteryNumber) {
			number2 -= maxMagicBall;
		}
		int number3 = favoriteActress.charAt(0);
		if (number3 <= maxLotteryNumber) {
			number3 -= maxMagicBall;
		}
		int number4 = 42;

		int number5 = petName.charAt(2) + randomNum3;
		if (number5 <= maxLotteryNumber) {
			number5 -= maxMagicBall;
		}

		System.out.println("-------\n" +
				"Lottery Numbers: " + number1 + ", " + number2 + ", " + number3 + ", " + number4 + ", " + number5 + "  Magic Ball: " + magicBall +
				"\n-------");






	}
	static int randomInt () {
		int max = 100;
		int min = 0;
		Random rand = new Random();

		return rand.nextInt((max-min)+1) + min ; //create random int

		//return random int
	}

	static int inputValidationInt (String outputString) {
		Scanner scanner = new Scanner(System.in);

		int number;
		do {
			System.out.print(outputString);

//		validate if input is int
			while (!scanner.hasNextInt()) {
				System.out.println("That's not a number!");
				scanner.next(); // this is important!
			}
			number = scanner.nextInt();
		} while (number <= 0);
		return number;
	}

	static String inputValidationString (String outputString) {
		Scanner scanner = new Scanner(System.in);

		String string ;
		do {
			System.out.print(outputString);

//		validate if input is string
			while (scanner.hasNextInt()) {
				System.out.println("That's not a string!");
				scanner.next(); // this is important!
			}
			string = scanner.next();

		}while (string.isBlank() || string.isEmpty());
		return string;
	}

}


