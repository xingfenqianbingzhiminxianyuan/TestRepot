package com.roocon.test9;

/**
 * VM������-verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8
 * -XX:MaxTenuringThreshold=15 -XX:+PrintTenuringDistribution
 */
public class Main {
	private static final int _1MB = 1024 * 1024;

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		byte[] allocation1, allocation2, allocation3;
		allocation1 = new byte[_1MB / 4];
		// ʲôʱ����������ȡ����XX��MaxTenuringThreshold����
		allocation2 = new byte[4 * _1MB];
		allocation3 = new byte[4 * _1MB];
		allocation3 = null;
		allocation3 = new byte[4 * _1MB];
	}
}
