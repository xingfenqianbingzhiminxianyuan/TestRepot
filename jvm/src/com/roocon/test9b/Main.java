package com.roocon.test9b;

import java.util.Map;

/**
 * ��ӡ��������������̵߳���Ϣ
 * @author ��Ԫ
 *
 */
public class Main {
	public static void main(String[] args) {
		//java.lang.Thread��������һ��getAllStackTraces()�������ڻ�ȡ������������̵߳�StackTraceElement����
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
