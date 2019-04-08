package com.roocon.test9d;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.next();

		new Thread(new Runnable() {

			@Override
			public void run() {
				while (true) {

				}
			}
		}).start();

		new Thread(new Runnable() {
			@Override
			public void run() {
				synchronized (Main.class) {
					try {
						wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}).start();

	}
}
