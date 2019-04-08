package org.lixianyuan.chapter3;
/**
 * testGC()����ִ�к�objA��objB�᲻�ᱻGC�أ�
 * @author ��Ԫ
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
		//���������з���GC��objA��objB�Ƿ��ܱ����գ� ��
		System.gc();
	}
	
	public static void main(String[] args) {
		testGC();
		System.out.println("ok");
	}
}
