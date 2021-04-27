package com.sptcc.homeworkJava.part4.Polymorphism;

public class Ai implements IWebsiteCreator {
	public String name;
	public String language;

	public Ai(String nameInput, String languageInput) {
	this.name = nameInput;
	this.language = languageInput;
	}

	public void createWebsite(String template, String titleName) {
		System.out.println("AI:" + language + " automated Setup template: " + template);
		System.out.println("AI:" + language + " automated Set Title name: " + titleName);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
//		return super.toString();
		return this.name + ", " + this.language;
	}

	@Override
	public void orderWebsite(IWebsiteCreator creator) {
		// TODO Auto-generated method stub
		
	}
}
