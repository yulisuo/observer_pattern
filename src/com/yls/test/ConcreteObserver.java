package com.yls.test;

public class ConcreteObserver implements Observer {
	
	private String observerState;
	
	@Override
	public void upadate(String newState) {
		observerState = newState;
		System.out.println("ConcreteObserver new state:"+newState);
	}

}
