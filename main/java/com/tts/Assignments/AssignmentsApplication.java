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
		ArrayList<Integer> indexLowerCase = new ArrayList<Integer>();
		ArrayList<Integer> indexUpperCase = new ArrayList<Integer>();
		List<String> alphabetLowerCase = Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z");
		List<String> alphabetUpperCase = new ArrayList<String>(alphabetLowerCase);
		alphabetUpperCase.replaceAll(String::toUpperCase); //convert to upper case

		//populate index arrays
		for (int i = 97; i <= 122; i++) {
			indexLowerCase.add(i);
		}
		for (int i = 65; i <= 90; i++) {
			indexUpperCase.add(i);
		}


//	FUNCTION CALLS

//		System.out.println(indexLowerCase);
//		System.out.println(alphabetLowerCase);
//		System.out.println(alphabetUpperCase);


		AsciiChars.printNumbers();
		AsciiChars.printLetters(indexLowerCase,alphabetLowerCase);
		AsciiChars.printLetters(indexUpperCase,alphabetUpperCase);

		//ask name and if to play game
		Scanner scanner = new Scanner(System.in);
		System.out.print("What is your name?");     // type a word and hit enter
		String name = scanner.next();
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
		int magicBall = 0;
		int randomNum1 = randomInt();
		int randomNum2 = randomInt();
		int randomNum3 = randomInt();
		System.out.println(randomNum1);
		System.out.println(randomNum2);
		System.out.println(randomNum3);


		System.out.print("Name of you favorite pet:");     // type a word and hit enter
		String petName = scanner.nextLine();

		System.out.print("Do they have a lucky number?");     // type a word and hit enter
		int luckyNumber = scanner.nextInt();

		System.out.print("What's their favorite number?");     // type a word and hit enter
		int quarterbackNumber = scanner.nextInt();

		System.out.print("What is two-digit model year of their car?");     // type a word and hit enter
		int carTwoDigits = scanner.nextInt();

		System.out.print("What is the first name of the their favorite actor or actress?");     // type a word and hit enter
		String favoriteActress = scanner.next();

		System.out.print("Enter a random number");     // type a word and hit enter
		int randomNumber = scanner.nextInt();





		magicBall = quarterbackNumber * randomNum1;
		if (magicBall <= 75) {
			magicBall = magicBall = 75;
		}

		int number1 = carTwoDigits + luckyNumber;
		int number2 = randomNumber - randomNum2;
		int number3 = favoriteActress.charAt(0);
		int number4 = 42;
		int number5 = petName.charAt(2);

		System.out.println("-------\n" +
				"Lottery Numbers:" + number1 + ", " + number2 + ", " + number3 + ", " + number4 + ", " + number5 + "  Magic Ball: " + magicBall +
				"\n-------");






	}
	static int randomInt () {
		int max = 100;
		int min = 0;
		Random rand = new Random();

		int randInt = rand.nextInt((max-min)+1) + min ; //create random int

		return randInt; //return random int
	}

}

