package com.Elzinga;



class ParseHand {

	//This is made so it can be overloaded to find what part of hand is needed (just suits, numbers, etc.)
	String sectioningCards(String allHand, boolean wantSuits, boolean wantBlack ) {
		
		String extrasGone = ridOfExtras(allHand);
		
		String typeWanted = null; 
		
		if(wantSuits == true) {
			typeWanted = justSuits(extrasGone);
		} else {
			typeWanted = justNumbers(extrasGone);
		}
		
		
		String halfWanted = null;
		
		if(wantBlack == true) {
			halfWanted = halfHand(typeWanted, 0);
		} else { 
			halfWanted =halfHand(typeWanted, 1);
			
		}
		
		
		return halfWanted;
		
		
	}

	//These are private (encapsulated) so that nothing in the other classes clashes with them.

	private String ridOfExtras(String HandofExtras) { 
		String justCards = HandofExtras.replaceAll("[WhiteBlack:]", " ");
		
		CleanHand cleaned = new CleanHand();
		
		String cleanedJustCards = cleaned.trimHand(justCards); 
		
		return cleanedJustCards;
	}
	
	
	private String justSuits(String makeSuits) {
		String justSuits = makeSuits.replaceAll("[1234567890]", "");
		return justSuits;
	}
	
	
	private String justNumbers(String makeNumbers) {
		String justNumbers = makeNumbers.replaceAll("[CDHS]", "");
		return justNumbers;
	}
	
	//Splits the String into the Black hand side and White Hand side
	private String halfHand(String fullHand, int partWanted) {
		
		   final int mid = fullHand.length() / 2; //gets the middle of the String
		   String[] parts = {fullHand.substring(0, mid),fullHand.substring(mid)};
	    
		   String wantedHalfOfHand = parts[partWanted];
		   
		   return wantedHalfOfHand;	
	}
	
		

}
