package com.roocon.test8;

public class StackAllocation {
	public StackAllocation obj;
	
	/**
	 * ��������StackAllocation���󣬷�������
	 * @return
	 */
	public StackAllocation getInstance(){
		return obj==null?new StackAllocation():obj;
	}
	
	/**
	 * Ϊ��Ա���Ը�ֵ����������
	 */
	public void setObj(){
		this.obj = new StackAllocation();
	}
	
	/**
	 * �������������ڵ�ǰ��������Ч��û�з�������
	 */
	public void useStackAllocation(){
		StackAllocation s = new StackAllocation();
	}
	
	/**
	 * ���ó�Ա������ֵ����������
	 */
	public void useStackAllocation2(){
		StackAllocation s = getInstance();
	}
	
}
