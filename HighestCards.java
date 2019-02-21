package com.Elzinga;




class HighestCards {
	
	static String [] iterableArray = {"14", "13", "12", "11", "10", "9", "8", "7", "6", "5", "4", "3", "2"};
	private String highNumber = null;

	//Needs to be remade using the Sort method so that it takes the highest Number instead of just looking through a string.
	public String highestValue(String NumberHand) {
		for(String i : iterableArray){
			Boolean str = NumberHand.contains(i);
            	if(str == true) {
            		
            		return highNumber;

            	}
		}
		return highNumber;
	}
	
	
	//Currently broken because the wrong types are passed in.
	public void compareHighestValue(String HighNumberBlack, String HighNumberWhite) {
		int highNumberIntBlack = Integer.parseInt(HighNumberBlack);
		int highNumberIntWhite = Integer.parseInt(HighNumberWhite);
		
		
		if(highNumberIntBlack > highNumberIntWhite) {
			if(highNumberIntBlack == 11) {
				System.out.println("Black wins. - with high card: Jack");
			}
			if(highNumberIntBlack == 12) {
				System.out.println("Black wins. - with high card: Queen");
			}
			if(highNumberIntBlack == 13) {
				System.out.println("Black wins. - with high card: King");
			}
			if(highNumberIntBlack == 14) {
				System.out.println("Black wins. - with high card: Ace");
			}else
			System.out.println("Black wins. - with high card: " + highNumberIntBlack);
			} else{
				if(highNumberIntWhite == 11) {
					System.out.println("White wins. - with high card: Jack");
				}
				if(highNumberIntWhite== 12) {
					System.out.println("White wins. - with high card: Queen");
				}
				if(highNumberIntWhite == 13) {
					System.out.println("White wins. - with high card: King");
				}
				if(highNumberIntWhite == 14) {
					System.out.println("White wins. - with high card: Ace");
				}else
				System.out.println("White wins. - with high card: " + highNumberIntWhite);
				
			}
		}
}
