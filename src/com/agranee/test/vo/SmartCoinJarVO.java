package com.agranee.test.vo;

public class SmartCoinJarVO {

	float counter = 0.0f;
	
	public void addTheCoin(float money){
		counter = counter + money;
	}
	
	public float getMoneyCollected() {
		return counter;
	}
	
	/*
	 * Here we are returning boolean value
	 * For this try catch will not generate any exceptions
	 * It may be helpful when we have complex logic/code
	 */
	/**
	 * @return boolean
	 */
	public boolean reset() {
		try {
		counter = 0.0f;
		}catch(Exception e) {
			return false;
		}
		return true;
	}
}
