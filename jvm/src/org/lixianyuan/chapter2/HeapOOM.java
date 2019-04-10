package org.lixianyuan.chapter2;

import java.util.ArrayList;
import java.util.List;

/**
 * 修改了注释
 */
public class HeapOOM {
	static class OOMObject{
		
	}
	
	public static void main(String[] args) {
		List<OOMObject> list = new ArrayList<OOMObject>();
		while(true){
			list.add(new OOMObject());
		}
	}
}
