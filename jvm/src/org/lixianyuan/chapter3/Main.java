package org.lixianyuan.chapter3;
/**
 * VM参数：  -verbose:gc  -XX:+PrintGCDetails  -XX:+UseSerialGC  -Xms20M  -Xmx20M -Xmn10M -XX:SurvivorRatio=8
 * @author 贤元
 *
 */
public class Main {
	public static void main(String[] args) {
		byte[] b1 = new byte[2*1024*1024];
		byte[] b2 = new byte[2*1024*1024];
		byte[] b3 = new byte[2*1024*1024];
		byte[] b4 = new byte[4*1024*1024];
		
		System.gc();//手动调用GC
	}
}
