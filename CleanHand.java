package com.Elzinga;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


class CleanHand {
	
	String trimHand(String needsCleaned) {
		
		String trimmedString = needsCleaned.trim();
		return trimmedString;
	}

	ArrayList<Integer> Sort(String needsSorted) {
	    
	    String[] numberHandArray = needsSorted.split(" "); 
        
        ArrayList<String> List = new ArrayList<String>(Arrays.asList(numberHandArray));
        
        Collections.sort(List); 
        Collections.reverse(List);
        
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        
        for(int i = 0; i < List.size(); i++) {
            numbers.add(Integer.parseInt(List.get(i))); 
        }
            
        return numbers;
	}

}
