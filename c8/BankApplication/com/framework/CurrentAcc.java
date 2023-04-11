package com.framework;

public class CurrentAcc extends BankAcc {

	 protected float creditLimit;

	public CurrentAcc(int accNo, String accName, float accBalance, float creditLimit) {
		super(accNo, accName, accBalance);
		this.creditLimit = creditLimit;
	}
	 
	public void withdraw() {
	}

	@Override
	public String toString() {
		return "CurrentAcc [creditLimit=" + creditLimit + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}

}