package org.lixianyuan.chapter3;
/**
 * testGC()方法执行后，objA和objB会不会被GC呢？
 * @author 贤元
 *
 */
public class ReferenceCountingGC {
	public Object instance = null;
	
	private static final int _1MB = 1024*1024;
	
	private byte[] bigSize = new byte[2* _1MB];
	
	public static void testGC(){
		ReferenceCountingGC objA= new ReferenceCountingGC();
		ReferenceCountingGC objB= new ReferenceCountingGC();
		
		objA.instance = objB;
		objB.instance = objA;
		
		objA = null;
		objB = null;
		//假设在这行发生GC，objA和objB是否能被回收？ 能
		System.gc();
	}
	
	public static void main(String[] args) {
		testGC();
		System.out.println("ok");
	}
}
