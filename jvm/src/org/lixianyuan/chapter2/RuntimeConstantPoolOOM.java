package org.lixianyuan.chapter2;

/**
 * String.inner()�������õĲ���
 * 
 * @author ��Ԫ
 *
 */
public class RuntimeConstantPoolOOM {
	public static void main(String[] args) {
		String str1 = new StringBuilder("�����").append("���").toString();
		System.out.println(str1.intern() == str1);//true

		String str2 = new StringBuilder("ja").append("va").toString();
		System.out.println(str2.intern() == str2);//false
	}
}
