package com.xworkz.things;

public class Government {

	private String state;
	private int noOfMlas;
	private String partyHeadName;
	private String homeMinsterName;

	public Government(String state, int noOfMlas) {
		super();
		this.state = state;
		this.noOfMlas = noOfMlas;
	}

	public Government(String partyHeadName, String homeMinsterName) {
		super();
		this.partyHeadName = partyHeadName;
		this.homeMinsterName = homeMinsterName;
	}
	
	public void mudrana() {
		System.out.println("State : "+state);
		System.out.println("No of MLAs : "+noOfMlas);
		System.out.println("Party Head Name : "+partyHeadName);
		System.out.println("Home Minister Name : "+homeMinsterName);

	}

}
