package com.dragon.design.pattern.visitor;

import java.util.ArrayList;
import java.util.Collection;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Visitor visitor = new ConcreteVisitor();
		StringElement stringE = new StringElement("I am a String");
		visitor.visitString(stringE);
		stringE.accept(visitor);

		Collection<Visitable> list = new ArrayList<Visitable>();
		list.add(new StringElement("I am a String 1"));
		list.add(new StringElement("I am a String 2"));
		list.add(new FloatElement(new Float(12.45)));

		visitor.visitCollection(list);
	}

}
