package com.sptcc.homeworkJava.part4.Polymorphism;

public interface IWebsiteCreator {
	public void createWebsite(String template, String titleName);
	public void orderWebsite(IWebsiteCreator creator);
}
