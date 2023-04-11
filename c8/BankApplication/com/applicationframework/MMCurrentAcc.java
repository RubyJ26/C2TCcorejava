package com.applicationframework;

import com.framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc   {

	void withdraw (float MINBAL) {
		
	}
	
	
	@Override
	public String toString() {
		return "MMCurrentAcc []";
	}


	public MMCurrentAcc(int accNo, String accName, float accBalance, float creaditLimit) {
		super(accNo, accName, accBalance, creaditLimit);
		// TODO Auto-generated constructor stub
	}
	
	{
		System.out.println("Dear Current user, your Account Balance are" + accBalance +  "with creditLimit"  + creditLimit);
	}
	
	}
	
	

