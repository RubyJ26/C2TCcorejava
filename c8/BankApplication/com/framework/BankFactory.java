package com.framework;

public interface BankFactory {

	
    public SavingAcc getNewSavingAcc(int accNo, String accName, float accBalance , boolean isprime);
	
	public CurrentAcc getNewCurrentAcc(int accNo, String accName, float accBalance, float creaditLimit);
	

}
