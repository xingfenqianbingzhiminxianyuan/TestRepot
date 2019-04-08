package com.roocon.test9b;

import java.util.Map;

/**
 * 打印出虚拟机中所有线程的信息
 * @author 贤元
 *
 */
public class Main {
	public static void main(String[] args) {
		//java.lang.Thread类新增了一个getAllStackTraces()方法用于获取虚拟机中所有线程的StackTraceElement对象
		Map<Thread,StackTraceElement[]> m = Thread.getAllStackTraces();
		for(Map.Entry<Thread, StackTraceElement[]> en : m.entrySet()){
			Thread t = en.getKey();
			StackTraceElement[] v = en.getValue();
			
			System.out.println("Thread name is "+ t.getName());
			for(StackTraceElement s: v){
				System.err.println("\t" + s.toString());
			}
		}
	}
}
