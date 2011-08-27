package com.dragon.design.pattern.visitor;

public class StringElement implements Visitable {
	private String value;
	public StringElement(String value) {
		this.value = value;
	}
	public String getValue() {
		return this.value;
	}
	@Override
	public void accept(Visitor visitor) {
		visitor.visitString(this);
	}
}
