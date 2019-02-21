package com.Elzinga;

//This just changes the T, J, Q, K, and A to numbers so that the hand can be processed more easily, keeping primitive types consistent.

class ReplaceCards {
	
	String eliteCardReplace(String FullHand) {
		
		final String converted1 = FullHand.replace("T", "10");
		final String converted2 = converted1.replace("J", "11");
		final String converted3 = converted2.replace("Q", "12");
		final String converted4 = converted3.replace("K", "13");
		final String converted5 = converted4.replace("A", "14");
		
		return converted5;
	}

}
