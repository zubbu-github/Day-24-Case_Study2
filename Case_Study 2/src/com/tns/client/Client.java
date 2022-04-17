package com.tns.client;

import com.tns.application.MMBankFactory;
import com.tns.application.MMCurrentAcc;
import com.tns.application.MMSavingAcc;

public class Client {

	public static void main(String[] args) {
		
		MMBankFactory mmbfactory = new MMBankFactory();
		mmbfactory.getNewSavingAcc(12345, "Md Zubeir C", 3000, true);
		mmbfactory.getNewCurrentAcc(54321, "Gautam Gambhir ", 5000, 10000);
		
		MMSavingAcc mmsaving = new MMSavingAcc(12345, "Md Zubeir C", 3000, true);
		mmsaving.getAccNo();
		mmsaving.getAccNm();
		mmsaving.getAccBal();
		
		mmsaving.withdraw(3000);
		mmsaving.toString();
		
		MMCurrentAcc mmcurrent = new MMCurrentAcc(54321, "Gautam Gambhir ", 5000, 10000);
		mmcurrent.getAccNo();
		mmcurrent.getAccNm();
		mmcurrent.getAccBal();
		
		mmcurrent.withdraw(5000);
		mmcurrent.toString();
	}

}
