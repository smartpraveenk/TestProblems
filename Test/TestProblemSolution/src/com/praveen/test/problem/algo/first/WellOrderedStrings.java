package com.praveen.test.problem.algo.first;

import java.util.ArrayList;

public class WellOrderedStrings {

	public static boolean isAllStringsWellOrdered(ArrayList<String> stringArray) {
		boolean isFailure = false;
		for (String wellrderString : stringArray) {
			if (!isWellOrder(wellrderString)) {
				isFailure = true;
				break;
			}
		}
		return !isFailure;
	}

	private static boolean isWellOrder(String s) {
		String s1 = s.toLowerCase();
		for (int i = 0; i < s1.length() - 1; i++) {
			if (s1.charAt(i) > s1.charAt(i + 1)) {
				return false;
			}
		}
		return true;
	}

	public static void orderedStrings(String currentString, int nbCharSeq,
			ArrayList<String> stringArray) {
		if (nbCharSeq == 0) {
			stringArray.add(currentString);
		} else if (nbCharSeq > 52) {
			// Must be logger
			// System.out.println("error: position can't be bigger than 52");
		} else {

			int nextChar = 'a';
			if (currentString.length() > 0) {
				int lastChar = currentString.charAt(currentString.length() - 1);
				if (Character.isLowerCase(lastChar)) {
					nextChar = lastChar + 1;
				} else if (Character.isUpperCase(lastChar)) {
					nextChar = Character.toLowerCase(lastChar) + 1;
				}
			}
			for (int i = nextChar; i <= 'z'; i++) {
				char toInsert = (char) i;
				if (Character.isLetter(toInsert)) { // is letter
					orderedStrings(currentString + toInsert, nbCharSeq - 1,
							stringArray); // add the lower case char
					orderedStrings(
							currentString + Character.toUpperCase(toInsert),
							nbCharSeq - 1, stringArray); // add the upper case char
				}
			}
		}

	}
}
