package com.bigTalkDesignPatterns.ChainOfResposibilityPattern;

/**
 * 处理者1
 *
 * @author yj
 *
 */
public class ConcrateHandler1 extends Handler {

	@Override
	public void handleRequest(int request) {
		if (request >= 0 && request < 10) {
			System.out.println(String.format("%s处理请求%d", this.getClass().getName(), request));
		} else if (successor != null) {
			successor.handleRequest(request);
		}
	}

}
