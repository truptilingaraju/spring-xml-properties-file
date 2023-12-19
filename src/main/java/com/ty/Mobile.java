package com.ty;

public class Mobile {

	private int cost;
	private String name;
	
	public Mobile(int cost, String name) {
		this.cost=cost;
		this.name=name;
	}

	@Override
	public String toString() {
		return "Mobile [cost=" + cost + ", name=" + name + "]";
	}
	
	
}
