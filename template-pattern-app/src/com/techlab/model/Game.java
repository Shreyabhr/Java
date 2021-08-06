package com.techlab.model;

public abstract class Game {
	
	public abstract void initialize();
	public abstract void startPlaying();
	public abstract void stopPlaying();
	
	public final void play() {
		initialize();
		startPlaying();
		stopPlaying();
	}

}
