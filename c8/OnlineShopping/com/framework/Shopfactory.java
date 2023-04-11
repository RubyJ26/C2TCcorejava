package com.framework;

public interface Shopfactory {

	public PrimeAcc getNewPrimeAcc(int accno, String accname, float charges, boolean isprime);
	
	public NormalAcc getNewNormalAcc(int accno, String accname, float charges, float deliverycharges);
	

}
