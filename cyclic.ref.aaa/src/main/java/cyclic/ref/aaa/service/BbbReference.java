package cyclic.ref.aaa.service;

import cyclic.ref.bbb.bean.Bbb;

public class BbbReference {

	public static void printBbb(Bbb bbb) {
		System.out.println(bbb);
	}
	
	public static void main(String[] args) {
		printBbb(new Bbb(11, 12));
	}
}
