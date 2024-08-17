package edu.shop.f1fan.entity;

import java.util.Objects;

public class Good {
	private String type;
	private String team;
	private double price;
	private int size;

	public Good() {
	}

	public Good(String type, String team, double price, int size) {
		this.type = type;
		this.team = team;
		this.price = price;
		this.size = size;
	}

	public Good(String type, double price, int size) {
		this.type = type;
		this.price = price;
		this.size = size;
	}

	public Good(String type, double price) {
		this.type = type;
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public int hashCode() {
		return Objects.hash(team, type, price, size);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Good other = (Good) obj;
		return Objects.equals(team, other.team) && Objects.equals(type, other.type)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price) && size == other.size;
	}

	@Override
	public String toString() {
		return getClass().getName() + " Тип [_" + type + "_], команда - " + team + ", цена = " + price
				+ ", размер - " + size + "\'.";
	}
}


