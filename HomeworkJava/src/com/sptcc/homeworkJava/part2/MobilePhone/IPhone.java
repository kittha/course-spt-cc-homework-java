package com.sptcc.homeworkJava.part2.MobilePhone;

abstract class IPhone extends MobilePhone {
	
	public IPhone(int assetId) {
		super(assetId);
	}
		
	public void appStore() {
		System.out.println("iPhone: AppStore loaded!");
	}

}
