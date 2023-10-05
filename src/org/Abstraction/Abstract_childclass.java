package org.Abstraction;

public class Abstract_childclass extends Partial_Abstract {

	@Override
	public void bankinfo(int Atmpin) {
		System.out.println("Atmoin number is ;"+Atmpin);
		
	}
	public static void main(String[] args) {
		Abstract_childclass v = new Abstract_childclass();
		v.bankinfo("HDFC");
		v.bankinfo(123456789l);
		v.bankinfo(12345);
		System.out.println("Prakash sir is cute");
	}
	

}
