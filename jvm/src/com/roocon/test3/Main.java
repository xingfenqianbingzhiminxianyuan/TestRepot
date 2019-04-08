package com.roocon.test3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Main extends JFrame{
	private JButton jb;
	public Main() {
		this.setBounds(200, 220, 400, 200);
		this.setTitle("lambda测试");
		jb = new JButton("click");
		/*jb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("clicked");
			}
		});*/
		
		//用lambda表达式来做
		jb.addActionListener(event -> System.out.println("Hello"));
		
		this.add(jb);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Main();
	}
}
