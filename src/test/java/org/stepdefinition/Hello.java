package org.stepdefinition;

import org.base.BaseClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hello extends BaseClass{
	@Before
	public void precondition1() {
		launchbrowser();
		System.out.println("launched");
		

	}
	@Before
	public void precondition2() {
		windowmaximize();
		System.out.println("maximized");

	}
	
	
	
	
	
	@After
	public void postcondition2() {
		System.out.println("success");

	}
	
	@After
	public void postcondition1() {
		closebrowser();
		System.out.println("closed");

	}


}
