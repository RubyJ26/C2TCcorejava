package com.applicationframework;

import com.framework.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc {

	void bookproduct(float charges) {
		
	}
	public GSPrimeAcc(int accno, String accName, float charges, boolean isprime) {
		super(accno, accName, charges, isprime);
		// TODO Auto-generated constructor stub
		
		 {
			
        	System.out.println("Dear prime user, your product chrges are"  +charges);
		}
	}

}
