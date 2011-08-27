package com.dragon.design.pattern.visitor;

import java.util.Collection;
import java.util.Iterator;

public class ConcreteVisitor implements Visitor {

	@Override
	public void visitString(StringElement stringE) {
		System.out.println("''''" + stringE.getValue() + "''''");
	}

	@Override
	public void visitFloat(FloatElement floatE) {
		System.out.println(floatE.getValue().toString() + "f");

	}

	@Override
	public void visitCollection(Collection<Visitable> collection) {
		Iterator<Visitable> iterator = collection.iterator();
		while (iterator.hasNext()) {
			Visitable o = iterator.next();
			o.accept(this);
		}

	}

}
