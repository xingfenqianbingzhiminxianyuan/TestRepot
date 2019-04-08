package org.lixianyuan.chapter2;
/**
 * VM Args: -Xss2M 
 * 创建线程导致内存溢出异常。这个会导致操作系统死机
 */
public class JavaVMStackOOM {
	private void dontStop(){
		while(true){
			
		}
	}
	public void stackLeakByThread(){
		while(true){
			Thread thread = new Thread(new Runnable(){
				@Override
				public void run() {
					dontStop();
				}
			});
			thread.start();
		}
	}
	public static void main(String[] args) {
		JavaVMStackOOM oom = new JavaVMStackOOM();
		oom.stackLeakByThread();
	}
}
