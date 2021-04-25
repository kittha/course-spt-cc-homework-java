package com.sptcc.homeworkJava.part2.MobilePhone;

public class MobilePhone {
	public int assetId;
	public String branchLocation;
	public String division;
	public String username;
	public int phoneNumber;
	
	public MobilePhone (int assetId) {
		this.assetId = assetId;
	}
	
	public void makePhoneCall() {
		System.out.println("MobilePhone: Making a phone call. Beep... Beep...");
	}
	
	public void sentSMS() {
		System.out.println("MobilePhone: Ding! Your SMS has been sent.");
	}
	
	public void internetSurfing() {
		System.out.println("MobilePhone: SYN,SYN-ACK,ACK,418");
	}
	
	public void setBranchLocation(String location) {
		branchLocation = location;
	}
	
	public void setDivision(String divisionName) {
		division = divisionName;
	}
	
	public void setUser(String user) {
		username = user;
	}
}
