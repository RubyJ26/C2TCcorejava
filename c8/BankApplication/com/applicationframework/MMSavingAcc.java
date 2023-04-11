package com.applicationframework;

import com.framework.SavingAcc;

public class MMSavingAcc extends SavingAcc{

	void withdraw (float MINBAL){		
		
	}
	

	@Override
	public String toString() {
		return "MMSavingAcc []";
	}


	public MMSavingAcc(int accNo, String accName, float accBalance, boolean issalaried) {
		super(accNo, accName, accBalance, issalaried );

		{
	
	
	System.out.println("Dear Saving user, your Account Balance are"  + accBalance);
	}

  }
}