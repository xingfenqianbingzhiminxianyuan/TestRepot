package org.lixianyuan.chapter4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	
	/**
	 * �߳���ѭ����ʾ
	 */
	public static void createBusyThread(){
		Thread thread = new Thread(new Runnable(){

			@Override
			public void run() {
				while(true){//��41��
					;
				}
			}
			
		},"testBusyThread");
		
		thread.start();
	}
	
	
	/**
	 * �߳����ȴ���ʾ
	 */
	public static void createLockThread(final Object lock){
		Thread thread = new Thread(new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				synchronized(lock){
					try {
						lock.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			
		},"testLockThread");
		
		thread.start();
	}
	
	
	public static void main(String[] args)throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		br.readLine();
		createBusyThread();
		br.readLine();
		
		Object obj = new Object();
		createLockThread(obj);
	}
	
}