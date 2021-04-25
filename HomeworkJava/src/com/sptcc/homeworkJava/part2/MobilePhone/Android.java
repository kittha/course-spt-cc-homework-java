package com.sptcc.homeworkJava.part2.MobilePhone;

abstract class Android extends MobilePhone {
	
	public Android(int assetId) {
		super(assetId);
	}
		
	public void googlePlay() {
		System.out.println("Android: Google Play loaded!");
	}

}
