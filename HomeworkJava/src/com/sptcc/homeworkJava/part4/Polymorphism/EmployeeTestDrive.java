package com.sptcc.homeworkJava.part4.Polymorphism;

import java.util.ArrayList;

public class EmployeeTestDrive {
	public static void main(String [] args) {
		Employee[] employees = new Employee[3];
		
		for (int i = 0; i < employees.length; i++) {
			employees[i] = new Employee(i+1, "TH"+(i+1)*100000, (i+1)*10000, null);
			System.out.printf("EmployeeID:%d; Salary:%d; CitizenID:%s\n", employees[i].employeeId, employees[i].getSalary(), employees[i].citizenId);
		}
		System.out.println("********************");
		
		//BEFORE CONSTRUCTOR OVERLOADING
		System.out.println("BEFORE CONSTRUCTOR OVERLOADING");
		
		Employee e000000 = new Employee();
		e000000.setName("John", "Doe");
		e000000.hello();
		System.out.printf("EmployeeID:%d; CitizenId:%s; Name:%s; Position:%s; Salary:%d\n", e000000.employeeId, e000000.citizenId, e000000.getFullname(), e000000.getPosition(), e000000.getSalary());
		e000000.checkPosition();
		System.out.println("********************");
		
		//AFTER CONSTRUCTOR OVERLOADING
		System.out.println("AFTER CONSTRUCTOR OVERLOADING");
		
		Employee e000001 = new Employee(777, "TH200001", 20000, "CatCaretaker");
		e000001.setName("John", "Doe");
		e000001.hello();
		System.out.printf("EmployeeID:%d; CitizenId:%s; Name:%s; Position:%s; Salary:%d\n", e000001.employeeId, e000001.citizenId, e000001.getFullname(), e000001.getPosition(), e000001.getSalary());
		e000001.checkPosition();
		System.out.println("********************");
		
		Employee e000002 = new Employee(778, "TH200002",30000, "Tester");
		e000002.setName("Jane", "Doe");
		e000002.hello();
		System.out.printf("EmployeeID:%d; CitizenId:%s; Name:%s; Position:%s; Salary:%d\n", e000002.employeeId, e000002.citizenId, e000002.getFullname(), e000002.getPosition(), e000002.getSalary());
		e000002.checkPosition();
		System.out.println("********************");
		
		Programmer e000003 = new Programmer(779, "TH200003",40000, "Programmer");
		e000003.setName("Johnny", "Roe");
		e000003.hello();
		System.out.printf("EmployeeID:%d; CitizenId:%s; Name:%s; Position:%s; Salary:%d\n", e000003.employeeId, e000003.citizenId, e000003.getFullname(), e000003.getPosition(), e000003.getSalary());
		e000003.checkPosition();
		e000003.createWebsite("WordPress", "Cat e-Commerce Store");
		e000003.installWindows("3.1", "12345-67890-09876-54321");
		System.out.println("********************");
		
		System.out.println("AFTER hello() METHOD OVERRIDING");
		
		Ceo e000004 = new Ceo(780, "TH200004",50000, "CEO");
		e000004.setName("Baby", "Doe");
		e000004.hello();
		System.out.printf("EmployeeID:%d; CitizenId:%s; Name:%s; Position:%s; Salary:%d\n", e000004.employeeId, e000004.citizenId, e000004.getFullname(), e000004.getPosition(), e000004.getSalary());
		e000004.checkPosition();
		System.out.println("********************");
		
		
		System.out.println("\n********************");
		System.out.println("\n Polymorphism Lab \n");
		System.out.println("********************\n");
		
		
		Employee dang = new Employee(781, "TH200005", 60000, "JackOfAllTrades");
		Employee ceo = new Ceo(782, "TH200006",70000, "CEO");
		Programmer prog = new Programmer(783, "TH200003",80000, "Programmer");
		ceo.setName("Jane", "PolyDoism");
		Ceo ceo2 = (Ceo) ceo;
		
		ArrayList<Employee> myList = new ArrayList<>();
		myList.add(ceo2);
		myList.add(dang);
		myList.add(prog);
		
		Ceo ceo3 = (Ceo) myList.get(0);
		Employee dang2 = myList.get(1);
		Programmer prog2 = (Programmer) myList.get(2);
				   ceo3.hello();
				   prog2.hello();
				   
		System.out.println("\n********************");
		System.out.println("\n Interface Casting Lab \n");
		System.out.println("********************\n");
		
		Ceo ceoo = new Ceo(784, "TH200004",90000, "CEO");
		IWebsiteCreator gang = new Programmer(785, "TH200005",100000, "Programmer");
		Programmer gang2 = (Programmer) gang;
		Ai alphaGo = new Ai("alphaGo","Java");
		IWebsiteCreator alphaGo2 = alphaGo;
					
		ceoo.orderWebsite(gang); 
		ceoo.orderWebsite(gang2);
		ceoo.orderWebsite(alphaGo);
		ceoo.orderWebsite(alphaGo2);
//		
	}

}
