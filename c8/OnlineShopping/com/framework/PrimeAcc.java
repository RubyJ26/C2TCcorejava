package com.framework;

	public class PrimeAcc extends ShopAcc{
		
		public boolean isprime;
		
		
		
		public PrimeAcc(int accno, String accName, float charges, boolean isprime) {
			super(accno, accName, charges);
			this.isprime = isprime;
		}

		 public void bookproduct() {	
		}

		@Override
		public String toString() {
			return "PrimeAcc [isprime=" + isprime + "]";
		}
	  
		
	
}
