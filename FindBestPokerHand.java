package com.Elzinga;

import java.util.Map;


class FindBestPokerHand {
	
	
	ReplaceCards convert = new ReplaceCards();
	CleanHand cleaned = new CleanHand();
	FindRepeatCards repeats = new FindRepeatCards();
	ParseHand section = new ParseHand();
	FindConsecutive consecutive = new FindConsecutive();
	HighestCards highest = new HighestCards();
	
	String pokerHand(String allHands, boolean wantBlack) {

		
		String convertedAllHands = convert.eliteCardReplace(allHands);
		
		//Gets just the numbers
		String sectionedNumberHand = section.sectioningCards(convertedAllHands, false, wantBlack);
		
		//Gets just the suits
		String sectionedSuitHand = section.sectioningCards(convertedAllHands, true, wantBlack);
		
		String cleanedSectionedNumberHand = cleaned.trimHand(sectionedNumberHand);
		String cleanedSectionSuitHand = cleaned.trimHand(sectionedSuitHand);
		
		String typeOfHand = null;
		
		
		Map<String, Long> countNumberHand = repeats.FindRepeats(cleanedSectionedNumberHand);
		Map<String, Long> countSuitHand = repeats.FindRepeats(cleanedSectionSuitHand);
		
		boolean mightBeFiveSuitRepeated = repeats.GetCount(countSuitHand, 5L);
		
		boolean FiveConsecutive = consecutive.areAllFiveConsecutive(cleanedSectionedNumberHand);
		
		boolean mightBeFourOfAKind = repeats.GetCount(countNumberHand, 4L);

		boolean mightBeThreeOfAKind = repeats.GetCount(countNumberHand, 3L);
		boolean mightBePair = repeats.GetCount(countNumberHand, 2L);
		
		
		
		
		//This runs through and sees what type of hand they are. 
		//This currently does not give correct answers but gives a good idea of the intended process.
		
		if((mightBeFiveSuitRepeated == true) && (FiveConsecutive == true)){
			typeOfHand = "stright flush";
			return typeOfHand;
		} else if(mightBeFourOfAKind == true) {
			typeOfHand = "4 of a Kind";
			return typeOfHand;
			
		} else if((mightBeThreeOfAKind = true) && (mightBePair = true)){
			typeOfHand = "full house";
			return typeOfHand;
			
		} else if(mightBeFiveSuitRepeated == true) {
			typeOfHand = "flush";
			return typeOfHand;
			
		} else if(FiveConsecutive == true) {
			typeOfHand = "straight";
			return typeOfHand;
			
		} else if(mightBeThreeOfAKind == true) {
			typeOfHand = "three of a kind";
			return typeOfHand;
			
		} else if(mightBePair == true) {
			typeOfHand = "pair";
			return typeOfHand;
			
		}else {

			return typeOfHand;
		}
	}
}
