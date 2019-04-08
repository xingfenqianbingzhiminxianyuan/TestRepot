package com.roocon.test1;

import java.util.ArrayList;
import java.util.List;
//内存溢出问题的分析与解决
public class Main {
	public static void main(String[] args){
		List<Demo> list= new ArrayList<Demo>();
		
		while(true){
			list.add(new Demo());
		}
	}
}
