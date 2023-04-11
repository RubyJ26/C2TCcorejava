package com.applicationframework;

import com.framework.NormalAcc;

public class GSNormalAcc extends NormalAcc {
	
	void bookproduct(float charges) {
		
	}

	
	public GSNormalAcc(int accno, String accName, float charges, float deliverycharge) {
		super(accno, accName, charges, deliverycharge);
		// TODO Auto-generated constructor stub
{
			
			 System.out.println("Dear Normal user, your product charges are" +charges+ "with deliverytcharges" + deliverycharge );
		}
	}
	

}
