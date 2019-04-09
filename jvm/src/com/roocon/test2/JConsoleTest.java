package com.roocon.test2;

import java.util.ArrayList;
import java.util.List;

/**
 * VM参数： -Xms100m -Xmx100m -XX:+UseSerialGC 
 * 这段代码的作用是：以128KB/1000毫秒的速度往Java堆中填充数据，一共填充1000次，使用jconsole的“内存”页签进行监视，观察曲线和柱状指示图的变化。
 *asdfsadfsadfasdfsadfasdfasdf
 *
 */
public class JConsoleTest {
	public byte[] b1 = new byte[128 * 1024];

	public static void main(String[] args) {
		System.out.println("helo helel");
		fill(1000);
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
