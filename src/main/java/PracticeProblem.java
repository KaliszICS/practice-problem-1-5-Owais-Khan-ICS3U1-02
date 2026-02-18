/**
	* File: Lesson 1.5: Characters
	* Author: Owais Ali Khan
	* Date Created: February 18, 2026
	* Date Last Modified: February 18, 2026
	*/

import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
	}

	public static void q1() {
		char letter = 'a';
		System.out.println(letter);
	}

	public static void q2() {
		Scanner in = new Scanner(System.in);
		System.out.print("Input a word: ");
		String word = in.nextLine();
		System.out.println(word.charAt(2));

	}

	public static void q3() {
		Scanner in = new Scanner(System.in);
		System.out.print("Input a word: ");
		String word = in.nextLine();
		System.out.println("The second character user entered was: " + word.charAt(1));
	}

	public static void q4() {
		Scanner in = new Scanner(System.in);
		System.out.print("Input a number: ");
		int num = in.nextInt();
		System.out.println("Your number plus 1 is: "+ (num+1));
	}

	public static void q5() {
		Scanner in = new Scanner(System.in);
		System.out.print("Input a letter: ");
		String word = in.nextLine();
		char letter = word.charAt(0);
		System.out.print("Input another letter: ");
		String word1 = in.nextLine();
		char letter1 = word1.charAt(0);
		System.out.println(letter + letter1);
	}

}
