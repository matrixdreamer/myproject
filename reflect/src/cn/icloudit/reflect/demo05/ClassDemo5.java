package cn.icloudit.reflect.demo05;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.junit.Test;


import cn.icloudit.reflect.demo05.entity.Student;

public class ClassDemo5 {

	@Test
	public void demo01() throws Exception{
		//��ȡstudent�вι��캯��
		Constructor<Student> c = Student.class.getConstructor(String.class, int.class);
		//ʹ�ù��캯������ʵ��
		Student stu = c.newInstance("����",18);
		//��ȡClass����
		Class clazz = stu.getClass();

		//��ȡstu�������޲η���read
		Method m = clazz.getMethod("read");
		//����stu�������޲η���read
		m.invoke(stu);

		//��ȡstu�������вη���read
		Method m2 = clazz.getMethod("read", String.class);
		//����stu�������вη���read
		m2.invoke(stu, "JAVA�߼�");
		
		
	}
}
