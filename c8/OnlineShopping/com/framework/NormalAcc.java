package com.framework;
		
public class NormalAcc extends ShopAcc {
	
	public float deliverycharge;
	
	public NormalAcc(int accno, String accName, float charges, float deliverycharge) {
		super(accno, accName, charges);
		this.deliverycharge = deliverycharge;
	}

     public void bookproduct() {	
	}

	@Override
	public String toString() {
		return "NormalAcc [deliverycharge=" + deliverycharge + ", accno=" + accno + ", accName=" + accName
				+ ", charges=" + charges + "]";
	}
}