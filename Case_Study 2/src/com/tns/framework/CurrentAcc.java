package com.tns.framework;

public abstract class CurrentAcc extends BankAcc {
	
	protected final float creditLimit = 10000;

	public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit)
	{
		super(accNo, accNm, accBal);	
	}

	public float getCreditLimit() {
		return creditLimit;
	}

	public void withdraw(float AccBal) 
	{
		System.out.println("Amount Balance is :" + creditLimit);
	}

	@Override
	public String toString() {
		return "CurrentAcc [creditLimit=" + creditLimit + ", getCreditLimit()=" + getCreditLimit() + ", getAccNo()="
				+ getAccNo() + ", getAccNm()=" + getAccNm() + ", getAccBal()=" + getAccBal() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
}
