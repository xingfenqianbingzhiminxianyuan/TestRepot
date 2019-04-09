package com.roocon.test2;

import java.util.ArrayList;
import java.util.List;

/**
 * VM鍙傛暟锛� -Xms100m -Xmx100m -XX:+UseSerialGC 
 * 杩欐浠ｇ爜鐨勪綔鐢ㄦ槸锛氫互128KB/1000姣鐨勯�熷害寰�Java鍫嗕腑濉厖鏁版嵁锛屼竴鍏卞～鍏�1000娆★紝浣跨敤jconsole鐨勨�滃唴瀛樷�濋〉绛捐繘琛岀洃瑙嗭紝瑙傚療鏇茬嚎鍜屾煴鐘舵寚绀哄浘鐨勫彉鍖栥��
 *asdfsadfsadfasdfsadfasdfasdf
 *
 */
public class JConsoleTest {
	public byte[] b1 = new byte[128 * 1024];

	public static void main(String[] args) {
		System.out.println("helo helel");
		
		//在本地仓库中修改
	}

	private static void fill(int n) {
		List<JConsoleTest> jlist = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			try {
				Thread.sleep(1000123);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			jlist.add(new JConsoleTest());
		}
		System.gc();
	}
}
