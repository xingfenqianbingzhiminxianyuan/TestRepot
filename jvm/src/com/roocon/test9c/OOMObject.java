package com.roocon.test9c;

import java.util.ArrayList;
import java.util.List;

/**
 * VM������ -Xms100m -Xmx100m -XX:+UseSerialGC ��ʾʹ��Serial�����ռ���
 * 
 * ��δ���������ǣ���64/500������ٶ���Java����������ݣ�һ�����1000�Σ�ʹ��jconsole�ġ��ڴ桱ҳǩ���м��ӣ��۲����ߺ���״ָʾͼ�ı仯��
 * @author ��Ԫ
 *
 */
public class OOMObject {
	public byte[] placeholder = new byte[64*1024];
	
	public static void fillHeap(int num) throws InterruptedException{
		List<OOMObject> list = new ArrayList<OOMObject>();
		for(int i=0;i<num;i++){
			//������ʱ����������߱仯��������
			Thread.sleep(50);
			list.add(new OOMObject());
		}
		System.gc();
	}
	
	public static void main(String[] args) throws Exception {
		fillHeap(1000);
	}
}
