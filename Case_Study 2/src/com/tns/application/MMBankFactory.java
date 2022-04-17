package com.tns.application;

import com.tns.framework.BankFactory;
import com.tns.framework.CurrentAcc;
import com.tns.framework.SavingAcc;

public class MMBankFactory implements BankFactory {

	@Override
	public SavingAcc getNewSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried)
	{
		MMSavingAcc mmsaving = new MMSavingAcc(accNo, accNm, accBal, isSalaried);
		return mmsaving;
	}

	@Override
	public CurrentAcc getNewCurrentAcc(int accNo, String accNm, float accBal, float creditLimit)
	{
		MMCurrentAcc mmcurrent = new MMCurrentAcc(accNo, accNm, creditLimit, creditLimit);
		return mmcurrent;
	}

}
