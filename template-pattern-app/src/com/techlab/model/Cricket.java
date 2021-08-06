package com.techlab.model;

public class Cricket extends Game{
	
	public void stopPlaying() {
		System.out.println("Cricket Game finished");
	}
	
	public void initialize() {
		System.out.println("Begin the  cricket game");
	}
	
	public void startPlaying() {
		System.out.println("Cricket Game started");
	}

}
