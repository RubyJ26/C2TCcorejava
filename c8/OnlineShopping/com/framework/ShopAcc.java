package com.framework;

public class ShopAcc {


	public int accno;
	public String accName;
	public float charges;
	
	public ShopAcc(int accno, String accName, float charges) {
		super();
		this.accno = accno;
		this.accName = accName;
		this.charges = charges;
	}

	void bookproduct() {
	}
	 
	void items() {		 
	 }

	@Override
	public String toString() {
		return "ShopAcc [accno=" + accno + ", accName=" + accName + ", charges=" + charges + "]";
	}
	 
	
	
}

