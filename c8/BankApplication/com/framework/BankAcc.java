package com.framework;

public class BankAcc {
	
	private int accNo;
	private String accName;
	protected float accBalance;


	public BankAcc(int accNo, String accName, float accBalance) {
		super();
		this.accNo = accNo;
		this.accName = accName;
		this.accBalance = accBalance;
	}
	
	public void withdraw() {
		
	}
	public void deposite() {
		
	}

	@Override
	public String toString() {
		return "BankAcc [accNo=" + accNo + ", accName=" + accName + ", accBalance=" + accBalance + "]";
	}
	
}
