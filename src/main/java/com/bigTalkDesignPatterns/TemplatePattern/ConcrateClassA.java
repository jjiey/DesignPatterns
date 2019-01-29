package com.bigTalkDesignPatterns.TemplatePattern;

/**
 * 实现父类的一个或多个抽象方法
 * 
 * @author yj
 * 
 */
public class ConcrateClassA extends AbstractClass {

	@Override
	public void primitiveOperation1() {
		System.out.println("class A primitiveOperation1");
	}

	@Override
	public void primitiveOperation2() {
		System.out.println("class A primitiveOperation2");
	}

}
