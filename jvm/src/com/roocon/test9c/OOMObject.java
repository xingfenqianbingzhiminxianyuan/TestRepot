package com.roocon.test9c;

import java.util.ArrayList;
import java.util.List;

/**
 * VM参数： -Xms100m -Xmx100m -XX:+UseSerialGC 表示使用Serial垃圾收集器
 * 
 * 这段代码的作用是：以64/500毫秒的速度往Java堆中填充数据，一共填充1000次，使用jconsole的“内存”页签进行监视，观察曲线和柱状指示图的变化。
 * @author 贤元
 *
 */
public class OOMObject {
	public byte[] placeholder = new byte[64*1024];
	
	public static void fillHeap(int num) throws InterruptedException{
		List<OOMObject> list = new ArrayList<OOMObject>();
		for(int i=0;i<num;i++){
			//稍作延时，令监视曲线变化更加明显
			Thread.sleep(50);
			list.add(new OOMObject());
		}
		System.gc();
	}
	
	public static void main(String[] args) throws Exception {
		fillHeap(1000);
	}
}
