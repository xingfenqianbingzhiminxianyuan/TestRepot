package org.lixianyuan.chapter2;

import java.util.ArrayList;
import java.util.List;

/**
 * ������������ʱ������� VM Args: -XX:PermSize=10M -XX:MaxPermSize=10M
 * 
 * @author ��Ԫ
 *
 */
public class RuntimeConstanPoolOOM {
	public static void main(String[] args) {
		
		// ʹ��List�����ų��������ã� ����Full GC���ճ�������Ϊ
		List<String> list = new ArrayList<String>();
		// 10MB��PermSize��integer��Χ���㹻����OOM��
		int i = 0;
		while (true) {
			list.add(String.valueOf(i++).intern());
		}

	}
}
