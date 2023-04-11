package com.applicationframework;

import com.framework.BankFactory;
import com.framework.CurrentAcc;
import com.framework.SavingAcc;

public class MMBankFactory implements BankFactory {
	
	

	@Override
	public CurrentAcc getNewCurrentAcc(int accNo, String accName, float accBalance, float creaditLimit) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SavingAcc getNewSavingAcc(int accNo, String accName, float accBalance, boolean isprime) {
		// TODO Auto-generated method stub
		return null;
	}
}