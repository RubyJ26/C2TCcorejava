package com.framework;

public class SavingAcc extends BankAcc {
	

	private boolean issalaried;
	private static float MINBAL = 0;

	
	public SavingAcc(int accNo, String accName, float accBalance, boolean issalaried) {
		super(accNo, accName, accBalance);
		this.issalaried = issalaried;
	}
	
	public void  withdraw() {		
	}
	
	@Override
	public String toString() {
		return "SavingAcc [issalaried=" + issalaried + ", MINBAL=" + MINBAL + "]";
	}

	
}
