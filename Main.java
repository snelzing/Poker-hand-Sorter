package com.Elzinga;



public class Main {

	public static void main(String[] args) {
		
		ReplaceCards convert = new ReplaceCards();
		ParseHand section = new ParseHand();
		CleanHand cleaned = new CleanHand();
		FindBestPokerHand bestHand = new FindBestPokerHand();
		HighestCards highest = new HighestCards();
		
		String allHands = "Black: 2H 3D 5S 9C KD  White: 2C 3H 4S 8C AH"; 
		
		String whatPokerHandBlack = bestHand.pokerHand(allHands, true); //for black hand
			
		String whatPokerHandWhite = bestHand.pokerHand(allHands, false); //for white hand
			
			//This is not correct as it will pull from the whole hand, instead of just the cards that decided the Poker Hand
			if(whatPokerHandWhite.equals(whatPokerHandBlack)) {
				
				String convertedAllHands = convert.eliteCardReplace(allHands);
				
				//For Black
				String sectionedNumberHandBlack = section.sectioningCards(convertedAllHands, false, true);
				String cleanedSectionedNumberHandBlack = cleaned.trimHand(sectionedNumberHandBlack);
				String HighNumberBlack = highest.highestValue(cleanedSectionedNumberHandBlack);
				
				//For White
				String sectionedNumberHandWhite = section.sectioningCards(convertedAllHands, false, true);
				String cleanedSectionedNumberHandWhite = cleaned.trimHand(sectionedNumberHandWhite);
				String HighNumberWhite = highest.highestValue(cleanedSectionedNumberHandWhite);
				
				
				highest.compareHighestValue(HighNumberBlack, HighNumberWhite);
				
				
			} else {
			//Gives actual output 	
			
				String convertedAllHands = convert.eliteCardReplace(allHands);
				
				//For White
				String sectionedNumberHandWhite = section.sectioningCards(convertedAllHands, false, false);
				String cleanedSectionedNumberHandWhite = cleaned.trimHand(sectionedNumberHandWhite);
				String HighNumberWhite = highest.highestValue(cleanedSectionedNumberHandWhite);
				System.out.println("Best Hand for White: " + whatPokerHandWhite + " with High Card: " + HighNumberWhite);
				
				//For Black
				String sectionedNumberHandBlack = section.sectioningCards(convertedAllHands, false, true);
				String cleanedSectionedNumberHandBlack = cleaned.trimHand(sectionedNumberHandBlack);
				String HighNumberBlack = highest.highestValue(cleanedSectionedNumberHandBlack);
				System.out.println("Best Hand for Black: " + whatPokerHandBlack + " with High Card: " + HighNumberBlack);
		}
	}

}
