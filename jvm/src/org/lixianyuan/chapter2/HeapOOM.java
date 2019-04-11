package org.lixianyuan.chapter2;

import java.util.ArrayList;
import java.util.List;

/**
 * 把注释去掉了
 */
public class HeapOOM {
	static class OOMObject{
	  //哈哈哈	
	}
	
	public static void main(String[] args) {
		List<OOMObject> list = new ArrayList<OOMObject>();
		while(true){
			list.add(new OOMObject());
		}
	}
}
