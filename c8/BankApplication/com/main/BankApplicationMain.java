package com.main;

import com.applicationframework.MMBankFactory;
import com.applicationframework.MMCurrentAcc;
import com.applicationframework.MMSavingAcc;

public class BankApplicationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//a
		MMBankFactory obj=new MMBankFactory();
		obj.getNewCurrentAcc(101, "Jullie", 1500, 2000);
		obj.getNewSavingAcc(102, "John", 3000, true);
		
		//b
		MMSavingAcc mmsaving=new MMSavingAcc(102, "John", 3000, true);
	
		mmsaving.withdraw();
				
				//c
				MMCurrentAcc mmcurrent=new MMCurrentAcc(101, "Jullie", 1500, 2000);
				//d
				mmcurrent.withdraw();
				
				//e
				mmcurrent.toString();
				
				//e
				mmsaving.toString();
		
	}

}
