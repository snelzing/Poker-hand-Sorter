package com.Elzinga;

import java.util.List;

class FindConsecutive {
	
	CleanHand cleaned = new CleanHand();

	boolean areAllFiveConsecutive(String isItConsecutive){
	    		int counter = 0;
	    	
	    		List<Integer> isItConsecutiveSorted = cleaned.Sort(isItConsecutive);
	    		
	    		boolean allFiveConsecutive = false;
	    	    
	    		for (int i = 0; i < isItConsecutiveSorted.size() - 1; i++) {

	    	        if (isItConsecutiveSorted.get(i) == isItConsecutiveSorted.get(i+1) + 1) {
	    	            counter++; 
	    	            
	    	        }
	    	        
			    		if(counter == 4) {
				    		
				    		allFiveConsecutive = true;
				    		return allFiveConsecutive;
				    		
	    	                }
	    		}
	    		
				return allFiveConsecutive;
		}				
}
	

