package com.tns.framework;

public abstract class BankAcc {
	
	private int AccNo;
	private String  AccNm;
	private float AccBal;
	
	public BankAcc(int accNo, String accNm, float accBal) {
		super();
		AccNo = accNo;
		AccNm = accNm;
		AccBal = accBal;
	}

	public int getAccNo() {
		return AccNo;
	}
	public void setAccNo(int accNo) {
		AccNo = accNo;
	}
	public String getAccNm() {
		return AccNm;
	}
	public void setAccNm(String accNm) {
		AccNm = accNm;
	}
	public float getAccBal() {
		return AccBal;
	}
	public void setAccBal(float accBal) {
		AccBal = accBal;
	}
	
	public void withdraw(float AccBal)
	{
		System.out.println("Amount withdrawn and balance is :" + AccBal);
	}
	
	public void deposit(float AccBal) {
		System.out.println("Deposited amount with balance is :" + AccBal);
	}

	@Override
	public String toString() {
		return "BankAcc [AccNo=" + AccNo + ", AccNm=" + AccNm + ", AccBal=" + AccBal + "]";
	}
	
}
