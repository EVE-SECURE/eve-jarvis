package org.jarvis.db.model.inventory;

import org.jarvis.db.model.EveStatic;

public class Type implements EveStatic {
	private int typeID;
	private int groupID;
	private String typeName;
	private String description;
	private double mass;
	private double volume;
	private double capacity;
	private int portionSize;
	private int raceID;
	private double basePrice;
	private int published;
	private int marketGroupID;
	private int iconID;

	public int getTypeID() {
		return typeID;
	}
	public void setTypeID(int typeID) {
		this.typeID = typeID;
	}
	public int getGroupID() {
		return groupID;
	}
	public void setGroupID(int groupID) {
		this.groupID = groupID;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getMass() {
		return mass;
	}
	public void setMass(double mass) {
		this.mass = mass;
	}
	public double getVolume() {
		return volume;
	}
	public void setVolume(double volume) {
		this.volume = volume;
	}
	public double getCapacity() {
		return capacity;
	}
	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}
	public int getPortionSize() {
		return portionSize;
	}
	public void setPortionSize(int portionSize) {
		this.portionSize = portionSize;
	}
	public int getRaceID() {
		return raceID;
	}
	public void setRaceID(int raceID) {
		this.raceID = raceID;
	}
	public double getBasePrice() {
		return basePrice;
	}
	public void setBasePrice(double basePrice) {
		this.basePrice = basePrice;
	}
	public int getPublished() {
		return published;
	}
	public void setPublished(int published) {
		this.published = published;
	}
	public int getMarketGroupID() {
		return marketGroupID;
	}
	public void setMarketGroupID(int marketGroupID) {
		this.marketGroupID = marketGroupID;
	}
	public int getIconID() {
		return iconID;
	}
	public void setIconID(int iconID) {
		this.iconID = iconID;
	}
}
