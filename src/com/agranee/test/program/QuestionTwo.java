package com.agranee.test.program;

import com.agranee.test.vo.CoinVO;
import com.agranee.test.vo.SmartCoinJarVO;

public class QuestionTwo {

	//Keep track for coin added in the jar
	static SmartCoinJarVO smartCoinJarVO = new SmartCoinJarVO();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Coin object which will have type of coin added with the value
		CoinVO coinVO = new CoinVO();
		coinVO.setType("INR");
		coinVO.setValue(1.5f);

		//Check if the valid coin is added - Must be US coin (Dollar, Cent)
		addTheCoin(coinVO);

		//Print the total amount collected till now
		printCollectedAmount();

		// Empty the jar
		if(smartCoinJarVO.reset()) 
			System.out.println("Jar successfully reseted");
		else
			System.out.println("Error occurred while reseting the Jar");

		//Adding Valid coin
		coinVO = new CoinVO();
		coinVO.setType("USD");
		coinVO.setValue(1.5f);

		//Check if the valid coin is added - Must be US coin (Dollar, Cent)
		addTheCoin(coinVO);
		
		//Print the total amount collected till now
		printCollectedAmount();


	}

	static void addTheCoin(CoinVO coinVO) {
		if(isNotNullandEmpty(coinVO.getType()) && coinVO.getType().equals("USD")) {
			smartCoinJarVO.addTheCoin(coinVO.getValue());
		}else {
			System.out.println("Invalid coin");
		}
	}
	
	static void printCollectedAmount() {
		if(smartCoinJarVO.getMoneyCollected() > 0)
			System.out.println("Total Amount Collected in jar is : " + smartCoinJarVO.getMoneyCollected());
		else
			System.out.println("Jar is empty");
	}


	static boolean isNotNullandEmpty(String type) {
		if(type == null || type.isEmpty()) {
			return false;
		}else {
			return true;
		}
	}

}
