package cn.icloudit.reflect.demo01;

import org.junit.Test;

import cn.icloudit.reflect.demo01.entity.Student;



/**
 * ���Ƿ��������
 * @author Administrator
 *
 */
public class ClassDemo1 {

	@Test
	public void demo1() throws ClassNotFoundException {
		//1.ʹ��Class.forName()��ȡClassʵ��������Ϊclass�ǹؼ��֣�������������Ϊclazz
		Class clazz1 = Class.forName("cn.icloudit.reflect.demo01.entity.Student");
		
		//2.ͨ����ľ�̬����class����ȡClassʵ������
		Class clazz2 = Student.class;
		
		//3.ͨ�������getClass()������ȡClassʵ������
		/*
		 * Student s = new Student(); Class clazz3 = s.getClass();
		 */
		
		//������������Classʵ�������Ƿ�Ϊͬһ�����󣺽��true
		System.out.println(clazz1 == clazz2);
		/*
		 * System.out.println(clazz2 == clazz3); System.out.println(clazz1 == clazz3);
		 */
	}

}
