package org.Abstraction;

public abstract class Partial_Abstract {
	public void bankinfo(String Bankname) {
		System.out.println("bank name is ;"+Bankname);
	}
	public void bankinfo(long Accountnumber) {
		System.out.println("bank Accountnumber is ;"+Accountnumber);
	}
	public abstract void bankinfo(int Atmpin);
	}


