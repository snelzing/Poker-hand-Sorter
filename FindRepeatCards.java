package com.Elzinga;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.Arrays;

class FindRepeatCards {
	

	Map<String, Long> FindRepeats(String needsSearchedHand) {
	    
		List<String> theList = new ArrayList<String>(Arrays.asList(needsSearchedHand.split(" ")));
		
    	Map<String, Long> countMap =
    	theList.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));      
 
		return countMap;
	}
	
	boolean GetCount(Map<String, Long> countMap, Long value){
		
		return countMap.containsValue(value);
		
		}
	}
		

	




