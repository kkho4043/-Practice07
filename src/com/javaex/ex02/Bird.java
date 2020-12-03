package com.javaex.ex02;

public abstract class Bird {
    private String name;
    
	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}
	protected abstract void fly();

	protected abstract void sing();

	protected abstract void showName();
	


}
