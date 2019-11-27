package com.bridgelabz.model;

public class Inventory {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	private int weight;
	private int price;

	@Override
	public String toString() {

		return name + "," + weight + "," + price;
	}

}
