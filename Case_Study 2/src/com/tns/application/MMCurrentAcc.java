package com.tns.application;

import com.tns.framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc {

	public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal, creditLimit);
		
	}
	
	public void withdraw(float AccBal) 
	{
		System.out.println("Dear Current User, Your Account Balance is: "+ AccBal +
				" with Credit Limit is " + creditLimit);
	}

	@Override
	public String toString() {
		return "MMCurrentAcc [creditLimit=" + creditLimit + ", getCreditLimit()=" + getCreditLimit() + ", toString()="
				+ super.toString() + ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm() + ", getAccBal()="
				+ getAccBal() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	
}
