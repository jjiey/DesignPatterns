package com.bigTalkDesignPatterns.FactoryPattern;

/**
 * 乘法
 * 
 * @author clarck
 * 
 */
public class OperationMul extends Operation {

	@Override
	public double getResult() {
		double result = getNumberA() * getNumberB();
		return result;
	}

}
