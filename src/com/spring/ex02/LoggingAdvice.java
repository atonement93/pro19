package com.spring.ex02;

import org.aopalliance.intercept.MethodInvocation;

public class LoggingAdvice {
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("[�޼��� ȣ�� �� : LogginAdvice");
		System.out.println(invocation.getMethod() + "�޼��� ȣ�� ��");

		Object object = invocation.proceed();

		System.out.println("[�޼��� ȣ�� �� : loggingAdvice");
		System.out.println(invocation.getMethod() + "�޼��� ȣ�� ��");
		return object;
	}
}
