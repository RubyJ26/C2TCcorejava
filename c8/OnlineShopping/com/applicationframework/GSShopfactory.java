package com.applicationframework;

import com.framework.NormalAcc;
import com.framework.PrimeAcc;
import com.framework.Shopfactory;

public class GSShopfactory implements Shopfactory{

	@Override
	public PrimeAcc getNewPrimeAcc(int accno, String accname, float charges, boolean isprime) {
		GSPrimeAcc gsprime=new GSPrimeAcc(accno,accname,charges,isprime);
		return gsprime;
	}

	@Override
	public NormalAcc getNewNormalAcc(int accno, String accname, float charges, float deliverycharge) {
		GSNormalAcc gsnormal=new GSNormalAcc(accno,accname,charges,deliverycharge);
		return gsnormal;
	}


}
