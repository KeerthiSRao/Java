package com.xworkz.things;

public class Train {

	private int no;
	private String source;
	private String destination;

	public Train(String source, String destination) {
		super();
		this.source = source;
		this.destination = destination;
	}

	public Train(int no, String source, String destination) {
		super();
		this.no = no;
		this.source = source;
		this.destination = destination;
	}

	public void mudrana() {
		System.out.println("No : "+no);
		System.out.println("Source : "+source);
		System.out.println("Destination : "+destination);

	}
}
