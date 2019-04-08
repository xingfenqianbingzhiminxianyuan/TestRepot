package com.roocon.test2;

import java.util.ArrayList;
import java.util.List;

/**
 * VM������ -Xms100m -Xmx100m -XX:+UseSerialGC 
 * ��δ���������ǣ���128KB/1000������ٶ���Java����������ݣ�һ�����1000�Σ�ʹ��jconsole�ġ��ڴ桱ҳǩ���м��ӣ��۲����ߺ���״ָʾͼ�ı仯��
 * @author ��Ԫ
 *
 */
public class JConsoleTest {
	public byte[] b1 = new byte[128 * 1024];

	public static void main(String[] args) {
		fill(1000);
	}

	private static void fill(int n) {
		List<JConsoleTest> jlist = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			jlist.add(new JConsoleTest());
		}
		System.gc();
	}
}
