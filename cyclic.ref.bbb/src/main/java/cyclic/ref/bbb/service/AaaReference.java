package cyclic.ref.bbb.service;

import cyclic.ref.aaa.bean.Aaa;

public class AaaReference {

	public static void printAaa(Aaa aaa) {
		System.out.println(aaa);
	}
	
	public static void main(String[] args) {
		printAaa(new Aaa("gg", "9527"));
	}
}
