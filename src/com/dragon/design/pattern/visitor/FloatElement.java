package com.dragon.design.pattern.visitor;

public class FloatElement implements Visitable {

	public Float getValue() {
		return value;
	}

	private Float value;

	public FloatElement(Float value) {
		this.value = value;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visitFloat(this);
	}

}
