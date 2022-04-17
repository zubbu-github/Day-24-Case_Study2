package com.tns.application;

import com.tns.framework.SavingAcc;

public class MMSavingAcc extends SavingAcc {
	
	private static final float minbal = 500;
	
	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal, isSalaried);
	}

	public static float getMinbal() {
		return minbal;
	}
	
	public void withdraw(float AccBal)
	{
		System.out.println("Dear Saving User, Your Account Balance is: "+ AccBal);
	}

	@Override
	public String toString() {
		return "MMSavingAcc []";
	}

}
