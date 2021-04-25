package com.sptcc.homeworkJava.part2.MobilePhone;

public class MobilePhoneTestDrive {
	public static void main(String [] args) {
		MobilePhone asset1 = new MobilePhone(1);
		asset1.setBranchLocation("THA");
		asset1.setDivision("IT");
		asset1.setUser("John Doe");
		System.out.printf("This asset ID is %d. Assigned to: 'Branch:%s, Division:%s, User:%s;'\n", asset1.assetId, asset1.branchLocation, asset1.division, asset1.username);
		asset1.makePhoneCall();
		asset1.sentSMS();
		asset1.internetSurfing();
		System.out.println("********************");
		
		IPhone8 asset2 = new IPhone8(2);
		asset2.setBranchLocation("JPN");
		asset2.setDivision("SE");
		asset2.setUser("Richard Roe");
		System.out.printf("This asset ID is %d. Assigned to: 'Branch:%s, Division:%s, User:%s;'\n", asset2.assetId, asset2.branchLocation, asset2.division, asset2.username);
		asset2.makePhoneCall();
		asset2.sentSMS();
		asset2.internetSurfing();
		asset2.appStore();
		asset2.touchId();
		System.out.println("********************");
		
		IPhoneX asset3 = new IPhoneX(3);
		asset3.setBranchLocation("GBR");
		asset3.setDivision("CR");
		asset3.setUser("Baby Doe");
		System.out.printf("This asset ID is %d. Assigned to: 'Branch:%s, Division:%s, User:%s;'\n", asset3.assetId, asset3.branchLocation, asset3.division, asset3.username);
		asset3.makePhoneCall();
		asset3.sentSMS();
		asset3.internetSurfing();
		asset3.appStore();
		asset3.faceId();
		System.out.println("********************");
		
		SamsungGalaxyS8 asset4 = new SamsungGalaxyS8(4);
		asset4.setBranchLocation("CHN");
		asset4.setDivision("QA");
		asset4.setUser("Janie Doe");
		System.out.printf("This asset ID is %d. Assigned to: 'Branch:%s, Division:%s, User:%s;'\n", asset4.assetId, asset4.branchLocation, asset4.division, asset4.username);
		asset4.makePhoneCall();
		asset4.sentSMS();
		asset4.internetSurfing();
		asset4.googlePlay();
		asset4.userGearVr();
		asset4.transformToPc();
		System.out.println("********************");
		
		SamsungGalaxyNote8 asset5 = new SamsungGalaxyNote8(5);
		asset5.setBranchLocation("ATA");
		asset5.setDivision("GG");
		asset5.setUser("Johnny Doe");
		System.out.printf("This asset ID is %d. Assigned to: 'Branch:%s, Division:%s, User:%s;'\n", asset5.assetId, asset5.branchLocation, asset5.division, asset5.username);
		asset5.makePhoneCall();
		asset5.sentSMS();
		asset5.internetSurfing();
		asset5.googlePlay();
		asset5.userGearVr();
		asset5.transformToPc();
		asset5.usePen();
		System.out.println("********************");
	}

}
