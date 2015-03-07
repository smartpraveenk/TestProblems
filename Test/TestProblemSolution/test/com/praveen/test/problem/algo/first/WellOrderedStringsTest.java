package com.praveen.test.problem.algo.first;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

public class WellOrderedStringsTest {

	@Test
	public void testIsAllStringsWellOrdered() {
		
		// TestCase1 with seq length 2 
		int nbCharSeq = 2;
		ArrayList<String> stringArray = new ArrayList<>();
		WellOrderedStrings.orderedStrings("", nbCharSeq, stringArray);	
		Assert.assertTrue(WellOrderedStrings.isAllStringsWellOrdered(stringArray));
		
		// TestCase1 with seq length 3 
		nbCharSeq = 3;
		stringArray = new ArrayList<>();
		WellOrderedStrings.orderedStrings("", nbCharSeq, stringArray);	
		Assert.assertTrue(WellOrderedStrings.isAllStringsWellOrdered(stringArray));
		
		// TestCase1 with seq length 4 
		nbCharSeq = 4;
		stringArray = new ArrayList<>();
		WellOrderedStrings.orderedStrings("", nbCharSeq, stringArray);	
		Assert.assertTrue(WellOrderedStrings.isAllStringsWellOrdered(stringArray));
	}

}
