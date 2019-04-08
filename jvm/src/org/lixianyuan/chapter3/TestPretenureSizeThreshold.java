package org.lixianyuan.chapter3;
/**
 * VM参数：-verbose:gc   -XX:+PrintGCDetails    -XX:+UseSerialGC   -XX:SurvivorRatio=8                                      
 * 				-Xms20M -Xmx20M -Xmn10M -XX:PretenureSizeThreshold=6M
 * @author 贤元
 *
 */
public class TestPretenureSizeThreshold {
	
	private static final int _1MB = 1024*1024;
	
	public static void main(String[] args) {
		byte[] allocation = new byte[7 * _1MB];// 直接分配在老年代中
	}
}
