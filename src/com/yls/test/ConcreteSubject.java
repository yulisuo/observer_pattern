package com.yls.test;

public class ConcreteSubject extends Subject {
	
	private String state;

	public String getState(){
		return state;
	}
	
	public void change(String newState) {
		state = newState;
		System.out.println("ConcreteSubject new state:"+state);
		this.notifyObservers(state);
	}
}
