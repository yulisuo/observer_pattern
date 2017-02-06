package com.yls.test;

public class Client {

	public static void main(String[] args) {
		ConcreteSubject cs = new ConcreteSubject();
		ConcreteObserver co = new ConcreteObserver();
		cs.attach(co);
		cs.change("nnnnn");

	}

}
