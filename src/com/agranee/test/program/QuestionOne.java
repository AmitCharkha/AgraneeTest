package com.agranee.test.program;

public class QuestionOne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Land stretch integer
		int[] landStretch =  { 2, 3, 5, 8, 4, 7, 3 };

		// Output
		System.out.println(getNoOfCastleCount(landStretch) +" castle can be build on provided land");
	}

	/*
	 * This function will return no of castle can be build on stretch of land
	 */
	static int getNoOfCastleCount(int landStretch[]) {
		//This variable used to count the no of castles
		int castle = 1;
		//This will help to keep track of upward and downward directions
		int isGoingUpward = -1;

		if(landStretch == null || landStretch.length == 0) 
			//return 0 if landStretch array is null or empty
			return 0;
		else if(landStretch.length == 1) 
			// return 1 if array is one
			return castle;
		
		for(int i = 0; i < landStretch.length; i++) {
			if(i == landStretch.length - 1) {
				if(landStretch[i - 1] < landStretch[i]) {
					if(isGoingUpward == 1) 
						castle++;
				}else if(landStretch[i - 1] > landStretch[i]) {
					if(isGoingUpward == 0) 
						castle++;
				}
			}else {
				if(landStretch[i] < landStretch[i + 1]) {
					if(isGoingUpward == 0) 
						castle++;

					isGoingUpward = 1;
				}else if(landStretch[i] > landStretch[i + 1]) {
					if(isGoingUpward == 1) 
						castle++;

					isGoingUpward = 0;
				}
			}
		}
		return castle;
	}

}
