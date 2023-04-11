package com.main;

import com.applicationframework.GSNormalAcc;
import com.applicationframework.GSShopfactory;

public class OnlineShopMain {

	public static void main(String[] args) {
		
		
		//a

 obj=new GSShopfactory();
		obj.getNewNormalAcc(101, "Jullie", 1000, 100);
		obj.getNewPrimeAcc(102, "John", 4500, true);
		
		//b
		GSPrimeAcc gsprime=new GSPrimeAcc(102, "John", 4500, true);
		gsprime.bookproduct();
		
		//c
		GSNormalAcc gsnormal=new GSNormalAcc(101, "Jullie", 1000, 100);
		//d
		gsnormal.bookproduct();
		
		//e
		gsnormal.toString();
		
		//e
		gsprime.toString();


	}

}
