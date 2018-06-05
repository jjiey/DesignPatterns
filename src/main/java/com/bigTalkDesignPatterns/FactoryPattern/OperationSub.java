package com.bigTalkDesignPatterns.FactoryPattern;

/**
 * 减法类
 * 
 * @author clarck
 * 
 */
public class OperationSub extends Operation {

	@Override
	public double getResult() {
		double result = getNumberA() - getNumberB();
		return result;
	}

}
