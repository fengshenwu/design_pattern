package com.dragon.design.pattern.visitor;

/**
 * @author dragon.caol
 */
public interface Visitable {
	public void accept(Visitor visitor);
}
