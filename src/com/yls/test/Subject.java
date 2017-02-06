package com.yls.test;

import java.util.ArrayList;

public abstract class Subject {
	
	private ArrayList<Observer> observers = new ArrayList<Observer>();
	
	public void attach(Observer o){
		observers.add(o);
		System.out.println("observers add.");
	}
	
	public void detach(Observer o){
		observers.remove(o);
	}
	
	public void notifyObservers(String newState){
		for(Observer o:observers){
			o.upadate(newState);
		}
	}
}
