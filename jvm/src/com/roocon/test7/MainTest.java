package com.roocon.test7;
/**
 * ���ü�����
 * @author ��Ԫ
 * VM Args:-verbose:gc -XX:+PrintGCDetails
 */
public class MainTest {
	private Object instatnce;
	public MainTest() {
		byte[] m = new byte[20*1024*1024];
	}
	public static void main(String[] args) {
		MainTest m1 = new MainTest();
		MainTest m2 = new MainTest();
		
		m1.instatnce = m2;
		m2.instatnce = m1;
		
		m1 = null;
		m2 = null;
		
		System.gc();//��������������
		
		//parallel JDKʹ�õ������ռ���
	}
}
