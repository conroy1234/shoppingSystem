package org.shopping.constants;
/*
 * constants to use through the application
 */
public enum ConstantsEnum {
	APPLE_COST("60"),ORANGE_COST("25"),APPLE("Apple"), ORANGE("Orange");
String name;
	private ConstantsEnum(String name) {
	this.name=name;	
	}
	
	public String toString() {
		return name;
	}
}
